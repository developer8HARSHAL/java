import javaPractice.Dog;

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog("Buddy", 5);

        d1.displayInfo();
        d2.displayInfo();
    }
}