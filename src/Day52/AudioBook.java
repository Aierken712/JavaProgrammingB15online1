package Day52;

public class AudioBook extends Book{

    double duration;

    public AudioBook(String name, String author, double duration) {
        super(name, author);
        this.duration = duration;
    }

    @Override
    public void takeNote() {
        System.out.println("takeNote");
    }

    @Override
    public void showTableOfContent() {
        System.out.println("showTableOfContent");
    }


    @Override
    public void displayBookInfo() {
        System.out.println("Audio Book`s name " + name
                + ", and author is " + author +
                " the duration is " + duration + "min");
    }

    public void listen(){
        System.out.println("Listen a book");
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "duration=" + duration +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

}
