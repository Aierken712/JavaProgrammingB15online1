package Day58;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileNotFoundDemo {

    public static void main(String[] args) {
        System.out.println("Before Try Catch");
      try {
          Files.readAllLines(Paths.get("file.txt"));
      }catch (IOException e){
          System.out.println("Exception happened and caught!");
      }
        System.out.println("After Try Catch");

    }
}