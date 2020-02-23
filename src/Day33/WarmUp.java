package Day33;

public class WarmUp {

    public static void main(String[] args) {

        String spelledName = getSpelledName("Serra");
        System.out.println("spelledName = " +spelledName);
        System.out.println(getSpelledName("Zeynap"));

        System.out.println( getSpelledName2("Irina") );
    }

    // getSpelledName
    // This method will put dash in between given string
    // for example : Akbar -->> A-k-b-a-r
    // @param name this is the name parameter
    // @return the name has dash in between

    public static String getSpelledName(String name){

        String result = "";
        for (int i = 0; i <name.length() ; i++) {

            result = result + name.charAt(i);
            // concatenate dash(-)
            // if we are not at last character
            if(i != name.length()-1){
                result = result + "-";
            }
        }

        return result;
    }
    public static String getSpelledName2(String name){
        String result = "";
        // keep adding dash until right before last character
        // then concatenate last character
        for (int x = 0; x <name.length()-1 ; x++) {
            // this loop will add dash after each character
            // until 2nd character from the last
            result += name.charAt(x) + "-";
        }
        // your code goes here
        // result has everything but last character
        // so now we need to add last character back to the result

        return result + name.charAt(name.length()-1);
    }



}
