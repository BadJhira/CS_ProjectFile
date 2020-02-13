package CS_141.W11.InClass;
// Doug Gilchrist 12/3/19 [Classes & Objects]
public class Date {
    // properties
    int year;
    int month;
    int day;

    // constructors
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // methods
    public int getDaysInMonth() {
        switch(this.month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return 28;
            default:
                return 31;
        }
    }
}
