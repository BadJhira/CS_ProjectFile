package CS_141.W11.InClass;
// Doug Gilchrist 12/3/19 [Classes & Objects]
public class DateMain {
    public static void main(String[] args) {
        Date date1 = new Date(2019, 12, 3);

        System.out.println("Date 1: " + date1.month + "/" + date1.day + "/" + date1.year);
        System.out.println("Days in month: " + date1.getDaysInMonth());
    }
}
