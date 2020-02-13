package CS_202.W3.InClass_Pet;
// Doug Gilchrist 1/22/20 [Pet Inheritance]
public class Dog extends Pet {
    // properties
    private String service;

    // constructors
    public Dog() {
        this("no_name", -1, "no_breed", "no_size", "no_service");
    }

    public Dog(String name, int age, String breed, String size, String service) {
        super(name, age, breed, size);
        setService(service);
    }

    // mutators
    public void setService(String service) { this.service = service; }

    public void play() {
        System.out.println(getName() + " is chasing their tail!");
    }

    // accessors
    public String getService() { return service; }

    public String getInfo() {
        return "===Dog===\n"
                + super.getInfo() + "\n"
                + "Service: " + getService();
    }
}
