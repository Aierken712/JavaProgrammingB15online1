package Day44;

public class Course {

    String name ;
    String type ;

    static  int counter;

    public Course(String name, String type) {
        this.name = name;
        this.type = type;
        ++counter;
        // you can access static field
        // in constructor , inside method , static method
    }
}