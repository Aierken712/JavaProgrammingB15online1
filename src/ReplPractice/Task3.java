package ReplPractice;

public class Task3 {

// Dec 21st (tasks)


    public static void reversePrintMyOwnName(){

        String name = "Ershad";
        for (int i = 5; i >= 0 ; i--) {
            System.out.print(name.charAt(i)+" ");
        }
        System.out.println();
    }

    public static void reversePrintAnyName(String name){
        for (int i = name.length()-1; i >=0 ; i--) {
            System.out.print(name.charAt(i)+" ");
        }
        System.out.println();
    }

    public static void printLastCharacterOfName(String name){
        System.out.println(name.charAt(name.length()-1) );
        System.out.println();
    }

    public static void printFullNameInformation(String firstName,String lastName){
        System.out.println("Your first name is " + firstName + ", Your last Name is " + lastName);
        int lengthOfTheFullName = firstName.length() + lastName.length();
        System.out.println("Your full name length is " + lengthOfTheFullName);
    }

    public static void compareNameCharacterCount(String name1,String name2){
        if(name1.length()==name2.length() ){
            System.out.println("name 1 and name 2 same character count");
        }else if(name1.length()>name2.length() ){
            System.out.println("name 1 is longer");
        }else if(name2.length()>name1.length()){
            System.out.println("name 2 is longer");
        }
    }

    public static void printAtoZ(){
        for (char i = 'A'; i <='Z' ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printZtoA(){
        for (char i = 'Z'; i >='A' ; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printAlphabetInRange(char beginning,char ending){
        for (char i = beginning; i <=ending ; i++) {
            System.out.print(i + " ");
        }
        for (char j = beginning; j >=ending ; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void printProductInfo(String productName,String model,int version,float price){
        System.out.println(productName);
        System.out.println(model);
        System.out.println(version);
        System.out.println(price);
    }

    public static void fahrenheitToCelsius(double  fahrenheit){
        System.out.println(fahrenheit + "F equals to " + (5.0 / 9) * (fahrenheit - 32) + "C." );
        System.out.println();
    }

    public static void numberComparision(int num1,int num2){
        if(num1==num2){
            System.out.println("They are equal");
        }else if(num1>num2){
            System.out.println(num1 + " is more than " + num2);
        }else if(num1<num2){
            System.out.println(num2 + " is more than " + num1);
        }
        System.out.println();
    }

    public static void stringRepeater(String strToRepeat,int count){
        for(int i =1;i<=count;i++){
            System.out.print(strToRepeat + " ");
        }
        System.out.println();
    }

    public static void skipCountBy3From0to50(){
        for(int i=0;i<=50;i+=3){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void countDownByEvenNumberFrom50to0(){
        for(int i=50;i>=0;i-=2){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void print1toX(int x){
        for (int i = 1; i <=x ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printMaxOfIntArray(int[] intArray ){
        int max = intArray[0];
        for(int eachNum : intArray){
            if(eachNum>max){
                max=eachNum;
            }
        }
        System.out.println(max);
    }

    public static void printMinOfIntArray(int[] intArray1){
        int min = intArray1[0];
        for(int eachNum : intArray1){
            if(eachNum<min){
                min = eachNum;
            }
        }
        System.out.println(min);
    }

    public static void printSumOfIntArray(int[] intArray2){
        int sum = 0;
        for (int eachNum : intArray2) {
            sum += eachNum;
        }
        System.out.println(sum);
    }

    public static void checkScoresAllMoreThan60(int[] intArray3){
        int count = 0;
        for(int i=0;i<intArray3.length;i++){
            if(intArray3[i]>60){
               continue;
            }else{
                count++;
            }
        }
        if(count>0) {
            System.out.println("Someone has failed");
        }else{
            System.out.println("Everyone passed");
        }

    }

    public static int getSumFrom1toX(int x){
        int sum = 0;
        for(int i=1;i<=x;i++){
            sum += i;
        }
        return sum;
    }

    public static String  buildGOTEmail(String firstName,String lastName){
        String email = firstName.charAt(0) + lastName + "@NightWatch.com";
        return email;
    }

    public static String  covertNumberToDay(int dayCode){
        String dayName = "";
         switch(dayCode) {
             case 1:
                 dayName = "Monday";
                 break;
             case 2:
                 dayName = "Tuesday";
                 break;
             case 3:
                 dayName = "Wednesday";
                 break;
             case 4:
                 dayName = "Thursday";
                 break;
             case 5:
                 dayName = "Friday";
                 break;
             case 6:
                 dayName = "Saturday";
                 break;
             case 7:
                 dayName = "Sunday";
                 break;
             default:
                 System.out.println("INVALID DAY!");
         }
         return dayName;
    }


    public static void main(String[] args) {

        reversePrintMyOwnName();
        reversePrintAnyName("Erkin");
        printLastCharacterOfName("Ershad");
        printFullNameInformation("Ershad","Erkin");
        compareNameCharacterCount("Ershad","Erkin");
        printAtoZ();
        printZtoA();
        printAlphabetInRange('F','A');
        printProductInfo("Fire","HD",8,79.99f);
        fahrenheitToCelsius(78);
        numberComparision(10,15);
        stringRepeater("Java",3);
        skipCountBy3From0to50();
        countDownByEvenNumberFrom50to0();
        print1toX(5);

        int[] intArray = {3,5,2};
        printMaxOfIntArray( intArray );

        int[] intArray1 = {3,5,2};
        printMinOfIntArray(intArray1);

        int[] intArray2 = {3,5,2};
        printSumOfIntArray(intArray2);

        int[] intArray3 = {65,88,95};
        checkScoresAllMoreThan60(intArray3);

        System.out.println(getSumFrom1toX(5));

        System.out.println(buildGOTEmail("Ershad","Erkin"));

        System.out.println(covertNumberToDay(8));




    }











}
