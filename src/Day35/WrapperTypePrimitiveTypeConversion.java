package Day35;

public class WrapperTypePrimitiveTypeConversion {

    public static void main(String[] args) {

        Integer num1 = 100; // -->> auto-boxing 100 -->> new Integer(100)
        // Integer.valueOf(..) is a method that return Integer Object
        // it has 2 overloaded version one that accept number , another accept String
        // BUT BOTH OF THEM RETURN INTEGER OBJECT
        int num2 = Integer.valueOf("200"); // auto-unboxing into 200

        int num3 = Integer.parseInt("200");

        /*
        * Integer.parseInt("number")
        * it return an int value converted from String
        *
        * Integer.ValueOf("number")
        * it return an Integer Object by wrapping up the number
        *
        * YOU MAY USE WHICHEVER YOU WANT BECAUSE:
        * Auto-boxing and Auto-unboxing will take care of the conversion anyway
        *
         */

        // Use this number IPR2012-00001 and store the year into a int variable
        // This case number always start with 3 character either IPR , PGR , CBM , DER
        // followed by year , followed by dash and 5 digit number

//        String caseNumber = "IPR2012-00001";
//        int year ; // -- get 2012 out of it
//
//        String strYear = caseNumber.substring(3,7);
//        year = Integer.parseInt(strYear);
//        System.out.println("strYear = " + strYear);

        System.out.println(getYearOutOfCaseNUmber("DER2019-00034"));
        System.out.println(getYearOutOfCaseNUmber("IPR2009-00034"));
        System.out.println(getYearOutOfCaseNUmber("CBM2019-00034"));

    }

    public static int getYearOutOfCaseNUmber(String caseNumber){
        // do validation on case number
        // TODO : Case number should always start with either
        // CBM,IPR,DER,PGR
        // Followed by 4 digit number
        // followed by -
        // and followed by 5 digit


//        int year ; // -- get 2012 out of it
//        String strYear = caseNumber.substring(3,7);
//        year = Integer.parseInt(strYear);
//        return year;
        return Integer.parseInt(caseNumber.substring(3,7) );
    }


}
