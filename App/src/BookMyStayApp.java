public class BookMyStayApp {

    // Main Method
    public static void main(String[] args) {

        System.out.println("Hotel Room Initialization\n");

        SingleRoom single = new SingleRoom();
        System.out.println("Single Room:");
        single.displayRoomDetails();
        System.out.println("Available: 5\n");

        DoubleRoom dbl = new DoubleRoom();
        System.out.println("Double Room:");
        dbl.displayRoomDetails();
        System.out.println("Available: 3\n");

        SuiteRoom suite = new SuiteRoom();
        System.out.println("Suite Room:");
        suite.displayRoomDetails();
        System.out.println("Available: 2");
    }
}