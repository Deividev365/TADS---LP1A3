package Aula_10;
import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class temperature extends JFrame {
    private JPanel Main;
    private JLabel temperatura;
    private JTextField txtTemp;
    private JComboBox cbEsc;

    public temperature() {
        cbEsc.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String n1 = txtTemp.getText();
                double n3 = Double.parseDouble(n1);
                String[] cb = new String[cbEsc.getItemCount()];
                
                
                
                if (cb[0]==n1){
                	
                    n3=(n3*1.8+32);
                    
                    JOptionPane.showInputDialog(txtTemp,n3);
                    
                }else if (cb[1]==n1){
                	
                    n3=(n3-32)/1.8;
                    JOptionPane.showInputDialog(txtTemp,n3);
                } else if (cb[2]==n1){
                    n3=(n3+273.15);
                    JOptionPane.showInputDialog(txtTemp,n3);
                }else if (cb[3]==n1){
                    n3=n3-273.15;
                    JOptionPane.showInputDialog(txtTemp,n3);
                }else if (cb[4]==n1){
                    n3=(n3+459.67)/1.8;
                    JOptionPane.showInputDialog(txtTemp,n3);
                }else if (cb[5]==n1){
                    n3=n3*1.8-459.67;
                }
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
    public static void main(String[] args) {
    	
    	
    	temperature j = new temperature();
        j.setContentPane(new temperature().Main);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
        j.pack();
        
        
        
    }
}
