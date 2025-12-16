package test;

public class Test {    public static void main(String[] args) {
        Service service = new Service();

        // create type of all rooms in the hotel
        service.setRooms(1, 5000, RoomType.SUITE);
        service.setRooms(2, 300, RoomType.FAMILY);
        service.setRooms(3, 100, RoomType.INDIVIDUAL);

        // USERS
        service.setUsers(1, 6000);
        service.setUsers(2, 5000);
        service.setUsers(3, 10000);

        // ----------- DATES ------------------
        Date d1 = createDate(2025, 12, 14);
        Date d2 = createDate(2025, 12, 15);
        Date d3 = createDate(2025, 12, 16);

        //  BOOKINGS

        try {
            //  Not enough balance
            service.roomBook(1, 1, d1, d3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            service.roomBook(2, 2, d1,d2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Valid booking
        service.roomBook(3, 3, d1, d2);

        try {
            //  Room already booked
            service.roomBook(2, 2, d2, d3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //  UPDATE ROOM

        service.setRooms(1, 10000, RoomType.INDIVIDUAL);

        //PRINT RESULTS
        service.printAll();
        service.printAllUsers();

    }
    //  use calendar to create dates with day precision only
    private static Date createDate(int year, int month, int day) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }
}
