package CS_202.W1;
// Doug Gilchrist 1/15/2020
public class DateMain {
    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date(1989, 3, 30);
        Date date3 = new Date(2019, 12, 31);

        date1.setYear(2001);
        date1.setMonth(4);
        date1.setDay(30);

        System.out.println("Date 1");
        date1.printDate();
        System.out.println("Number of days in month: " + date1.getDaysInMonth());
        System.out.println();

        System.out.println("Date 2");
        date2.printDate();
        System.out.println("Number of days in month: " + date2.getDaysInMonth());
        System.out.println();

        System.out.println("Date 3");
        date3.printDate();
        System.out.println();

        System.out.println("Advancing all 3 dates...");

        System.out.println("Date 1");
        date1.nextDay();
        date1.printDate();
        System.out.println();

        System.out.println("Date 2");
        date2.nextDay();
        date2.printDate();
        System.out.println();

        System.out.println("Date 3");
        date3.nextDay();
        date3.printDate();
        System.out.println();
    }
}
