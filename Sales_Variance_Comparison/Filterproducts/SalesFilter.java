package Sales_Variance_Comparison.Filterproducts;

import java.util.*;
public class SalesFilter {
    
    public static void main(String[] args) {
        
        // Sales data for 2021 and 2022
        String[] products2021 = {"Tea", "Coffee", "Green Tea"};
        double[] sales2021 = {100.0, 100.0, 75.0};
        String[] products2022 = {"Tea", "Coffee", "Green Tea"};
        double[] sales2022 = {120.0, 110.0, 100.0};
        
        // Filter products that contain the word "Tea" and calculate the total for each year
        double total2021 = 0.0;
        double total2022 = 0.0;
        
        for (int i = 0; i < products2021.length; i++) {
            if (products2021[i].contains("Tea")) {
                total2021 += sales2021[i];
            }
            if (products2022[i].contains("Tea")) {
                total2022 += sales2022[i];
            }
        }
        
        // Print the results
        System.out.printf("2021 Total: %.2f\n", total2021);
        System.out.printf("2022 Total: %.2f\n", total2022);
    }
}
