   package login;

import java.awt.EventQueue;





import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JOptionPane; //manejo de ventanas emergentes
import ventas.VentanaVentas;// Para relacionar el login con la ventana principal
import GestionArchivos.Gestor;


public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUser;
	private JPasswordField txtPass;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 242, 514);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/com/images/Car dealership selling cars_ Neural network AI generated royalty free stock photo.jpg")));
		lblNewLabel_1.setBounds(0, 0, 242, 257);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("FORNI-CAR");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setBounds(53, 268, 132, 32);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Drive Your Dream.");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(63, 305, 122, 12);
		panel.add(lblNewLabel_3);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.WHITE);
		separator_2.setBounds(42, 344, 150, 1);
		panel.add(separator_2);
		
		JLabel lblNewLabel_4 = new JLabel("Cristian Alejandro Silva Zamarripa");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(0, 365, 232, 12);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Angel Alejandro De Los Santos Lares");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setBounds(0, 387, 232, 12);
		panel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Diego Alejandro Delgado De La Torre");
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1.setForeground(Color.WHITE);
		lblNewLabel_4_1_1.setBounds(0, 409, 232, 12);
		panel.add(lblNewLabel_4_1_1);
		
		txtUser = new JTextField();
		txtUser.setBounds(301, 83, 233, 29);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("USERNAME");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(301, 61, 68, 12);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(301, 140, 233, 2);
		contentPane.add(separator);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPassword.setBounds(301, 172, 68, 12);
		contentPane.add(lblPassword);
		
		txtPass = new JPasswordField();
		txtPass.setBounds(301, 194, 233, 29);
		contentPane.add(txtPass);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(301, 259, 233, 2);
		contentPane.add(separator_1);
		
		JLabel lblEmail = new JLabel("EMAIL");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmail.setBounds(301, 286, 68, 12);
		contentPane.add(lblEmail);
		
		JButton btnEntrar = new JButton("SignUP");
		btnEntrar.setForeground(Color.WHITE);
		
		btnEntrar.setBackground(new Color(120, 23, 5));
		btnEntrar.setBounds(353, 382, 127, 20);
		contentPane.add(btnEntrar);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(301, 308, 233, 29);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		
		
		
		
		
		
		//funciones
		
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//recopilar datos
				String usuarioUser = txtUser.getText();
				String usuarioPassword = new String(txtPass.getPassword());
				String usuarioEmail = txtEmail.getText();
				
				//validacion campos vacíos
				if(usuarioUser.isEmpty() || usuarioPassword.isEmpty() || usuarioEmail.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Por favor, llene todos los campos", "Campos vacíos", JOptionPane.WARNING_MESSAGE);
					return;
				}
				
				//ruta archivo.txt
				Gestor archivos= new Gestor();
				boolean accesoConfirm = archivos.accesoUsuarios(usuarioUser, usuarioPassword, usuarioEmail);
				
				if(accesoConfirm) {
					JOptionPane.showMessageDialog(null, "Bienvenido");
					VentanaVentas ventas = new VentanaVentas();
					ventas.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Usuario, contraseña o correo incorrectos.");
				}
				
				
				
				
				
				
			}
		});

	}
}
