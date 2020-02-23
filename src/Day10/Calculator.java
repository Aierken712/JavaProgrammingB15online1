package Day10;

public class Calculator {

    public static void main(String[] args) {

        char operator = '+';

        switch (operator) {
            case '+':
                System.out.println("You are about to add numbers");
                break;
            case '-':
                System.out.println("You are about to subtract numbers");
                break;
            case '*':
                System.out.println("You are about multiply numbers");
                break;
            case '/':
                System.out.println("You are about divide numbers");
                break;
            default:
                System.out.println("INVALID OPERATOR");
        }
        System.out.println("Operator is " + operator);

    }
}
