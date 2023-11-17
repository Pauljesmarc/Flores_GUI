package FoodOrderingSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class FoodOrderingSystem extends JFrame{
    private JPanel panel;
    private JCheckBox friesCheckBox;
    private JCheckBox softDrinksCheckBox;
    private JCheckBox teaCheckBox;
    private JCheckBox burgerCheckBox;
    private JCheckBox pizzaCheckBox;
    private JCheckBox sundaeCheckBox;
    private JCheckBox dsc1;
    private JCheckBox dsc2;
    private JCheckBox dsc3;
    private JCheckBox dsc4;
    private JLabel FOOD;
    private JLabel DISCOUNT;
    private JButton orderButton;

    FoodOrderingSystem(){
        setContentPane(panel);
        orderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double sum=0;
                double dis=0;
                JFrame f = new JFrame();
                if(pizzaCheckBox.isSelected()){
                    sum+=100;
                }
                if(burgerCheckBox.isSelected()){
                    sum+=80;
                }
                if(friesCheckBox.isSelected()){
                    sum+=65;
                }
                if(softDrinksCheckBox.isSelected()){
                    sum+=55;
                }
                if(teaCheckBox.isSelected()){
                    sum+=50;
                }
                if(sundaeCheckBox.isSelected()){
                    sum+=40;
                }
                if(dsc1.isSelected()){
                    dis = 0.00;
                }
                if(dsc2.isSelected()){
                    dis = 0.05;
                }
                if(dsc3.isSelected()){
                    dis = 0.10;
                }
                if(dsc4.isSelected()){
                    dis = 0.15;
                }
                sum-=(sum*dis);
                JOptionPane.showMessageDialog(f,"The total price is Php " + String.valueOf(sum));
            }
        });
    }
    public static void main(String[] args) {

        FoodOrderingSystem app = new FoodOrderingSystem();
        app.setSize(1000, 600);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Leap Year Checker");
        app.setVisible(true);
    }
}
