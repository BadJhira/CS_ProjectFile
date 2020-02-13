package CS_141.W4;
// Doug Gilchrist 10/17/19 Hotel Rooms
import java.util.*;

public class HotelRooms {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        getRoomTotal(console);
    }

    public static void getRoomTotal(Scanner console) {
        System.out.println("This program computes the total charge for a hotel stay.");
        double charge = getRate(console);
        System.out.println("Total charge will be $" + charge);
    }

    public static double getRate(Scanner console) {
        System.out.print("Rate type (AAA, senior, regular)? ");
        double rate = getRateType(console.next());
        System.out.print("number of rooms? ");
        int rooms = console.nextInt();
        System.out.print("number of nights? ");
        int nights = console.nextInt();
        System.out.print("guests per room? ");
        int guests = getGuests(console.nextInt());
        double total = rooms * nights * rate + guests;
        return total;
    }

    public static double getRateType(String rateType) {
        double rate;
        if (rateType.equals("AAA")) {
            rate = 89.75;
        } else if (rateType.equals("senior")) {
            rate = 94.75;
        } else {
            rate = 99.75;
        }
        return rate;
    }

    public static int getGuests(int guestNum) {
        int rate = 0;
        if (guestNum > 2) {
            rate += (guestNum - 2) * 10;
        }
        return rate;
    }
}
