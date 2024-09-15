/*
    Lab 8.1: DisplayName

    Instruction: Create DisplayName.java and invoke display() to display your name.
    You can change your name
*/


class Name {
    public void display() {
        System.out.println("Chanakarn KINGKAEW 6622300149");
    }
}

public class DisplayName {
    public static void main(String[] args) {
        Name name = new Name();
        name.display();
    }
}
