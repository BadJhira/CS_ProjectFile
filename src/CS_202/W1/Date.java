package CS_202.W1;
// Doug Gilchrist 1/15/2020
public class Date {
    // properties
    private int year, month, day;

    // constructors
    Date(int year, int month, int day) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    Date() { this(1000, 1, 1); }

    // mutators
    public void setDay(int day) {
        if (day < 1 || day > getDaysInMonth())
            throw new IllegalArgumentException("Illegal day: " + day);
        this.day = day;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12)
            throw new IllegalArgumentException("Illegal month: " + month);
        this.month = month;
    }

    public void setYear(int year) { this.year = year; }

    public void nextDay() {
        day++;
        if (day > getDaysInMonth()) {
            month++;
            day = 1;
        }
        if (month > 12) {
            year++;
            month = 1;
        }
    }

    //accessors
    public int getDay() { return day; }

    public int getMonth() { return month; }

    public int getYear() { return year; }

    public void printDate() {
        System.out.println("Date is: " + getMonth() + "/" + getDay() + "/" + getYear());
    }

    public int getDaysInMonth() {
        if (month == 2) {
            if (isLeapYear())
                return 29;
            else
                return 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    public boolean isLeapYear() {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
