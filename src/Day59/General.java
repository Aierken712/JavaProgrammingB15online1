package Day59;

public class General {

    public static void main(String[] args) {

        // Object o = new String("abc");
        // can I get the first char using o

        System.out.println("The start");
        // String str1 = null;
        String str = "";


        try{
            System.out.println(str.charAt(0));
            System.out.println("End of try");
        }catch(NullPointerException n){
            System.out.println("No object here");
        }catch(Exception e) {
            System.out.println("eeeeeeee");
            System.out.println("The end");
        }



    }
}
