package Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JPanel panel;
    private JLabel num1;
    private JTextField tfnum1;
    private JLabel num2;
    private JComboBox comboBox;
    private JLabel result;
    private JButton button;
    private JTextField tfnum2;

    Calculator(){
        setContentPane(panel);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1,num2,res;
                String op;
                num1 = Integer.parseInt(tfnum1.getText());
                num2 = Integer.parseInt(tfnum2.getText());
                op = (String) comboBox.getSelectedItem();
                switch (op){
                    case "+":
                        res = num1+num2;
                        result.setText(String.valueOf(res));
                        break;
                    case "-":
                        res = num1-num2;
                        result.setText(String.valueOf(res));
                        break;
                    case "*":
                        res = num1*num2;
                        result.setText(String.valueOf(res));
                        break;
                    case "/":
                        res = num1/num2;
                        result.setText(String.valueOf(res));
                        break;
                }
            }
        });
    }
    public static void main(String[] args) {
        Calculator app = new Calculator();
        app.setSize(1000, 600);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Simple Calculator");
        app.setVisible(true);

    }
}
