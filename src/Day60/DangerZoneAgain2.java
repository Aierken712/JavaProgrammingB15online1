package Day60;

import java.io.FileNotFoundException;

public class DangerZoneAgain2 {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("THE START");
        readMyFile();

        Thread.sleep(3000);
        System.out.println("The end");

    }

    public static void readMyFile(){

        System.out.println("Reading the file in my computer");

        try{
            throw new FileNotFoundException("Kaboom");
        }catch(FileNotFoundException f){
            System.out.println("AHA");
        }
    }





}
