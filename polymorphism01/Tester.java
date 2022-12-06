package polymorphism.polymorphism01;

public class Tester {
    public static void main(String[] args) {
        Animal animal = new Animal("Lion");
        animal.animalSound();
        animal.animalSound("Undefined");

    }
}
    /*define a tester class where you create an Animal object and call the 2 versions of the method*/
