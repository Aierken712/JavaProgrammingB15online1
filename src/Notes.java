public class Notes {

    public static void main(String[] args) {

//        methods
//        methods are a function that objects can do that assists you in writing your code!
//                methods are usually made by making a ".example" addition to your object
//        example
//        test.equals(), test.nextLine(), etc...
//        methods sometimes need additonal data to perform their actions. you give the additional data within the "(example)" parentheses at the end of a method.
//                example
//        test.equals("example"), test.equalsIgnoreCase("EXAMPLE")
//        method chaining
//        methods can be chained together to do multiple method functions in a row
//        "JORdan".toLowerCase().contains("jor"); = true
//        (puts changes JORdan to "jordan" then checks for "jor")
//        "JORdan".length().toUpperCase() will return an error
//                (finds out length of "JORdan"--> 6 then tries to uppercase int 6 which is impossible )
//        String object methods
//        String s1 = "a Bc";
//        s1.equals()
//        compares the internal value of a string to another string, no matter whether it is stored in the string pool or as a stand alone object s1 == "a Bc" with this method
//        s1.equalsIgnoreCase()
//        similar to equals except that it ignores the letter case of the strings.  s1 == "a bc" with this method
//        s1.toUpperCase()
//        takes String s1 and makes a new String with all upper case letters.     s1.toUpperCase() == "A BC" with this method
//        s1.toLowerCase()
//        similar to .toUpperCase() but makes letters lower case
//                s1.toLowerCase() == "a bc" with this method
//        s1.length
//        counts the number of characters in the string COUNTING SPACES ("  ".length() == 2) and outputs the total as an int
//        s1.length() == 4
//        s1.startsWith("")
//        checks whether the indicated parameters are a match with THE BEGINNING CHARACTERS of the String. IS CASE SENSITVE. outputs a boolean value
//        s1.startsWith("a B"); == TRUE with this method
//        s1.endsWith("")
//        similar to .startsWith() but checks for a match against the ENDING CHARACTERS of a String
//        s1.endsWith("Bc"); == TRUE with this method
//        s1.charAt(index);
//        will return a character at a specified location
//        String anatomy
//        char index goes from 0 - infinite Returns char
//        corresponds with reletive char within a String
//        "Hello"
//        char index 0 = H
//        char index 4 = o
//        char index 2 = l
//        how to find the last character of any string
//        counting character starts with 1 (.length())
//        counting index starts with 0 (.charAt(), .indexAt())
//        so last character index/location will always be -1 than the actual character count
//        s1.charAt(3); == 'c' with this method
//        s1.contains(s2)
//        checks whether a string exists within another string
//        returns boolean
//        s1.contains("B") == TRUE in this method
//        s1.indexOf(anotherStr)
//        finds the index location (beginning to end) of another String within this string
//        outputs -1 when there is no instance of the string within the original string
//                    **reminder index starts with 0 not 1
//        will always output the location of the first instance within the string
//        example "example".indexOf("e") == 0
//        Returns an int
//        s1.indexOf("B") == 2 in this method
//        s1.indexOf(anotherStr, fromIndex)
//        very similar to .indexOf(anotherString) except that it searches for occurances of anotherString within original Strin STARTING FROM A STATED INDEX LOCATION
//        s1.indexOf("B"); = 2 in this method
//        s1.indexOf("B", 3 )
//        s1.lastIndexOf(anotherStr)
//        very similar to .indexOf(anotherString) except that it processes from back to front (index still starts with 0 from beginning to end)
//        s1.substring(beginningIndex, EndingIndex)
//        pulls part of a string out of another string from the (first index to second index).
//                THE LAST INDEX IS NONINCLUSIVE! If you want to include the final character you MUST use the total character count NOT THE FINAL INDEX COUNT
//        "example".substring(3,7) == "mple"
//        (you can also just enter the first index and not a second index)
//        "example".substring(3) == "mple"
//        s1.isEmpty();
//        Checks whether a string is empty ("")
//        checks s1.length()>0
//        returns a boolean
//        s1.isEmpty(); == FALSE in this method
//        s1.isBlank();
//        checks if a string has ONLY blank spaces (space, tab, return)
//        returns boolean
//        "  ".isBlank() == TRUE
//        s1.isBlank(); == False in this method
//        s1.trim();
//        removes beginning and ending empty spaces of a string.
//                returns a String
//        "  abc  ".trim(); == "abc" In this method
//        s1.replace("","")
//        Will go through the entire first string and replace all instances in the first "" with the String in the second ""
//        "I like bongos, bongos are great".replace("bongos","bootys") == "I like bootys, bootys are great"
//        s1.concat("anotherString")
//        s1.toCharArray();
//        converts string into char array
//        returns an array with the chars in the string occupying each array index
//        s1.split();

 //       String listOfItem = "Smartphone,laptop,Charger,USB cable,Headphone,Pants,Hat,Socks,Blanket,Pillow";
    }
}


//Advantages:
//        Reusable: You can reuse tests on different versions of an application, even if the user interface changes.
//        Fast: Automated Tools run tests significantly faster than human users.
//        Economical: A lots of resources for regression test are reduced.
//        The time and cost savings are potentially huge.
//        automation is a guaranteed focus on all areas of testing, thereby assuring best possible quality.
//        Automation solutions can help with creating and protecting your test database.
//        quicker feedback, consistency and quicker results, thereby directly contributing to increases in productivity
//
//        disadvantages:
//        Maintenance of test data files are difficult, if the test script tests more screens.
//        we have to have knowledge about automation,this is a mandatory, in manual testing its not necessary.
//        it requires a lot of efforts at initial stage. also test tools has environment limitations,
//        Test Tools have some compatibility issues with Operating Systems and browsers.
//        Can not automate all types of testing.
//        test tools may have their own defects.7777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777innnnn]]777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777

// length     :  counting the elements inside array , it's a property of array object
// last element of an array :  arr[arr.length-1]
// length()   :  counting the characters inside String , it's a method of String object
// last char of a String :  str.charAt( str.length()-1 )
// size()     :  counting the elements inside ArrayList object, , it's a method of List Object
// last element of an arrayList :  lst.get( lst.size()-1 )