package Day52;

public class PolymorphicBookTest {

    public static void main(String[] args) {

        Book b1 = new PaperBook("Book", "Ershad", 1);
        b1.displayBookInfo();

        KnowledgeBank kb = b1;
        kb.takeNote();
        kb.showTableOfContent();



        Book b2 = new PaperBook("Took", "Arshad", 3);
        Book b3 = new AudioBook("Sook", "Reshad", 4.5);
        Book b4 = new AudioBook("Kook", "Shad", 2.7);

    }

}
