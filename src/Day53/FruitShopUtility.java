package Day53;

public class FruitShopUtility {

    public static void main(String[] args) {

        Fruit f1 = new Apple("sweet","red","Fuji");
        Fruit f2 = new Orange("sour","orange",12);
        displayFruit(f1);
        displayFruit(f2);

        System.out.println("---------------------------------");

        digestBetter(f2);

        System.out.println("---------------------------------");

        Fruit x = getMyFavoriteFruit();
        x.getDigest();
        System.out.println(x);

        System.out.println("---------------------------------");

        System.out.println("getFavoriteByType = " + getFavoriteByType(1));
        System.out.println("getFavoriteByType = " + getFavoriteByType(2));
        System.out.println("getFavoriteByType = " + getFavoriteByType(3));
    }

    public static Fruit getFavoriteByType(int type){
        if(type == 1 ) {
            return new Apple("Sweet","blue","Ginger");
        }else if(type == 2) {
            return new Orange("cripsy","green",100);
        }else{
            return null;
        }
    }

        public static void digestBetter(Fruit f){
        for(int i=1;i<5;i++){
            f.getDigest();
        }
            System.out.println("DisplayInfo = " + f.toString());
    }

    public static Fruit getMyFavoriteFruit(){
       // Fruit f = new Orange("cripsy","green",100);

        return new Apple("Sweet","blue","Ginger");
    }

    // displayFruit
    public static void displayFruit(Fruit anyFruit){
        System.out.println("Displaying fruit \n" + anyFruit.toString());
    }






}
