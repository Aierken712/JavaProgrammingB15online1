package Day18;

public class EvenNumber_ForLoop {

    public static void main(String[] args) {

        // skip counting by 2
        // starting from 0 --100
        for (int x = 0; x < 100; x +=2){  // or x = x+2
            System.out.print( x + " ");
        }
        System.out.println();

        for ( int x = 0; x < 100; x +=3 ){
            System.out.print( x + " " );
        }

        for (int i = 0; i < 100; i++) {
            if (i%2 == 0){
                System.out.println(i + " is even number!");
            }
        }

        // The short cut for generating for loop is : fori enter or tab
        for (int i = 0; i < 100; i++) {
            if( i%5 == 0  && i%3 == 0){
                System.out.println(i + "IS FIZZ NUMBER");
            }
        }

        // everything you can do with the for loop -->> can be done using while loop!!!


    }
}
