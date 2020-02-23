package OfficeHour;

class TestData{

    public TestData(int a){
        System.out.println("A");
    }

  int a = 100;

  public void method1(){
      System.out.println("super class instance method");
  }


}

public class Super_Keyword extends TestData {

    public Super_Keyword(){
//        super();// A -->> this step is print automatically
        super(15);
        System.out.println("B");
    }

    public void method1(){
        System.out.println("sub class instance method");
    }

    public static void main(String[] args) {

//        super.a = 300; error  can not use in the static method
//        super.method1(); error  can not use in the static method

        Super_Keyword obj = new Super_Keyword();
        obj.mm();

        String result = "five";
        String result1 = "";
        int i = 4;
        result.charAt(i);
        result1 += result.charAt(i) + "";
        i--;
        System.out.println(result1);

    }

    public void mm(){
        System.out.println(super.a); // calling instance variable from super
        super.method1(); // calling instance method from super class
    }

    public void mm2(){
        System.out.println(super.a);
        this.method1(); // can use in the instance method
    }

}
