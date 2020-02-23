package Day47;

public final class ExtremeSport extends Sport{

//    @Override
//    public void doSomething(){
//
//        System.out.println("doing extreme sport");
//    }

    // can not override
    // but you can do anything else
    // for example you can overload
    public void doSomething(int x){
        System.out.println("doing extreme sport");
    }


    @Override
    public final void doSomethingElse(){
   // super.doSomethingElse();
        System.out.println("doing something else in extreme sport");
    }





}
