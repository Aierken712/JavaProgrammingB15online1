package Day11;

public class WakeUpTask {

    public static void main(String[] args) {

      String targetOption = "Bd";

      switch (targetOption) {
            case "Bd" :
            System.out.println("Your bedroom light is on");
              break;
          case "Living room":
              System.out.println("Your living room light is on");
              break;
          case "Kitchen":
              System.out.println("Your kitchen light is on");
              break;
          case "Hallway":
              System.out.println("Your hallway light is on");
              break;

          default:
              System.out.println("Wrong option");
      }







    }
}
