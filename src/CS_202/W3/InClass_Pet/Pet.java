package CS_202.W3.InClass_Pet;
// Doug Gilchrist 1/22/20 [Pet Inheritance]
public class Pet {
    // properties
    private String name, breed, size;
    private int age;

    // constructors
    public Pet() { this("no_name", -1, "no_breed", "no_size"); }

    public Pet(String name, int age, String breed, String size) {
        setName(name);
        setAge(age);
        setBreed(breed);
        setSize(size);
    }

    // mutators
    public void setName(String name) { this.name = name; }

    public void setAge(int age) { this.age = age; }

    public void setBreed(String breed) { this.breed = breed; }

    public void setSize(String size) { this.size = size;}

    public void play() {
        System.out.println(getName() + " is playing!");
    }

    // accessors
    public String getName() { return name; }

    public int getAge() { return age; }

    public String getBreed() { return breed; }

    public String getSize() { return size; }

    public String getInfo() {
        return "Name: " + getName() + "\n"
                + "Age: " + getAge() + "\n"
                + "Breed: " + getBreed() + "\n"
                + "Size: " + getSize();
    }
}
