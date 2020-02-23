package Day52;

public interface KnowledgeBank {

    public abstract void takeNote();

    public default void showTableOfContent(){
        System.out.println("Show Table");
    }
}
