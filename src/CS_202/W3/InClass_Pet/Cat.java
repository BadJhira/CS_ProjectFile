package CS_202.W3.InClass_Pet;
// Doug Gilchrist 1/22/20 [Pet Inheritance]
public class Cat extends Pet {
    // properties
    private String whiskers;

    // constructors
    public Cat() {
        this("no_name", -1, "no_breed", "no_size", "no_whiskers");
    }

    public Cat(String name, int age, String breed, String size, String whiskers) {
        super(name, age, breed, size);
        setWhiskers(whiskers);
    }

    // mutators
    public void setWhiskers(String whiskers) { this.whiskers = whiskers; }

    public void play() {
        System.out.println(getName() + " is chasing mice!");
    }

    // accessors
    public String getWhiskers() { return whiskers; }

    public String getInfo() {
        return "===Cat===\n"
                + super.getInfo() + "\n"
                + "Whiskers: " + getWhiskers();
    }
}
