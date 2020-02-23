package Day54;

import javax.sql.rowset.WebRowSet;
import java.nio.file.WatchEvent;

public class Clothes implements Wearable{

    int size;

    public static void main(String[] args) {

        Clothes  c1 = new Clothes();
        Wearable c2 = new Clothes();
        Object   o1 = new Clothes();

        Watch    wa = new Watch();
        Wearable w2 = new Watch();
        Object   o2 = new Watch();

        Perfume   p1 = new Perfume();
        Wearable  w3 = new Perfume();
        Cosmetics c3 = new Perfume();
        Object    o3 = new Perfume();

        MakeUps   m1 = new MakeUps();
        Wearable  w4 = new MakeUps();
        Cosmetics c4 = new MakeUps();
        Object    o4 = new MakeUps();
    }

    @Override
    public void wear() {
        System.out.println("Wearing Clothes!!!");
    }

}

class Watch implements Wearable{

    @Override
    public void wear() {
        System.out.println("Wearing watches!!!");
    }
}

class Perfume implements Wearable,Cosmetics {

    @Override
    public void wear() {
        System.out.println("Wearing Perfumes!!!");
    }
}

class MakeUps implements Wearable,Cosmetics {

    @Override
    public void wear() {
        System.out.println("Wearing MakeUps!!!");
    }
}