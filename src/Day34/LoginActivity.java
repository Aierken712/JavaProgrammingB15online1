package Day34;

public class LoginActivity {

    public static void main(String[] args) {
       loginVoid("user","abc123");
       System.out.println(loginReturn("user","abc123"));
    }

    public static void loginVoid(String userName,String passWard){

        if(userName.equals("user") && passWard.equals("abc123")){
            System.out.println("Login successful");
        }else if(!userName.equals("user") && !passWard.equals("abc123")){
            System.out.println("Login failed");
        }
    }

    public static boolean loginReturn(String userName, String passWard){
//        if(userName.equals("user") && passWard.equals("abc123")){
//            return true;
//        }else{
//            return false;
//        }
        return userName.equals("user") && passWard.equals("abc123");
    }






}
