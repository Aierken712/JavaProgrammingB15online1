package Day49;

public class Tesla extends Vehicle implements Autonomous {

    int horsePower ;
    String model;

    public Tesla(int year, int horsePower, String model) {
        super(year);
        this.horsePower = horsePower;
        this.model = model;
    }

    public void charge(){
        System.out.println("Default charge");
    }

    @Override
    public void selfDrive() {
        System.out.println("Self drive");
    }

    @Override
    public void start() {
        System.out.println("Start");
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "horsePower=" + horsePower +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

}
