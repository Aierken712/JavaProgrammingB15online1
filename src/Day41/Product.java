package Day41;

public class Product {

    // (this.) keyword can be used to refer the current object
    // we are working on
    // we can use it to refer the instance field
    // this.fieldName
    // only can be used inside instance method (and later constructor)
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}


//     public String getName(){
//         return this.name;
//        // return name;
//     }
//
//     public void setName(String newName){
//         this.name = name;
//         //name = newName;
//     }
//
//     public double getPrice(){
//         return price;
//     }
//
//     public void setPrice(double newPrice){
//         if(price>0) {
//             this.price = price;
//         }
//     }








