package Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class loginGui {

	private JFrame frmGirishSistemi;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField2;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginGui window = new loginGui();
					window.frmGirishSistemi.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	ArrayList<String> login=new ArrayList();
	ArrayList<String> password=new ArrayList();
	private JLabel lblNewLabel2;


	/**
	 * Create the application.
	 */
	public loginGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGirishSistemi = new JFrame();
		frmGirishSistemi.setBackground(new Color(0, 255, 0));
		frmGirishSistemi.setType(Type.POPUP);
		frmGirishSistemi.setTitle("Girish sistemi");
		frmGirishSistemi.getContentPane().setForeground(Color.RED);
		frmGirishSistemi.setBounds(100, 100, 600, 500);
		frmGirishSistemi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGirishSistemi.getContentPane().setLayout(null);
		
		JLabel labelGirish = new JLabel("Sisteme girish");
		labelGirish.setHorizontalAlignment(SwingConstants.CENTER);
		labelGirish.setFont(new Font("Tahoma", Font.PLAIN, 30));
		labelGirish.setBounds(180, 38, 210, 55);
		frmGirishSistemi.getContentPane().add(labelGirish);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setBounds(171, 150, 230, 34);
		frmGirishSistemi.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(171, 222, 230, 34);
		frmGirishSistemi.getContentPane().add(passwordField);
		
		JLabel labelLogin = new JLabel("Login: ");
		labelLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelLogin.setBounds(97, 150, 61, 34);
		frmGirishSistemi.getContentPane().add(labelLogin);
		
		JLabel labelPassword = new JLabel("Password:");
		labelPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelPassword.setBounds(65, 222, 96, 34);
		frmGirishSistemi.getContentPane().add(labelPassword);
		
		passwordField2 = new JPasswordField();
		passwordField2.setBounds(171, 296, 230, 34);
		frmGirishSistemi.getContentPane().add(passwordField2);
		
		lblNewLabel = new JLabel("Repeat Password:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 296, 148, 34);
		frmGirishSistemi.getContentPane().add(lblNewLabel);
		
		ArrayList<String> login=new ArrayList();
		ArrayList<String> password=new ArrayList();

		
		JButton btn1 = new JButton("Daxil et");
		btn1.setForeground(Color.BLACK);
		btn1.setBackground(Color.CYAN);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(passwordField.getText().equals(passwordField2.getText())) {
				login.add(textField.getText());
				password.add(passwordField.getText());
				lblNewLabel2.setText("Daxil edildi : "+textField.getText()+", "+passwordField.getText());
				}
			}
		});
		btn1.setBounds(171, 352, 89, 34);
		frmGirishSistemi.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("Yenil\u0259");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				passwordField.setText("");
				passwordField2.setText("");
				lblNewLabel2.setText("");
			}
		});
		btn2.setBackground(Color.CYAN);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn2.setBounds(312, 352, 89, 34);
		frmGirishSistemi.getContentPane().add(btn2);
		
		lblNewLabel2 = new JLabel("");
		lblNewLabel2.setBackground(Color.WHITE);
		lblNewLabel2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel2.setBounds(65, 425, 437, 25);
		frmGirishSistemi.getContentPane().add(lblNewLabel2);
	}
}
