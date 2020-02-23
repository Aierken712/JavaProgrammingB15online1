package Day55;

public class Taxi {

    int    plateNum;
    Engine eng; // just like String, we have a class Engine,
                // so I can use it as data type
    Driver dr;

    public Taxi(int plateNum,Engine eng,Driver dr){
        this.plateNum = plateNum;
        this.eng = eng;
        this.dr = dr;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "plateNum=" + plateNum +
                ", eng=" + eng +
                ", dr=" + dr +
                '}';
    }

}

class Engine {

    String type;
    int horsePower;

    public Engine(String type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }


}









