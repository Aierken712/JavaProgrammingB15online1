package Day47;

public class Rectangle extends Shape{

    int width ;
    int height ;

    public Rectangle(int width,int height){
        super("My rectangle");
        this.height = height;
        this.width = width;
    }

    @Override
    public void calculateArea(){
        area = height*width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }


}
