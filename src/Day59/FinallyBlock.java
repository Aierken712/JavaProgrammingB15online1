package Day59;

public class FinallyBlock {

    public static void main(String[] args) {
        // in some case we want to run certain code
        // no matter Exception happen or not
        // as part of try catch

        int[] nums = {1,4,6};

        try {
            System.out.println(nums[100]);
            System.out.println("Ershad");
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Exception caught : \n" + a.getMessage());
        }finally {
            System.out.println("This code will always run no matter we have Exception or not");
        }
        System.out.println("The end");





    }
}
