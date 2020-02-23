package Day47;

public abstract class Shape {

    String name ;
    int area ;

    public abstract void calculateArea();

    public abstract String toString();

    public Shape(String name){
        this.name = name;
    }


}
