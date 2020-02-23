package Day52;

import java.util.Arrays;
import java.util.List;

public class PolymorphicBookCounting {

    public static void main(String[] args) {

        Book b1 = new PaperBook("Book", "Ershad", 1);
        Book b2 = new PaperBook("Took", "Arshad", 3);
        Book b3 = new AudioBook("Sook", "Reshad", 4.5);
        Book b4 = new AudioBook("Kook", "Shad", 2.7);

        List<Book> bookList = Arrays.asList(b1,b2,b3,b4);

        for(Book each : bookList){
          //  each.displayBookInfo();
            System.out.println( each.getClass().getSimpleName() );
        }

        // obj.getClass().getSimpleName() --> PaperBook,AudioBook (Object nam that we created)

        // counting how many paper book we have
        int pCount = 0;
        for(Book each : bookList){
            String className = each.getClass().getSimpleName();
            System.out.println(className);
            if(className.equals("PaperBook") ){
                pCount++;
            }
        }
        System.out.println(pCount);


    }
}
