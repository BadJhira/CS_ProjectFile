package CS_202.W5.InClass_Comparable;
// Doug Gilchrist 2/6/20 [Comparable]
public class Angle implements Comparable<Angle> {
    // properties
    private int degree, minute;

    // constructors
    public Angle(int degree, int minute) {
        setDegree(degree);
        setMinute(minute);
    }

    // mutators
    public void setDegree(int degree) { this.degree = degree; }

    public void setMinute(int minute) { this.minute = minute; }

    // accessors
    public int getDegree() { return degree; }

    public int getMinute() { return minute; }

    public String toString() {
        return "Degrees: " + getDegree() + ", "
                + "Minutes: " + getMinute();
    }

    // methods
    public int compareTo(Angle other) {
        if (this.degree - other.degree != 0)
            return this.degree - other.degree;
        else
            return this.minute - other.minute;
    }
}
