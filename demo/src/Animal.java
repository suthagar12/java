class Animal {
    void makeSound() {
        System.out.println("Generic animal sound");
    }
}
class Dogs extends Animal {
    void makeSound() {
        System.out.println("Bark! Bark!");
    }


    public static void main(String[] args) {
        Dogs dog = new Dogs();
        Animal animal = dog; // Upcasting (Dog to Animal)  
        animal.makeSound(); // Calls Dog's makeSound() method  
    }
} 