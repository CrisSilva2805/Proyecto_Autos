package stock;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Stock extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField txtBuscarPorModelomarca;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stock frame = new Stock();
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
	public Stock() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 548);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(24, 25, 29));
		panel.setBounds(0, 0, 836, 59);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel HOME = new JLabel("HOME");
		HOME.setHorizontalAlignment(SwingConstants.CENTER);
		HOME.setFont(new Font("Agency FB", Font.PLAIN, 20));
		HOME.setForeground(Color.WHITE);
		HOME.setBounds(0, 0, 100, 58);
		panel.add(HOME);
		HOME.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				HOME.setOpaque(true);
				HOME.setBackground(new Color(158, 23, 20));
			}
			
			@Override
		    public void mouseExited(MouseEvent e) {
		        // Al salir, vuelve a poner el fondo del mismo color que el panel (o hazlo transparente de nuevo)
				HOME.setBackground(panel.getBackground()); 
		        // Si prefieres que vuelva a ser transparente por completo: HOME.setOpaque(false);
		    }
		});
		
		
		
		
		
		
		
		JLabel PROVEEDORES = new JLabel("SUPPLIERS");
		PROVEEDORES.setHorizontalAlignment(SwingConstants.CENTER);
		PROVEEDORES.setForeground(Color.WHITE);
		PROVEEDORES.setFont(new Font("Agency FB", Font.PLAIN, 20));
		PROVEEDORES.setBounds(200, 0, 100, 58);
		panel.add(PROVEEDORES);
		PROVEEDORES.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				PROVEEDORES.setOpaque(true);
				PROVEEDORES.setBackground(new Color(158, 23, 20));
			}
			
			@Override
		    public void mouseExited(MouseEvent e) {
		        // Al salir, vuelve a poner el fondo del mismo color que el panel (o hazlo transparente de nuevo)
				PROVEEDORES.setBackground(panel.getBackground()); 
		        // Si prefieres que vuelva a ser transparente por completo: HOME.setOpaque(false);
		    }
		});
		
		
		JLabel STOCK = new JLabel("STOCK");
		STOCK.setHorizontalAlignment(SwingConstants.CENTER);
		STOCK.setForeground(Color.WHITE);
		STOCK.setFont(new Font("Agency FB", Font.PLAIN, 20));
		STOCK.setBounds(100, 0, 100, 58);
		panel.add(STOCK);
		STOCK.setOpaque(true);
		STOCK.setBackground(new Color(158, 23, 20));
		
		
		
		
		
		JLabel VENTAS = new JLabel("VENTAS");
		VENTAS.setHorizontalAlignment(SwingConstants.CENTER);
		VENTAS.setForeground(Color.WHITE);
		VENTAS.setFont(new Font("Agency FB", Font.PLAIN, 20));
		VENTAS.setBounds(300, 0, 100, 58);
		panel.add(VENTAS);
		VENTAS.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				VENTAS.setOpaque(true);
				VENTAS.setBackground(new Color(158, 23, 20));
			}
			
			@Override
		    public void mouseExited(MouseEvent e) {
		        // Al salir, vuelve a poner el fondo del mismo color que el panel (o hazlo transparente de nuevo)
				VENTAS.setBackground(panel.getBackground()); 
		        // Si prefieres que vuelva a ser transparente por completo: HOME.setOpaque(false);
		    }
		});
		
		
		
		
		JLabel TOUNING = new JLabel("TOUNING");
		TOUNING.setHorizontalAlignment(SwingConstants.CENTER);
		TOUNING.setForeground(Color.WHITE);
		TOUNING.setFont(new Font("Agency FB", Font.PLAIN, 20));
		TOUNING.setBounds(400, 0, 100, 58);
		panel.add(TOUNING);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(214, 211, 209));
		panel_1.setBounds(5, 63, 307, 440);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTRO DE STOCK (binario)");
		lblNewLabel.setForeground(new Color(159, 7, 18));
		lblNewLabel.setFont(new Font("Agency FB", Font.BOLD, 25));
		lblNewLabel.setBounds(29, 24, 241, 36);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID/Código:");
		lblNewLabel_1.setFont(new Font("Agency FB", Font.BOLD, 17));
		lblNewLabel_1.setBounds(10, 91, 56, 24);
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(76, 97, 96, 18);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Marca:");
		lblNewLabel_1_1.setFont(new Font("Agency FB", Font.BOLD, 17));
		lblNewLabel_1_1.setBounds(10, 126, 56, 24);
		panel_1.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(76, 132, 194, 18);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Modelo:");
		lblNewLabel_1_1_1.setFont(new Font("Agency FB", Font.BOLD, 17));
		lblNewLabel_1_1_1.setBounds(10, 160, 56, 24);
		panel_1.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(76, 166, 194, 18);
		panel_1.add(textField_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Año:");
		lblNewLabel_1_1_1_1.setFont(new Font("Agency FB", Font.BOLD, 17));
		lblNewLabel_1_1_1_1.setBounds(10, 194, 56, 24);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(76, 200, 65, 18);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Precio:");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Agency FB", Font.BOLD, 17));
		lblNewLabel_1_1_1_1_1.setBounds(10, 228, 56, 24);
		panel_1.add(lblNewLabel_1_1_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(76, 234, 65, 18);
		panel_1.add(textField_4);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Cantidad:");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Agency FB", Font.BOLD, 17));
		lblNewLabel_1_1_1_1_1_1.setBounds(10, 262, 56, 24);
		panel_1.add(lblNewLabel_1_1_1_1_1_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(76, 262, 65, 18);
		panel_1.add(textField_5);
		
		JButton btnNewButton = new JButton("Registrar Auto");
		btnNewButton.setIcon(new ImageIcon(Stock.class.getResource("/com/images/logoMas.jpg")));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBackground(new Color(159, 7, 18));
		btnNewButton.setBounds(10, 317, 149, 20);
		panel_1.add(btnNewButton);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setForeground(Color.WHITE);
		btnActualizar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnActualizar.setBackground(new Color(0, 0, 0));
		btnActualizar.setBounds(10, 343, 149, 20);
		panel_1.add(btnActualizar);
		
		JButton btnNewButton_1 = new JButton("Limpiar Campos");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1.setBounds(165, 343, 132, 20);
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(214, 211, 209));
		panel_2.setBounds(320, 63, 510, 440);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblConsultaDeStock = new JLabel("CONSULTA DE STOCK DISPONIBLE");
		lblConsultaDeStock.setBounds(115, 28, 291, 30);
		lblConsultaDeStock.setForeground(new Color(0, 0, 0));
		lblConsultaDeStock.setFont(new Font("Agency FB", Font.BOLD, 25));
		panel_2.add(lblConsultaDeStock);
		
		txtBuscarPorModelomarca = new JTextField();
		txtBuscarPorModelomarca.setFont(new Font("Tahoma", Font.BOLD, 10));
		txtBuscarPorModelomarca.setForeground(new Color(190, 190, 190));
		txtBuscarPorModelomarca.setText("Buscar por Modelo/Marca");
		txtBuscarPorModelomarca.setBounds(86, 68, 374, 18);
		panel_2.add(txtBuscarPorModelomarca);
		txtBuscarPorModelomarca.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(Stock.class.getResource("/com/images/lupa.jpg")));
		btnNewButton_2.setBounds(63, 68, 20, 20);
		panel_2.add(btnNewButton_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(48, 96, 429, 209);
		panel_2.add(panel_3);
		TOUNING.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				TOUNING.setOpaque(true);
				TOUNING.setBackground(new Color(158, 23, 20));
			}
			
			@Override
		    public void mouseExited(MouseEvent e) {
		        // Al salir, vuelve a poner el fondo del mismo color que el panel (o hazlo transparente de nuevo)
				TOUNING.setBackground(panel.getBackground()); 
		        // Si prefieres que vuelva a ser transparente por completo: HOME.setOpaque(false);
		    }
		});

	}
}
