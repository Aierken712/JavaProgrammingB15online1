package Day20;

public class Get2SiblingChar {

    public static void main(String[] args) {

        String name = "Ayra";
        int lastCharIndex =  name.length()-1;

//        for(int x = 0; x< name.length()-1; x++){
//
//            System.out.println(name.substring(x,x+2));
//        }
        for(int x = 0; x< name.length()-2; x++){

            System.out.println(name.substring(x,x+3));
        }


    }
}
