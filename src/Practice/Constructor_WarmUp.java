package Practice;

//public class Constructor_WarmUp {

    //   public static void main(String[] args) {

//        // 1.
//        int[] arr = {2, 3, 4, 6, 8};
//        System.out.println( method1(arr) );
//
//        // 2.
//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,2,5,6,7));
//        System.out.println( method2( list) );
//
//
//    }
//
//    public static ArrayList<Integer> method1(int[] arr){
//
//        ArrayList<Integer> list = new ArrayList<>();
//
//        for(int each : arr){
//            list.add(each);
//        }
//        return list;
//    }
//
//    public static int method2(ArrayList<Integer> list){
//        int maxNum = 0;
//        for(Integer each : list){
//            if(each>maxNum){
//                maxNum = each;
//            }
//        }
//        return maxNum;
//}

class Test{

    public Test(){
       // this(10);
        System.out.println("Default Constructor");
    }
    public Test(int a){
        this();
        System.out.println("Constructor with argument");
    }

//    public Test(String str){
//        this();
//      //  this(100);
//        System.out.println(str);
//    }
    public static void main(String[] args) {
      Test2 obj = new Test2();

    }

    }






//}
