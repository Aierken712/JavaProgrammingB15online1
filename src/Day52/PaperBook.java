package Day52;

public class PaperBook extends Book implements Readable {

    int weight;

    public PaperBook(String name, String author,int weight) {
        super(name, author);
        this.weight = weight;
    }


    @Override
    public void takeNote() {
        System.out.println("Take Note");
    }

    @Override
    public void showTableOfContent() {
        System.out.println("Show table of content");
    }

    @Override
    public void displayBookInfo() {
        System.out.println("Paper Book`s name " + name
               + ", and author " + author +
                " and it weight " + weight + "pound");
    }

    public void read(){
        System.out.println("Read a book");
    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
