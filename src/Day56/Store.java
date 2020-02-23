package Day56;

import java.util.ArrayList;
import java.util.List;

public class Store {

    String name; // adding a field so we can give a name to Store object when we create one
    private List<Product> allProducts; // Store has List of products


    public List<Product> getAllProductsMoreThanAveragePrice(){

        List<Product> myList = new ArrayList<>();
        double average = getAveragePrice();

        for(Product each : myList){
            if(each.getPrice()>average){
                myList.add(each);
            }
        }
        return myList;
    }

    /**
     * a method to get most expensive Product
     *
     * @return the product object with max price
     */
    public Product getMostExpensiveProduct(){

      //  int max = allProducts.get(0).getPrice();
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for(int i=0; i<allProducts.size(); i++){
           if(allProducts.get(i).getPrice()>max){
               max = allProducts.get(i).getPrice();
               maxIndex = i;
           }
        }
        System.out.println(max);
       return allProducts.get(maxIndex);
    }

    /**
     *
     * @return
     */
    public double getAveragePrice(){
        return findSumOfAllProduct()/getProductCount();
    }

    /**
     *
     * @return
     */
    public int findSumOfAllProduct(){

        int sum = 0;
        for(Product each : allProducts){
            sum += each.getPrice();
        }
        return sum;
    }


    /**
     * It will check whether we have the product in the list
     * @param p Product object to be checked
     * @return true if the list contains the product
     */
    public boolean checkIfProductExists(Product p){

        return allProducts.contains(p);
    }

    /**
     * Find out 0 based location of the product in the store
     * @param p product object to be checked
     * @return the index of the product in the list
     */
    public int indexOfProduct(Product p){
        return allProducts.indexOf(p);
    }

    public void removeProduct(Product p){
        if(checkIfProductExists(p) == true) {
           allProducts.remove(p);
        }else{
            System.out.println(p);
        }
    }

    /**
     * Display all products in human readable manner
     */
    public void displayProducts(){

        System.out.println(name);
        for(Product each : allProducts){
            System.out.println("\t each = " + each);
        }
    }


    /**
     * Counting how many products we have in the store
     * @return the size of allProducts List
     */
    public int getProductCount(){
        return allProducts.size();
    }

    /**
     * This version of addProduct will directly accept ready Product object
     * so it can be added to the allProducts list
     * @param p Product to be added
     */
    public void addProduct(Product p){
        allProducts.add(p);
    }

    public void addProduct(String productName,int productPrice) {

        Product newP = new Product(productName,productPrice);
        allProducts.add(newP);
    }

    public Store(){

        this.name = "Cybertek Store";
        this.allProducts = new ArrayList<>();
    }

    public Store(String name, List<Product> otherList){
        this();
        this.name = name;
        allProducts.addAll(otherList);
    }
}
