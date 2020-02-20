package CS_202.W2.ZybookProjects;

public class Artist {
    // Declare private fields - artistName, birthYear, deathYear
    private String artistName;
    private int birthYear, deathYear;

    // Define default constructor
    public Artist() {
        this("None", 0, 0);
    }

    // Define second constructor to initialize
    //       private fields (artistName, birthYear, deathYear)
    public Artist(String artistName, int birthYear, int deathYear) {
        this.artistName = artistName;
        this.birthYear = birthYear;
        this.deathYear = deathYear;
    }

    // Define get methods: getName(), getBirthYear(), getDeathYear()
    public String getName() { return artistName; }

    public int getBirthYear() { return birthYear; }

    public int getDeathYear() { return deathYear; }

    // Define printInfo() method
    //      If deathYear is entered as -1, only print birthYear
    public void printInfo() {
        if (deathYear == -1)
            System.out.println("Artist: " + getName() + ", born " + getBirthYear());
        else
            System.out.println("Artist: " + getName() +
                    " (" + getBirthYear() + "-" + getDeathYear() + ")");
    }

}
