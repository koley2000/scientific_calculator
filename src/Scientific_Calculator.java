import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Window.Type;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Scientific_Calculator {

	private JFrame frm;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scientific_Calculator window = new Scientific_Calculator();
					window.frm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Scientific_Calculator() {
		initialize();
	}
	
	double num1,num2,result;
	String opr;

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frm = new JFrame();
		frm.setType(Type.UTILITY);
		frm.setResizable(false);
		frm.setTitle("Scientific Calculator");
		frm.setBounds(100, 100, 400, 659);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(10, 10, 366, 105);
		textField.setHorizontalAlignment(JTextField.RIGHT);
		frm.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("sqrt");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double t=Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+t);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(13, 126, 69, 67);
		frm.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("1/X");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double t=1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+t);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(13, 196, 69, 67);
		frm.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_7 = new JButton("EXP");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double t=Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+t);
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_7.setBounds(84, 126, 69, 67);
		frm.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_1_1 = new JButton("LOG");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double t=Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+t);
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_1.setBounds(84, 196, 69, 67);
		frm.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_8 = new JButton("Sin");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double t=Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+t);
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_8.setBounds(157, 126, 69, 67);
		frm.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_1_2 = new JButton("Sinh");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double t=Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+t);
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_2.setBounds(157, 196, 69, 67);
		frm.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_9 = new JButton("Cos");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double t=Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+t);
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_9.setBounds(230, 126, 69, 67);
		frm.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_1_3 = new JButton("Cosh");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double t=Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+t);
			}
		});
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_3.setBounds(230, 196, 69, 67);
		frm.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_10 = new JButton("Tan");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double t=Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+t);
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_10.setBounds(302, 126, 69, 67);
		frm.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_1_4 = new JButton("Tanh");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double t=Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+t);
			}
		});
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_4.setBounds(302, 196, 69, 67);
		frm.getContentPane().add(btnNewButton_1_4);
		
		JButton btnXy = new JButton("X^Y");
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				opr="x^y";
			}
		});
		btnXy.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnXy.setBounds(13, 266, 69, 67);
		frm.getContentPane().add(btnXy);
		
		JButton btnNewButton_1_5 = new JButton("X^3");
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double t=Double.parseDouble(textField.getText());
				t=t*t*t;
				textField.setText("");
				textField.setText(textField.getText()+t);
			}
		});
		btnNewButton_1_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_5.setBounds(13, 336, 69, 67);
		frm.getContentPane().add(btnNewButton_1_5);
		
		JButton btnNewButton_3 = new JButton("%");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				opr="%";
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3.setBounds(84, 266, 69, 67);
		frm.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_1_6 = new JButton("7");
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"7");
			}
		});
		btnNewButton_1_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_6.setBounds(84, 336, 69, 67);
		frm.getContentPane().add(btnNewButton_1_6);
		
		JButton btnClr = new JButton("Clr");
		btnClr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnClr.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClr.setBounds(157, 266, 69, 67);
		frm.getContentPane().add(btnClr);
		
		JButton btnNewButton_1_7 = new JButton("8");
		btnNewButton_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"8");
			}
		});
		btnNewButton_1_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_7.setBounds(157, 336, 69, 67);
		frm.getContentPane().add(btnNewButton_1_7);
		
		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				
				if(textField.getText().length() > 0)
				{
					StringBuilder s = new StringBuilder(textField.getText());
					s.deleteCharAt(textField.getText().length()-1);
					backSpace=s.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnB.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnB.setBounds(230, 266, 69, 67);
		frm.getContentPane().add(btnB);
		
		JButton btnNewButton_1_8 = new JButton("9");
		btnNewButton_1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"9");
			}
		});
		btnNewButton_1_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_8.setBounds(230, 336, 69, 67);
		frm.getContentPane().add(btnNewButton_1_8);
		
		JButton btnNewButton_6 = new JButton("+");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				opr="+";
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_6.setBounds(302, 266, 69, 67);
		frm.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_1_9 = new JButton("-");
		btnNewButton_1_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				opr="-";
			}
		});
		btnNewButton_1_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_9.setBounds(302, 336, 69, 67);
		frm.getContentPane().add(btnNewButton_1_9);
		
		JButton btnX = new JButton("X^2");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double t=Double.parseDouble(textField.getText());
				t=t*t;
				textField.setText("");
				textField.setText(textField.getText()+t);
			}
		});
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnX.setBounds(13, 407, 69, 67);
		frm.getContentPane().add(btnX);
		
		JButton btnNewButton_1_10 = new JButton("n!");
		btnNewButton_1_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double t=Double.parseDouble(textField.getText());
				double fact=1;
				while(t!=0)
				{
					fact=fact*t;
					t--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
			}
		});
		btnNewButton_1_10.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_10.setBounds(13, 477, 69, 67);
		frm.getContentPane().add(btnNewButton_1_10);
		
		JButton btnNewButton_12 = new JButton("4");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"4");
			}
		});
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_12.setBounds(84, 407, 69, 67);
		frm.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_1_11 = new JButton("1");
		btnNewButton_1_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"1");
			}
		});
		btnNewButton_1_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_11.setBounds(84, 477, 69, 67);
		frm.getContentPane().add(btnNewButton_1_11);
		
		JButton btnNewButton_13 = new JButton("5");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"5");
			}
		});
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_13.setBounds(157, 407, 69, 67);
		frm.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_1_12 = new JButton("2");
		btnNewButton_1_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"2");
			}
		});
		btnNewButton_1_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_12.setBounds(157, 477, 69, 67);
		frm.getContentPane().add(btnNewButton_1_12);
		
		JButton btnNewButton_14 = new JButton("6");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"6");
			}
		});
		btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_14.setBounds(230, 407, 69, 67);
		frm.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_1_13 = new JButton("3");
		btnNewButton_1_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"3");
			}
		});
		btnNewButton_1_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_13.setBounds(230, 477, 69, 67);
		frm.getContentPane().add(btnNewButton_1_13);
		
		JButton btnNewButton_15 = new JButton("*");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				opr="*";
			}
		});
		btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_15.setBounds(302, 407, 69, 67);
		frm.getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_1_14 = new JButton("/");
		btnNewButton_1_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				opr="/";
			}
		});
		btnNewButton_1_14.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_14.setBounds(302, 477, 69, 67);
		frm.getContentPane().add(btnNewButton_1_14);
		
		JButton btnNewButton_16 = new JButton("+/-");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Double t =Double.parseDouble(textField.getText());
				t=-t;
				textField.setText("");
				textField.setText(textField.getText()+t);
			}
		});
		btnNewButton_16.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_16.setBounds(13, 547, 69, 67);
		frm.getContentPane().add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("0");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"0");
			}
		});
		btnNewButton_17.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_17.setBounds(84, 547, 69, 67);
		frm.getContentPane().add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton(".");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+".");
			}
		});
		btnNewButton_18.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_18.setBounds(157, 547, 69, 67);
		frm.getContentPane().add(btnNewButton_18);
		
		JButton btnNewButton_20 = new JButton("=");
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num2=Double.parseDouble(textField.getText());
				
				if(opr=="+")
				{
					result=num1+num2;
					textField.setText(Double.toString(result));
				}
				else if(opr=="-")
				{
					result=num1-num2;
					textField.setText(Double.toString(result));
				}
				else if(opr=="*")
				{
					result=num1*num2;
					textField.setText(Double.toString(result));
				}
				else if(opr=="/")
				{
					result=num1/num2;
					textField.setText(Double.toString(result));
				}
				else if(opr=="%")
				{
					result=num1%num2;
					textField.setText(Double.toString(result));
				}
				else if(opr=="x^y")
				{
					result=Math.pow(num1, num2);
					textField.setText(Double.toString(result));
				}
			}
		});
		btnNewButton_20.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_20.setBounds(230, 547, 141, 67);
		frm.getContentPane().add(btnNewButton_20);
	}
}
