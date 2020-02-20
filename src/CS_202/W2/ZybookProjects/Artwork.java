package CS_202.W2.ZybookProjects;

public class Artwork {
    // Declare private fields - title, yearCreated
    private String title;
    private int yearCreated;

    // Declare private field artist of type Artist
    private Artist artist;

    // Define default constructor
    public Artwork() {
        title = "None";
        yearCreated = 0;
    }

    // Define get methods: getTitle(), getYearCreated()
    public String getTitle() { return title; }

    public int getYearCreated() { return yearCreated; }

    // Define second constructor to initialize
    //       private fields (title, yearCreated, artist)
    public Artwork(String title, int yearCreated, Artist artist) {
        this.title = title;
        this.yearCreated = yearCreated;
        this.artist = artist;
    }

    // Define printInfo() method
    public void printInfo() {
        artist.printInfo();
        System.out.println("Title: " + getTitle() + ", " + getYearCreated());
    }
}

