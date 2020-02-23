package Day23;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        long[] salaries = {500_000L, 80_000L, 90_000L, 10_000L, 120_000L};
//        for (long eachSalary: salaries) {
//            System.out.println(eachSalary);
//        }
//        for (long salary : salaries  ) {
//            if(salary>=100000){
//                System.out.println(salary);
//            }
//        }
          long max = salaries[0];
        for (long salary: salaries  ){
            if(salary>max){
              max = salary;
            }
        }
        System.out.println("Max salary is " + max);





    }
}
