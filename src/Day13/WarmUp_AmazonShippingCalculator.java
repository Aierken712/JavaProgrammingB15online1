package Day13;

public class WarmUp_AmazonShippingCalculator {

    public static void main(String[] args) {

        String memberType = "Prime member";
        double amount = 15.99d;
        int shippingFee = 0;

        if (memberType.equalsIgnoreCase("Prime member") ) {

            System.out.println("You get 1 day free shipping");
            System.out.println("Your final price is " + amount);
        }else if (amount > 25) {
            System.out.println("not prime member but your order is more than 25");
            System.out.println("you got free shipping on amount" + amount);
        }else{
            System.out.println("Do you wanna sign up for prime membership?");
            shippingFee = 5;
            amount = amount + shippingFee ; // amount += shippingFee
            System.out.println("your final amount is " + amount);
        }




    }
}
