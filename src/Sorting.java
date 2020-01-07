import javax.swing.*;

public class Sorting {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sorting");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SortingPanel panel = new SortingPanel();
        frame.getContentPane().add(panel);

        frame.pack();
        frame.setVisible(true);
    }
}
