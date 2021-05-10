package Calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private double answer,number;
	int operation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator1 frame = new Calculator1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void addNumber(String str) {
		textField.setText(textField.getText()+ str);
	}
	
	public void calculate() {
		switch(operation) {
		case 1:
			answer=number+Double.parseDouble(textField.getText());
			textField.setText(Double.toString(answer));
			break;
			
		case 2:
			answer=number-Double.parseDouble(textField.getText());
			textField.setText(Double.toString(answer));
			break;
			
		case 3:
			answer=number*Double.parseDouble(textField.getText());
			textField.setText(Double.toString(answer));
			break;
			
		case 4:
			answer=number/Double.parseDouble(textField.getText());
			textField.setText(Double.toString(answer));
			break;	
		}
		
		
	}

	/**
	 * Create the frame.
	 */
	public Calculator1() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(10, 11, 414, 89);
		contentPane.add(panel1);
		panel1.setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Adobe Devanagari", Font.BOLD, 30));
		textField.setEnabled(false);
		textField.setEditable(false);
		textField.setBounds(10, 41, 394, 48);
		panel1.add(textField);
		textField.setColumns(10);
		
		JLabel lbl1 = new JLabel("");
		lbl1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbl1.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl1.setBounds(10, 11, 394, 29);
		panel1.add(lbl1);
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(10, 123, 414, 327);
		contentPane.add(panel2);
		panel2.setLayout(new GridLayout(4, 4, 20, 20));
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumber(e.getActionCommand());
			}
		});
		btn1.setFont(new Font("Adobe Devanagari", Font.BOLD, 30));
		panel2.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumber(e.getActionCommand());

			}
		});
		btn2.setFont(new Font("Adobe Devanagari", Font.BOLD, 30));
		panel2.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumber(e.getActionCommand());

			}
		});
		btn3.setFont(new Font("Adobe Devanagari", Font.BOLD, 30));
		panel2.add(btn3);
		
		JButton btn4 = new JButton("+");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(textField.getText());
				operation=1;
				textField.setText("");
				lbl1.setText(number+e.getActionCommand());
			}
		});
		btn4.setFont(new Font("Adobe Devanagari", Font.BOLD, 30));
		panel2.add(btn4);
		
		JButton btn5 = new JButton("4");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumber(e.getActionCommand());

			}
		});
		btn5.setFont(new Font("Adobe Devanagari", Font.BOLD, 30));
		panel2.add(btn5);
		
		JButton btn6 = new JButton("5");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumber(e.getActionCommand());

			}
		});
		btn6.setFont(new Font("Adobe Devanagari", Font.BOLD, 30));
		panel2.add(btn6);
		
		JButton btn7 = new JButton("6");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumber(e.getActionCommand());

			}
		});
		btn7.setFont(new Font("Adobe Devanagari", Font.BOLD, 30));
		panel2.add(btn7);
		
		JButton btn8 = new JButton("-");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(textField.getText());
				operation=2;
				textField.setText("");
				lbl1.setText(number+e.getActionCommand());
			}
		});
		btn8.setFont(new Font("Adobe Devanagari", Font.BOLD, 30));
		panel2.add(btn8);
		
		JButton btn9 = new JButton("7");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumber(e.getActionCommand());

			}
		});
		btn9.setFont(new Font("Adobe Devanagari", Font.BOLD, 30));
		panel2.add(btn9);
		
		JButton btn10 = new JButton("8");
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumber(e.getActionCommand());

			}
		});
		btn10.setFont(new Font("Adobe Devanagari", Font.BOLD, 30));
		panel2.add(btn10);
		
		JButton btn11 = new JButton("9");
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumber(e.getActionCommand());

			}
		});
		btn11.setFont(new Font("Adobe Devanagari", Font.BOLD, 30));
		panel2.add(btn11);
		
		JButton btn12 = new JButton("*");
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(textField.getText());
				operation=3;
				textField.setText("");
				lbl1.setText(number+e.getActionCommand());
			}
		});
		btn12.setFont(new Font("Adobe Devanagari", Font.BOLD, 30));
		panel2.add(btn12);
		
		JButton btn13 = new JButton("=");
		btn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		btn13.setFont(new Font("Adobe Devanagari", Font.BOLD, 30));
		panel2.add(btn13);
		
		JButton btn14 = new JButton("0");
		btn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumber(e.getActionCommand());
			}
		});
		btn14.setFont(new Font("Adobe Devanagari", Font.BOLD, 30));
		panel2.add(btn14);
		
		JButton btn15 = new JButton("C");
		btn15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btn15.setFont(new Font("Adobe Devanagari", Font.BOLD, 30));
		panel2.add(btn15);
		
		JButton btn16 = new JButton("/");
		btn16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(textField.getText());
				operation=4;
				textField.setText("");
				lbl1.setText(number+e.getActionCommand());
			}
		});
		btn16.setFont(new Font("Adobe Devanagari", Font.BOLD, 30));
		panel2.add(btn16);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(355, 11, 58, 30);
		contentPane.add(lblNewLabel);
	}
}
