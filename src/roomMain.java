public class roomMain {
    public static void main(String[] args) {
        Room room = new Room("101", "Single", false);

        System.out.println("Room Details");
        room.displayRoomInfo();

        System.out.println("\nChecking into the room...");
        if (room.checkIn()) {
            System.out.println("Check-in successful!");
        }
        else {
            System.out.println("Room is already occupied!");
        }

        System.out.println("\nRoom Details after check-in:");
        room.displayRoomInfo();

        System.out.println("\nChecking out of the room...");
        if (room.checkOut()) {
            System.out.println("Check-out successful!");
        }
        else {
            System.out.println("Room is not occupied!");
        }

        System.out.println("\nRoom Details after check-out:");
        room.displayRoomInfo();
    }
}
