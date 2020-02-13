package CS_202.W3.InClass_Pet;
// Doug Gilchrist 1/22/20 [Pet Inheritance]
public class PetMain {
    public static void main(String[] args) {
        // Dog 1
        Dog dog1 = new Dog("Tachanka", 5, "German Shepherd", "Large", "Guide");
        System.out.println(dog1.getInfo());
        dog1.play();

        System.out.println();
        // Dog 2
        Dog dog2 = new Dog();
        dog2.setName("Lusho");
        dog2.setAge(7);
        dog2.setBreed("Labrador");
        dog2.setSize("Medium");
        dog2.setService("None");
        System.out.println(dog2.getInfo());
        dog2.play();

        System.out.println();
        // Cat
        Cat cat1 = new Cat("Baphomet", 8, "Calico", "Small", "Long");
        System.out.println(cat1.getInfo());
        cat1.play();
    }
}
