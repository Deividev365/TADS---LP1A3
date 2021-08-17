package Aula_10;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class calculadora extends JFrame{
    private JPanel Main;
    private JTextField txtValor1;
    private JTextField txtValor2;
    private JButton calcular;
    private JComboBox comboBox1;
    private JLabel valor1;
    private JLabel valor2;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public calculadora() {
    	
        calcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
                String n1 = txtValor1.getText();
                
                String n2 = txtValor2.getText();
                
                int n3 = Integer.parseInt(n1);
                
                int n4 = Integer.parseInt(n2);
                
                
                String valor = (String)comboBox1.getSelectedItem();
                
                
                switch(valor) {
                	
                
                case "+":
                    JOptionPane.showMessageDialog(null, n3 + n4);
                	break;
                	
                case "-":
                    JOptionPane.showMessageDialog(null, n3 - n4);
                	break;
                	
                case "x":
                    JOptionPane.showMessageDialog(null, n3 * n4);
                	break;
                	
                	
                case "/":
                    JOptionPane.showMessageDialog(null, n3 / n4);
                	break;
                
                case "%":
                    JOptionPane.showMessageDialog(null, n3 % n4);	
                	break;
                
                }
            }
        });

    }

    public static void main(String[] args) {
    	
    	
    	calculadora j = new calculadora();
    	
        j.setContentPane(new calculadora().Main);
        
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
        j.pack();
    }


}
