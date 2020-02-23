package Day39;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {
        /*
        Create an ArrayList of String to store 12 elements.
        Each element should contains product information separated by comma  :
        at index 0 -->> iPhone 6s, 499 , 18.71 and so on
         */
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


        System.out.println("productLst = " + productLst);
        System.out.println("productLst element count  = " + productLst.size());


//         * Task 1 : print only items name
        // This is for each version
        for (String eachProduct : productLst) {
            // we get each product , then we split by comma to split into 3 part
            // and get first part of 3 -->> NAME
            String namePart = eachProduct.split(",")[0];
            System.out.println("eachProduct name = " + namePart);

        }
        // This is for loop version
        for (int i = 0; i < productLst.size(); i++) {
            // we get each product by using get method of ArrayList in for loop
            // then we split by comma to split into 3 part
            // and get first part of 3 -->> NAME
            String namePart = productLst.get(i).split(",")[0];
            System.out.println("eachProduct name = " + namePart);
        }

        //         * Task 2 : print all the prices more than 500
        for (String eachProduct : productLst) {

            double price = Double.parseDouble(eachProduct.split(",")[1]);

            if (price > 500) {
                System.out.println("price = " + price);
            }

        }

        //         * Task 3 : print average price
        double sum = 0;
        double average = 0;

        for (String eachProduct : productLst) {

            double price = Double.parseDouble(eachProduct.split(",")[1]);
            sum = sum + price; // sum += price ;

        }
        average = sum / productLst.size();

        System.out.println("sum = " + sum);
        System.out.println("average = " + average);

        //         * Task 4 : print all the items name that has less than 20$ monthly payment.
        for (String eachProduct : productLst) {

            String name = eachProduct.split(",")[0];
            double monthly = Double.parseDouble(eachProduct.split(",")[2]);

            if (monthly < 20) {
                System.out.println(name + " " + monthly);
            }

        }

        //         * Task 5 : Print the monthly payments of all the iPhone no matter what model.
        for (String eachProduct : productLst) {

            String name = eachProduct.split(",")[0];
            double monthly = Double.parseDouble(eachProduct.split(",")[2]);

            if (name.contains("iPhone")) {
                System.out.println(name + " " + monthly);
            }

        }

//           Task 7 : Update Dyson price to 80% off
//           (Monthly payment (24 month) should also be calculated accordingly)

        int dysonIndex = 0; // there is only one Dyson
        for (int i = 0; i < productLst.size(); i++) {
            // checking the element start with dyson
            if (productLst.get(i).startsWith("Dyson")) {
                dysonIndex = i; // if so set the dysonIndex to that location
            }
        }
        System.out.println("dysonIndex = " + dysonIndex);
        // This is original dyson details using the index
        String dysonDetails = productLst.get(dysonIndex);
        // in order to get 80% off the price and put it back to list
        // we need the price and monthly in double format so we can do calculation
        String name = dysonDetails.split(",")[0];
        double price = Double.parseDouble(dysonDetails.split(",")[1]);
        double monthly = Double.parseDouble(dysonDetails.split(",")[2]);
        // Putting it back to the dysons details after doing the calculation
        // 80% off means you are paying for 20% of original price
        dysonDetails = name + "," + price * 0.2 + "," + monthly * 0.2;
        System.out.println("dysonDetails = " + dysonDetails);
        // then use the set method to set the value back to the list
        productLst.set(dysonIndex, dysonDetails);
        System.out.println("productLst = " + productLst);

        //         * Task 8 : Count the items prices more than average price.
//         * Task 8 : Count all the items with prices more than average price.
        int cnt = 0;
        for (String eachProduct : productLst) {

            double eachPrice = Double.parseDouble(eachProduct.split(",")[1]);
            if (eachPrice > average) {
                ++cnt;
            }
        }
        System.out.println("all the items with prices more than average price  = " + cnt);

        System.out.println("\n-----------Task 9 ----------");
//         * OPTIONALLY :
//         * Task 9 : Remove all the items has more than average price.
//         * Task 9 : Remove all the items with prices more than average price.
        for (int i = 0; i < productLst.size(); i++) {

            double eachPrice = Double.parseDouble(productLst.get(i).split(",")[1]);
            if (eachPrice > average) {

                productLst.remove(i);
                --i;
            }

        }
        System.out.println("productLst count  after removing = " + productLst.size());
        // You may also store all the items with more than average into another list
        // then use remove all method :  productLst.removeAll( newListHere)







    }
}