package Practice;

public abstract class Animal {

    String name;
    String gender;
    String color;
    byte age;

    public Animal(String name,String gender,String color,byte age){
        this.name = name;
        this.gender = gender;
        this.color = color;
        this.age = age;
    }

    public abstract void speak();
    public abstract void eat();
    public abstract void sleep();
    public abstract void drink();

    public void getInfo(){
        System.out.println(name);
        System.out.println(gender);
        System.out.println(color);
        System.out.println(age);
    }
}

class Dog extends Animal{

    public Dog(String name, String gender, String color, byte age) {
        super(name, gender, color, age);
    }

    public void speak(){
        System.out.println("woof");
    }

    public void eat(){
        System.out.println("8 hours");
    }

    public void sleep(){
        System.out.println("KFC");
    }

    public void drink(){
        System.out.println("Milk shake");
    }
}

class Cat extends Animal{

    public Cat(String name, String gender, String color, byte age) {
        super(name, gender, color, age);
    }

    @Override
    public void speak() {
        System.out.println("meaw");
    }

    @Override
    public void eat() {
        System.out.println("14 hours");
    }

    @Override
    public void sleep() {
        System.out.println("m&m");
    }

    @Override
    public void drink() {
        System.out.println("Hot chocolate");
    }
}

class Caw extends Animal{

    public Caw(String name, String gender, String color, byte age) {
        super(name, gender, color, age);
    }

    @Override
    public void speak() {
        System.out.println("mo");
    }

    @Override
    public void eat() {
        System.out.println("5 hours");
    }

    @Override
    public void sleep() {
        System.out.println("grace");
    }

    @Override
    public void drink() {
        System.out.println("coffee with sugar");
    }
}