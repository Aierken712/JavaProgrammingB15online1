package Day23;

public class WarmUp_Array {

    public static void main(String[] args) {

        int[] item = new int[7];
         item[0]=11;
         item[1]=22;
         item[2]=33;
         item[3]=44;
         item[4]=55;
         item[5]=66;
         item[6]=77;

        for(int i =6; i >= 0; i--) {

            System.out.println(item[i]);
        }

        int lastItemIndex = item.length-1;
        int lastItem = item[lastItemIndex];
        System.out.println("last item value is " + lastItem);


        int arraySize = item.length;
        int middleItemIndex=arraySize/2;
        System.out.println("middle item is " + item[middleItemIndex]);

        int sum = 0;
        for (int i = 0; i < arraySize ; i++) {

            sum += item[i];
        }
        System.out.println("sum = " + sum);

    }
}
