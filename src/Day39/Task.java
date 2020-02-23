package Day39;

import java.util.ArrayList;
import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        //         * Create 3 more ArrayList objects to separately store
//         *  itemNames(String), prices(Double) , monthlyPayments(Double)  :
        ArrayList<String> itemNames = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        ArrayList<Double> monthlyPayments = new ArrayList<>();

        ArrayList<String> productLst
                = new ArrayList<>(Arrays.asList("iPhone 6s,449,18.71",
                "iPhone 6s Plus,549,22.88",
                "iPhone X,1149,56.16",
                "MacbookPro,1499.99,79.49",
                "ThumbDrive,39.99,2.68",
                "Beats HeadPhones,349.99,15.12",
                "Mouse,79.99,8.98",
                "Charger,39.99,4.56",
                "iPad,429,18.31",
                "Dyson Vacuum,399,16.25",
                "TV,2199,89.49",
                "Apple Watch,559,21.18"));



        for (String eachProduct : productLst) {
            // store the name part into ItemName list
            String name = eachProduct.split(",")[0];
            itemNames.add(name);
            // store the name price into prices list
            double pricePart = Double.parseDouble(eachProduct.split(",")[1]);
            prices.add(pricePart);
            // store the name monthlyPart into monthlyParts list
            double monthlyPart = Double.parseDouble(eachProduct.split(",")[2]);
            monthlyPayments.add(monthlyPart);

        }

        System.out.println("itemNames = " + itemNames);
        System.out.println("prices = " + prices);
        System.out.println("monthlyPayments = " + monthlyPayments);

    }
}
