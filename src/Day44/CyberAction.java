package Day44;

public class CyberAction {

    public static void main(String[] args) {

        CyberHouse.showNeighbourhood();

        CyberHouse c1 = new CyberHouse("Vintage",101);
        c1.showAllInfo();

        CyberHouse c2 = new CyberHouse("Classic",102);
        c2.showAllInfo();

       // how do I get max value of Short
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);

    }
}
