import javax.swing.*;

public class gui extends JFrame {
    // background color, icon

    public gui() {
        this.setSize(800, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Test");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        gui g = new gui();
    }
}
