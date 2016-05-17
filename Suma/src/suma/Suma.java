package suma;


import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Suma extends JFrame {
	private JPanel panel;
	private JTextField text1, text2, text3;
	private JLabel label1,label2;
	
	public Suma(){
		super("Suma");
		panel=new JPanel();
		text1=new JTextField(5);
		label1=new JLabel("+");
		text2=new JTextField(5);
		label2=new JLabel("=");
		text3=new JTextField(5);
		text3.setEditable(false);
		text2.addFocusListener(
	    		new FocusListener(){

					@Override
					public void focusGained(FocusEvent e) {
						// TODO Auto-generated method stub
						
						
					}

					@Override
					public void focusLost(FocusEvent e) {
						 double suma=0;
						 suma=Double.parseDouble(text1.getText())+Double.parseDouble(text2.getText());
								 text3.setText(String.valueOf(suma));
						
						
					}
	    			
	    		}
	    		
	    		
	    		);
		panel.add(text1);
		panel.add(label1);
		panel.add(text2);
		panel.add(label2);
		panel.add(text3);
		this.add(panel);
		this.setSize(400,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Suma();
	}

}
