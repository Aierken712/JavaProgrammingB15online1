package Day22;

public class StringArray {

    public static void main(String[] args) {

        String[] size = new String[4];

        size[0] = "Arkin";
        size[1] = "Mukaram";
        size[2] = "Erzat";
        size[3] = "Ershat";

//        System.out.println(size[0]);
//        System.out.println(size[1]);
//        System.out.println(size[2]);
//        System.out.println(size[3]);

        for (int i = 0; i < size.length; i++) {
            System.out.println(size[i]);

        }

        // immutable means you can not change the internal structure of the object
        // if you have String abc = "Hello"
        //if you do abc.toUppercase --> it will create new String object "HeLLO"
        //and it does not change original Hello at all

        // not resizable --> specifically for array
        // we can not change the size of array once we create them with certain size
        // However , we can change the elements inside this array
        // and it means : IT IS NOT IMMUTABLE



    }
}
