package Day50;

public class Square extends Shape {

//    String name ;
//    double area ;
    int length ;

    public Square(String name,int length){
       super(name) ;
       this.length = length ;
    }

    @Override
    public void calculateArea() {
       area = length*length;
    }

    @Override
    public void draw() {
        System.out.println("Draw 4 equal line with 90 degree,length " +
                length + " with color " + COLOR );
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }

    // public abstract void calculateArea();
     // public abstract void draw();

}

