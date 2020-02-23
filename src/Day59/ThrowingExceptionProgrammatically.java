package Day59;

public class ThrowingExceptionProgrammatically {

    public static void main(String[] args) {

    // NullPointerException n = new NullPointerException();
     NullPointerException n = new NullPointerException("abc");
     System.out.println(n.getMessage());

     // How do I programmatically throw Exception myself
     // we use throw keyword followed by Exception object
     // (or the variable that point to the Exception object)
    throw n; // throw is a keyword that has one purpose of throwing the Exception to the Runtime
  //throw new NullPointerException("abc");

     // throw and throws means completely different thing
     // top interview question always get asked : stay tuned

     // throw keyword can be used to programmatically throw the Exception to the Runtime
     // to control program flow
    }
}
