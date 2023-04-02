import java.util.*;

public class BillSettlement {
    
    public static void main(String[] args) {
        
        // Bill data
        Bill lunch = new Bill("Lunch", 2000, "Balaji", Arrays.asList("Anand", "Balaji", "Chaitanya", "Divya"));
        Bill movieTicket = new Bill("Movie ticket", 1000, "Anand", Arrays.asList("Anand", "Balaji", "Chaitanya", "Divya"));
        Bill snacks = new Bill("Snacks", 750, "Chaitanya", Arrays.asList("Anand", "Balaji", "Chaitanya"));
        
        // List of people
        List<String> people = Arrays.asList("Anand", "Balaji", "Chaitanya", "Divya");
        
        // Calculate total amount and contribution for each person
        Map<String, Double> totalAmountMap = new HashMap<>();
        Map<String, Double> contributionMap = new HashMap<>();
        for (String person : people) {
            totalAmountMap.put(person, 0.0);
            contributionMap.put(person, 0.0);
        }
        
        for (Bill bill : Arrays.asList(lunch, movieTicket, snacks)) {
            double totalAmount = bill.getTotalAmount();
            String paidBy = bill.getPaidBy();
            List<String> sharedBy = bill.getSharedBy();
            int numPeople = sharedBy.size();
            double contribution = totalAmount / numPeople;
            
            // Update total amount and contribution for paidBy
            totalAmountMap.put(paidBy, totalAmountMap.get(paidBy) + totalAmount);
            contributionMap.put(paidBy, contributionMap.get(paidBy) + totalAmount - contribution);
            
            // Update contribution for sharedBy
            for (String person : sharedBy) {
                contributionMap.put(person, contributionMap.get(person) + contribution);
            }
        }
        
        // Print results
        for (String person : people) {
            double amountOwed = contributionMap.get(person);
            if (amountOwed > 0) {
                System.out.printf("%s owes %.2f to others\n", person, amountOwed);
            } else if (amountOwed < 0) {
                System.out.printf("%s is owed %.2f by others\n", person, -amountOwed);
            } else {
                System.out.printf("%s does not owe or is owed by others\n", person);
            }
        }
    }
}

class Bill {
    
    private String name;
    private double totalAmount;
    private String paidBy;
    private List<String> sharedBy;
    
    public Bill(String name, double totalAmount, String paidBy, List<String> sharedBy) {
        this.name = name;
        this.totalAmount = totalAmount;
        this.paidBy = paidBy;
        this.sharedBy = sharedBy;
    }
    
    public String getName() {
        return name;
    }
    
    public double getTotalAmount() {
        return totalAmount;
    }
    
    public String getPaidBy() {
        return paidBy;
    }
    
    public List<String> getSharedBy() {
        return sharedBy;
    }
}
