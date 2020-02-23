package Day53;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FruitShop {

    public static void main(String[] args) {

        Apple a1 = new Apple("sweet","red","Fuji");
        System.out.println("a1.taste = " + a1.taste);
        System.out.println("a1.color = " + a1.color);
        System.out.println("a1.type = " + a1.type);
        a1.getDigest();

        System.out.println("----------------------------");

        Fruit f1 = a1 ;
        System.out.println("f1.color = " + f1.color);
        System.out.println("f1.taste = " + f1.taste);
        f1.getDigest();

        Fruit f2 = new Apple("crispy","hot red","Gala");

        Fruit f3 = new Orange("sour","orange",12);
        System.out.println("f3.color = " + f3.color);
        System.out.println("f3.taste = " + f3.taste);
        f3.getDigest();

        Fruit f4 = new Orange("very sweet","Blood Red",10);

        System.out.println("----------------------------");

        Fruit[] myFruit = {f1,f2,f3,f4};
        for(Fruit each : myFruit){
            each.getDigest();
        }

//        List<Fruit> fruitList =new ArrayList<>( Arrays.asList(f1,f2,f3,f4) );
//
//        for(Fruit each : fruitList){
//            System.out.println("each.toString = " + each.toString() );
//            System.out.println( "Class Type = " + each.getClass().getSimpleName() );
//        }


    }



}
