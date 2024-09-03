class Animals {
    void makeSound() {
        System.out.println("Generic animal sound");
    }
}
class Dog extends Animals {
    void makeSound() {
        System.out.println("Bark! Bark!");
    }
    void fetch() {
        System.out.println("Fetching the ball!");
    }
}
public class CastingExample1 {
    public static void main(String[] args) {
        Dog animal = new Dog();
        animal.makeSound();
//        Dog dog = (Dog) animal;
//        dog.makeSound();
//        dog.fetch();
    }
}
