package Day58;

public class RuntimeErrorDemo {

    static int num = 0;

    public static void main(String[] args) {

        num++;
        System.out.println("num");
        // call main method again
        main(null);

    }
}
