package Day31;

public class MethodPractice2 {

    public static void main(String[] args) {

        // write piece of reusable code to count from 1 to 10    : method name
        // give a name count1to10                                : static
        // no need for object when being called                  : public
        // it should be accessible anywhere in your project      : void
        // it does not return any value                          : (nothing inside)
        // does not need any external date when being called


        //count1to10();
        //System.out.println();
        //count1to10();
        // optionally you can call using classname.methodName();
        //MethodPractice2.count1to10();
        countDownFrom20();
        printOdd1to100();
       // myName();

    }

    // does not matter where you put the method
    //as long as its inside the class
    //and outside any of the method
    public static void count1to10() {
        for (int i = 1; i <=10 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // no need for object when being called                  : public
    // it should be accessible anywhere in your project      : void
    // it does not return any value                          : (nothing inside)
    // does not need any external date when being called

    // Create a method called countDownFrom20
    // Create a method to print odd numbers from 1-100 : printOdd1to100()
    // Create a method to spell your name : Seda -->> S-e-d-a

    public static void countDownFrom20(){
        for (int j = 20; j >0 ; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void printOdd1to100() {
        for (int x = 1; x <=100 ; x++) {
            if(x%2!=0){
                System.out.print(x + " ");
            }
        }
        System.out.println();
    }

    public static void myName(){
        String myName = "Ershad";
        for (int y = 0; y < myName.length() ; y++) {
            if(y==myName.length()-1){
                System.out.print(myName.charAt(y) );
            }else{
                System.out.print(myName.charAt(y) + "-");
            }
        }

    }



}
