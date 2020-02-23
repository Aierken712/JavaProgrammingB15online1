package Day47;

//public final class Sport {
public  class Sport{

    // final method can not be overridden in sub class
    // it can be just used as is in sub class
    // just like family tradition
    // it should be stay the same in generations to come
    public final void doSomething(){

        System.out.println("doing regular sport");
    }

    public void doSomethingElse(){
        System.out.println("something else");
    }




}
