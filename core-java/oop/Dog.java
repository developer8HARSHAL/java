package javaPractice;
public class Dog {

    private String name;
    private int age;

    public Dog(){
        this.name="unknown";
        this.age=12;
    }

    public Dog(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void displayInfo(){
        System.out.println(name + " is " + age);
    }

    public static void main(String[] args){
        Dog d = new Dog("Tom",3);
        d.displayInfo();
    }
}