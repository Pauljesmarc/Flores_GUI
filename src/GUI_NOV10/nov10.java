package GUI_NOV10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class nov10 extends JFrame {
    private JButton submitbtn;
    private JTextField TxtFieldName;
    private JPanel jpanel;
    private JRadioButton mrbtn;
    private JRadioButton frbtn;
    private JRadioButton orbtn;
    private JTextArea textArea;
    private JComboBox cbProgram;
    private JCheckBox Ccb;
    private JCheckBox Jcb;
    private JCheckBox CPPcb;
    private JCheckBox selectAll;


    public nov10() {
        for(Component c: jpanel.getComponents()){
            c.setForeground(Color.BLUE);
        }
        final JRadioButton[] gender = {mrbtn,frbtn,orbtn};
        JCheckBox[] languages = {Ccb,Jcb,CPPcb};
        submitbtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(cbProgram.getSelectedIndex()==0){
                    int n = JOptionPane.showConfirmDialog(null,"No Program. Use BSCS?");
                    if(n == JOptionPane.YES_OPTION){
                        cbProgram.setSelectedIndex(1);
                    }else{
                        cbProgram.setForeground(Color.red);
                        return;
                    }

                }

                cbProgram.setForeground(Color.black);
                String name = TxtFieldName.getText();
                if(name.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Enter name");
                    return;
                }
                textArea.setText("Hello " + name);
                for(JRadioButton g : gender){
                    if(g.isSelected()){
                        textArea.append("\nyou're gender is "+g.getText());
                    }
                }
                textArea.append("\nYour program is " + cbProgram.getSelectedItem());
                int ctr=0;
                for(JCheckBox cb: languages){
                    if(cb.isSelected()){
                        ctr++;
                    }
                }
                if(ctr==0){
                    textArea.append("\n No languages learned yet");
                }else{
                    textArea.append("\nLanguages learned: ");
                    for(JCheckBox cb : languages){
                        if(cb.isSelected()){
                            textArea.append(cb.getText());
                            textArea.append(" ");
                        }
                    }
                }
            }
        });
        cbProgram.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                cbProgram.setForeground(Color.black);
            }
        });
        selectAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(JCheckBox cb: languages){
                    if(selectAll.isSelected()){
                        cb.setSelected(true);
                    }else{
                        cb.setSelected(false);
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        nov10 app = new nov10();
        app.setContentPane(app.jpanel);
        app.setSize(1000,400);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("My First GUI");
        app.setVisible(true);
    }

}
