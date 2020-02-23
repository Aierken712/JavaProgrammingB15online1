package Day32;

public class NumberAction {

    //Create a methods are below
    // numberComparison
    // this method has 2 parameters called num1 and num2
    // if num1 more than num2 print num1 is more than num2
    // if num2 more than num1 print num2 is more than num1
    // if num2 are equals num1 print they are equal

    // String repeater
    // this method has 2 parameter
    // String strToRepeat and int count
    // repeat printing the string as many times as <count> number define

//    skipCountBy3From0to50
//
//    create a method that has no parameter
//    and skip count by 3 from 0 to 50
//
//    countDownByEvenNumberFrom50to0
//    create a method that has no parameter
//    and count Down By Even Number From 50 to 0
//    for example 50 , 48 , 46 .....0
//
//    print1toX
//    create a method that has 1 int parameter called x
//   print from 1 to that number in one line
//   print an empty line after the print.

//  instead of countDownByEvenNumberFrom50to0
//  now count down by EvenNumber From x to y

    public static void numberComparison(int num1,int num2){
        if(num1>num2){
            System.out.println(num1 + " more than " + num2);
        }else if(num1<num2){
            System.out.println(num2 + " more than " + num1);
        }else{
            System.out.println("They are equal");
        }
    }

    public static void repeatString(String strRepeat,int count){
        for (int i = 1; i <= count; i++) {
            System.out.print(strRepeat + " | ");
        }
        System.out.println();
    }

    public static void skipCountBy3From0to50(){
        for (int x = 0; x <=50 ; x+=3) {
            System.out.print(x + " ");
        }
        System.out.println();
    }



    public static void print1toX(int x){
        for (int j = 1; j<=x; j++){
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void countDownByEvenNumberFrom50to0(){
//        for (int i = 50; i >=0 ; i--) {
//            if(i%2==0){
//                System.out.print(i + " ");
//            }
//        }
         countDownByEvenNumberFromXToY(50,0);
        System.out.println();
    }

    public static void countDownByEvenNumberFromXToY(int x,int y){
        for (int i = x; i >y ; i--) {
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {

        numberComparison(10,20);
        repeatString("java",5);
        skipCountBy3From0to50();
        countDownByEvenNumberFrom50to0();
        print1toX(5);
       // countDownByEvenNumberFrom50to0(30,10);

    }






}
