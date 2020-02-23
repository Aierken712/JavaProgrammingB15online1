package Day49;

public class IceCream extends Object implements Edible {

    public static void main(String[] args) {

        IceCream i1 = new IceCream();
        i1.drink();
        i1.eat();
        System.out.println(i1.toString());


    }

    @Override
    public void digest(){
        System.out.println("Digesting burger by chewing more");
    }

    @Override
    public void eat() {
        System.out.println("Eat with spoon");
    }

    @Override
    public void drink() {
        System.out.println("Drink it if it has melted in the cup");
    }






}
