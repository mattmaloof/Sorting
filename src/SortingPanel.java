import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class SortingPanel extends JPanel {
    private JLabel info;
    private JTextField num1, num2, num3, num4, num5;
    private JButton button;

    public SortingPanel(){
        info = new JLabel();
        num1 = new JTextField(3);
        num2 = new JTextField(3);
        num3 = new JTextField(3);
        num4 = new JTextField(3);
        num5 = new JTextField(3);
        button = new JButton("Sort");
        add(num1);
        add(num2);
        add(num3);
        add(num4);
        add(num5);
        add(button);
        add(info);
        setPreferredSize(new Dimension(600,70));
        setBackground(Color.yellow);
        ButtonListener buttonListener = new ButtonListener();
        button.addActionListener(buttonListener);
    }
    public class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            int[] arr ={
                Integer.parseInt(num1.getText()),
                Integer.parseInt(num2.getText()),
                Integer.parseInt(num3.getText()),
                Integer.parseInt(num4.getText()),
                Integer.parseInt(num5.getText())
            };
            selectionSort(arr);

            info.setText(Arrays.toString(arr));

        }
    }
    public static void selectionSort(int[] a){
        for(int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i+1; j < a.length; j++){
                if (a[j] < a[min]){
                    min = j;

                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;

        }
    }
}
