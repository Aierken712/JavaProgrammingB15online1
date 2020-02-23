package Day22;

public class ArrayIntro {

    public static void main(String[] args) {

        // syntax for creating variable to store single items
        // and assigning value
        // dateType variableName = value here
//        int num1 = 10;
//        System.out.println(num1);

        // syntax for creating variable to store multiple items
        // and assigning value
        // dateType [] variableName = new dateType[count of item];
        // this array can hold 4 items , its also known as array size

        // creating an array object with empty space
//        int[] scores = new int[4];
        // assigning value to each index
//        scores[0] = 95;
//        scores[1] = 70;
//        scores[2] = 88;
//        scores[3] = 100;

        //// accessing the elements inside array one by one
//        System.out.println( scores[0]   );
//        System.out.println( scores[1]   );
//        System.out.println( scores[2]   );
//        System.out.println( scores[3]   );

        // updating the value at certain index
//        scores[1] = 99;
//        System.out.println( scores[1] );

        // one array is create with certain size , we can not change the size!!!

        // When you create new object
        // it will get default value in each element
        //  int[] numbers = new int[3];
//        System.out.println(numbers[0] );
//        System.out.println(numbers[1] );
//        System.out.println(numbers[2] );


        // create an object array size 4
        // and store it into a variable called data

        // assign a value for each index location
        // print out the value at each index

        // update last index value
        // then print it out

        int[] data = new int[4];

        data[0] = 10;
        data[1] = 20;
        data[2] = 30;
        data[3] = 40;
        System.out.println(data[0] );
        System.out.println(data[1] );
        System.out.println(data[2] );
        System.out.println(data[3] );
        data[3] = 45;
        System.out.println(data[3] );
    }
}
