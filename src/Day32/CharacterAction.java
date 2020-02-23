package Day32;

public class CharacterAction {

    public static void main(String[] args) {

      // printAToZ();
      // printZToA();
        printAlphabetInRange('f','a');

    }

    // printAtoZ
    // create a method that has no parameter and print A to z in one line
    public static void printAToZ(){
        for(char iChar = 'A'; iChar<='Z';iChar++){
            System.out.print(iChar + " ");
        }
        System.out.println();
    }

    // printAtoZ
    // create a method that has no parameter and print A to z in one line
    public static void printZToA(){
        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

//    printAlphabetInRange
//    create a method that have 2 char as parameters: beginning, ending
//    if beginning character is before ending character
//	  for example beginning A , ending D  -->> ABCD
//    if beginning character is after ending character
//	  for example beginning D , ending A  -->> DCBA

    public static void printAlphabetInRange(char beginning,char ending){

        if(beginning<ending){
            for (char iChar = beginning;iChar<=ending;iChar++){
                System.out.print(iChar+" ");
            }
            System.out.println();
        }else if(beginning>ending){
            for(char iChar = beginning;iChar>=ending;iChar--){
                System.out.print(iChar+" ");
            }
            System.out.println();
        }else{
            System.out.println("THEY ARE SAME CHARACTER");
        }

    }




}
