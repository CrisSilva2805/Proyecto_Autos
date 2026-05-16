package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import java.awt.Font;

public class Login2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login2 frame = new Login2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 715, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 300, 473);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Login2.class.getResource("/com/images/Car dealership selling cars_ Neural network AI generated royalty free stock photo.jpg")));
		lblNewLabel_1.setBounds(0, 0, 300, 253);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("FORNI-CAR");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(101, 284, 102, 19);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Your Road Begins With Us.");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(75, 313, 161, 12);
		panel.add(lblNewLabel_3);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(62, 357, 175, 2);
		panel.add(separator_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("Cristian Alejandro Silva Zamarripa\r\n");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_3_1.setBounds(62, 369, 193, 19);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Angel Alejandro De Los Santos Lares");
		lblNewLabel_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_3_1_1.setBounds(62, 398, 193, 19);
		panel.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Diego Alejandro Delgado De La Torre\r\n");
		lblNewLabel_3_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_3_1_1_1.setBounds(62, 430, 193, 19);
		panel.add(lblNewLabel_3_1_1_1);
		
		JButton btnNewButton = new JButton("SignUp");
		btnNewButton.setForeground(SystemColor.window);
		btnNewButton.setBackground(new Color(241, 57, 83));
		btnNewButton.setBounds(443, 390, 132, 20);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setBounds(380, 73, 243, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(380, 135, 243, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel = new JLabel("USERNAME");
		lblNewLabel.setBounds(380, 51, 68, 12);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setBounds(380, 171, 81, 12);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(380, 193, 243, 25);
		contentPane.add(passwordField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(380, 311, 243, 25);
		contentPane.add(textField_1);
		
		JLabel lblEmail = new JLabel("EMAIL");
		lblEmail.setBounds(380, 289, 68, 12);
		contentPane.add(lblEmail);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(380, 263, 243, 2);
		contentPane.add(separator_1);

	}
}
