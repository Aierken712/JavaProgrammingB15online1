package Day27;

import java.util.Arrays;

public class Multi_Dimensional_Arrays2 {

    public static void main(String[] args) {

         /*
        Single dimensional array: contains vaules
                int[] arr = {1, 2, 3};
        Multi-dimensional array: an Array that can contain array(s)
                            N dimesional Array MUST contains (N-1) demesional arrays
                    ex: 2 dimesional array: conatins 1 dimesional arrays
                            int[][] arr2D = { {1,2,3 } , {4, 5, 6 }   }
     */
//
//            int[] arr1D = {1,2,3};
//            //[index num of elemnts]
//            //arr1D[1]  ==> 2
//            System.out.println( Arrays.toString(arr1D) );
//            // 2D array: is an array that contains single dimensional arrays
//            //                     0  1  2       0   1   2
//            int[][]  arr2D  = {  { 1, 2, 3} ,  { 4,  5,  6}  };
//            // index:               0              1
//            //[INDEX NUM OF 1D ARRAYS][INDEX NUM OF ELEMENTS]
//            // arr2D[0] ==> {1,2,3}
//            System.out.println(arr2D.length );
//            System.out.println(Arrays.toString( arr2D[0] ) );  // returns int array
//            System.out.println(Arrays.toString( arr2D[1] ) );
//            // arr2D[0][2]  ==> 3
//            System.out.println( arr2D[0][2] );   // returns int value
//            // print 5: arr2D[1][1]
//            System.out.println( arr2D[1][1] );  // retunrs int value
//            System.out.println( Arrays.toString( arr2D[1] ) ); // Arrays.toString is only applicable to single dimensional arrays
//            // Arrays.deepToString(multi-D Arrays):
//            System.out.println( Arrays.deepToString(arr2D));


//        print all the even numbers:
            int[][] ages = {{10},{12,13,14,16,17},{19,20,21,22,23} };

        for (int i = 0; i <ages.length ; i++) {

            for (int j = 0; j < ages[i].length; j++) {
               if( ages[i][j]%2 != 0) {  //ages[i][j]%2 == 0 --> System.out.print(ages[i][j] + " ");
                   continue;
               }
                   System.out.print(ages[i][j] + " ");

            }
        }





        }
}
