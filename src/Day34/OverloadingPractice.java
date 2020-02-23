package Day34;

public class OverloadingPractice {

    public static void main(String[] args) {
       add1(15);
       add2(15,45);
       add3(15,43,67);
       add4(15L,23L);
    }

    public static void add1(int num) {
        System.out.println(num+100);
    }
    public static void add2(int num1,int num2) {
        System.out.println(num1+num2);
    }
    public static void add3(int num3,int num4,int num5) {

        System.out.println( num3+num4+num5);
    }
    public static void add4(long num6,long num7) {

        System.out.println(num6+num7);
    }





}
