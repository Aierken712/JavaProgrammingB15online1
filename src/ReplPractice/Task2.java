package ReplPractice;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        String word = scan.next();
//        //WRITE YOUR CODE HERE
//        int i = word.length()-1;
//        while( i>=0 ){
//            System.out.print( word.charAt(i) );
//            i--;
//        }
//        Scanner scan = new Scanner(System.in);
//        String word = scan.nextLine();
//        String sentence = scan.nextLine();
//        //WRITE YOUR CODE HERE
//        boolean trueOrfalase = true;
//        if(sentence.contains(word) ){
//            System.out.println(trueOrfalase);
//        }else{
//            System.out.println(false);
//        }



       // Scanner scan = new Scanner(System.in);
//        System.out.println("Split:");
//        String Split = scan.next();
//        System.out.println("Number of people:");
//        int numberOfPeople = scan.nextInt();
//        System.out.println("Check amount:");
//        float checkAmount = scan.nextFloat();
//        System.out.println("Service Quality:");
//        String serviceQuality = scan.next();
//
//        float totalToPay = 0,totalTip = 0,totalPerPerson,tipPerPerson;
//
//        if(serviceQuality.equals("Poor") ){
//            totalToPay = checkAmount + checkAmount*0.05f;
//            totalTip   = checkAmount*0.05f;
//
//        }else if(serviceQuality.equals("Fair") ){
//            totalToPay = checkAmount + checkAmount*0.1f;
//            totalTip   = checkAmount*0.1f;
//
//        }else if(serviceQuality.equals("Good")){
//            totalToPay = checkAmount + checkAmount*0.15f;
//            totalTip   = checkAmount*0.15f;
//
//        }else if(serviceQuality.equals("Great")){
//            totalToPay = checkAmount + checkAmount*0.2f;
//            totalTip   = checkAmount*0.2f;
//
//        }else if(serviceQuality.equals("Excellent")){
//            totalToPay = checkAmount + checkAmount*0.25f;
//            totalTip = checkAmount*0.25f;
//
//        }
//        totalPerPerson = totalToPay/numberOfPeople;
//        tipPerPerson   = totalTip/numberOfPeople;
//
//        String numberOfPeopleEntered = "";
//        if( Split.equals("yes") ){
//
//            for(int i=1 ;i<=numberOfPeople;i++){
//                numberOfPeopleEntered +="&";
//            }
//
//        }else if(Split.equals("no")){
//            numberOfPeopleEntered = "&";
//            totalPerPerson = totalToPay;
//            tipPerPerson   = totalTip;
//        }
//
//        System.out.println("Number of people entered:" + numberOfPeopleEntered );
//        System.out.println("Total to pay: " + totalToPay );
//        System.out.println("Total tip: " + totalTip);
//        System.out.println("Total per person: " + totalPerPerson);
//        System.out.println("Tip per person: " + tipPerPerson);


//        Scanner scan = new Scanner(System.in);
//        String word = scan.next();
//
//        if(word.startsWith("java") || word.substring(1).startsWith("java") ){
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }

//        Scanner scan= new Scanner(System.in);
//        String word = scan.next();
//
//        int cntOfJava = 0;
//        for(int i=0;i<word.length();i++){
//            if(word.substring(i,i+4).contains("java") ){
//                    cntOfJava++;
//
//            }
//        }
//        System.out.println(cntOfJava);

//        Scanner scan = new Scanner(System.in);
//        String sentence = scan.nextLine();
//
//        boolean answer = true;
//        int cntOfjava   = 0;
//        int cntOfpython = 0;
//        for(int i=0;i<sentence.length()-3;i++){
//            if(sentence.substring(i,i+4).contains("java") ){
//                cntOfjava++;
//            }
//        }
//        for(int j=0;j<sentence.length()-5;j++){
//            if(sentence.substring(j,j+6).contains("python") ){
//                cntOfpython++;
//            }
//        }
//        if(cntOfjava!=cntOfpython){
//            answer=false;
//            System.out.println(answer);
//        }else{
//            System.out.println(answer);
//        }
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
//        for(int i =0;i<word.length();i++){
//            if(word.charAt(i)== ('a') || word.charAt(i)== ('o') ||  word.charAt(i)== ('i') || word.charAt(i)== ('u')|| word.charAt(i)== ('e') ){
//                System.out.print(word.charAt(i) );
//            }
//        }







    }
}
