import java.util.Formatter;

public class Room {
    private String roomNumber;
    private String roomType;
    private boolean isOccupied;

    public Room() {
        this.roomNumber = "";
        this.roomType = "";
        this.isOccupied = false;
    }

    public Room(String roomNumber, String roomType, boolean isOccupied) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isOccupied = isOccupied;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }

    public String getRoomNumber() { return this.roomNumber; }

    public String getRoomType() { return this.roomType; }

    public boolean getOccupied() { return this.isOccupied; }

    public boolean checkIn() {
        if (!this.isOccupied) {
            return this.isOccupied = true;
        }
        return false;
    }

    public boolean checkOut() {
        if (this.isOccupied) {
            this.isOccupied = false;
            return true;
        }
        return false;
    }

    public void displayRoomInfo() {
        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb);
        formatter.format("Room Number: %s\nRoom Type: %s\nOccupied: %s",
                this.roomNumber, this.roomType, (this.isOccupied ? "Yes" : "No"));
        System.out.println(sb);
    }
}
