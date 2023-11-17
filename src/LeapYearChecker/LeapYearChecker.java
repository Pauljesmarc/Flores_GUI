package LeapYearChecker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearChecker extends JFrame{
    private JTextField year;
    private JButton button;
    private JPanel panel;
    LeapYearChecker(){
        setContentPane(panel);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int yr = Integer.parseInt(year.getText());
                JFrame f = new JFrame();
                if(yr % 4 == 0 && yr % 100 != 0 || yr % 400 == 0){
                    JOptionPane.showMessageDialog(f,"Leap year");
                }else{
                    JOptionPane.showMessageDialog(f,"Not a leap year");
                }
            }
        });
    }
    public static void main(String[] args) {

        LeapYearChecker app = new LeapYearChecker();
        app.setSize(1000, 600);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Leap Year Checker");
        app.setVisible(true);
    }
}
