package Sales_Variance_Comparison;

//Code - 1:

public class SalesVariance {
    
    public static void main(String[] args) {
        
        // Sales data for 2021 and 2022
        double[] sales2021 = {100.0, 100.0, 75.0};
        double[] sales2022 = {120.0, 110.0, 100.0};
        
        // Calculate the mean of each year's sales data
        double mean2021 = calculateMean(sales2021);
        double mean2022 = calculateMean(sales2022);
        
        // Calculate the variance of each year's sales data
        double variance2021 = calculateVariance(sales2021, mean2021);
        double variance2022 = calculateVariance(sales2022, mean2022);
        
        // Calculate the variance percentage between the two years
        double variancePct = (variance2022 - variance2021) / variance2021 * 100.0;
        
        // Print the results
        System.out.printf("2021 Variance: %.2f\n", variance2021);
        System.out.printf("2022 Variance: %.2f\n", variance2022);
        System.out.printf("Variance Pct: %.2f%%\n", variancePct);
    }
    
    // Helper method to calculate the mean of an array of doubles
    public static double calculateMean(double[] data) {
        double sum = 0.0;
        for (double d : data) {
            sum += d;
        }
        return sum / data.length;
    }
    
    // Helper method to calculate the variance of an array of doubles
    public static double calculateVariance(double[] data, double mean) {
        double sumSquares = 0.0;
        for (double d : data) {
            sumSquares += (d - mean) * (d - mean);
        }
        return sumSquares / (data.length - 1);
    }
}


 
