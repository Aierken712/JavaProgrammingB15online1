package Day50;

public class ShapeTest {

    public static void main(String[] args) {

    Square s1 = new Square("my precious",10);
    System.out.println("Before s1 = " + s1);
    s1.calculateArea();
    System.out.println(" After s1 = " + s1);
    s1.draw();

    }


}
