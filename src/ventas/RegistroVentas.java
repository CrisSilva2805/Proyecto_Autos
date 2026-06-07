package ventas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JSeparator;

public class RegistroVentas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBuscarAuto;
	private JTable catalogoVentas;
	private JTextField txtAutoSeleccionado;
	private JTextField txtPrecioTotal;
	private JTextField txtNombre;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroVentas frame = new RegistroVentas();
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
	public RegistroVentas() {
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
		
		
		
		
		
		
		
		JLabel CONSULTAS = new JLabel("CONSULTAS");
		CONSULTAS.setHorizontalAlignment(SwingConstants.CENTER);
		CONSULTAS.setForeground(Color.WHITE);
		CONSULTAS.setFont(new Font("Agency FB", Font.PLAIN, 20));
		CONSULTAS.setBounds(200, 0, 100, 58);
		panel.add(CONSULTAS);
		CONSULTAS.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				CONSULTAS.setOpaque(true);
				CONSULTAS.setBackground(new Color(158, 23, 20));
			}
			
			@Override
		    public void mouseExited(MouseEvent e) {
		        // Al salir, vuelve a poner el fondo del mismo color que el panel (o hazlo transparente de nuevo)
				CONSULTAS.setBackground(panel.getBackground()); 
		        // Si prefieres que vuelva a ser transparente por completo: HOME.setOpaque(false);
		    }
		});
		
		
		JLabel STOCK = new JLabel("STOCK");
		STOCK.setHorizontalAlignment(SwingConstants.CENTER);
		STOCK.setForeground(Color.WHITE);
		STOCK.setFont(new Font("Agency FB", Font.PLAIN, 20));
		STOCK.setBounds(100, 0, 100, 58);
		panel.add(STOCK);
		STOCK.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				STOCK.setOpaque(true);
				STOCK.setBackground(new Color(158, 23, 20));
			}
			
			@Override
		    public void mouseExited(MouseEvent e) {
		        // Al salir, vuelve a poner el fondo del mismo color que el panel (o hazlo transparente de nuevo)
				STOCK.setBackground(panel.getBackground()); 
		        // Si prefieres que vuelva a ser transparente por completo: HOME.setOpaque(false);
		    }
		});
		
		
		
		
		JLabel VENTAS = new JLabel("VENTAS");
		VENTAS.setHorizontalAlignment(SwingConstants.CENTER);
		VENTAS.setForeground(Color.WHITE);
		VENTAS.setFont(new Font("Agency FB", Font.PLAIN, 20));
		VENTAS.setBounds(300, 0, 100, 58);
		panel.add(VENTAS);
		VENTAS.setOpaque(true);
		VENTAS.setBackground(new Color(158, 23, 20));
		
		
		
		
		JLabel TOUNING = new JLabel("TOUNING");
		TOUNING.setHorizontalAlignment(SwingConstants.CENTER);
		TOUNING.setForeground(Color.WHITE);
		TOUNING.setFont(new Font("Agency FB", Font.PLAIN, 20));
		TOUNING.setBounds(400, 0, 100, 58);
		panel.add(TOUNING);
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(324, 70, 500, 430);
		contentPane.add(panel_1);
		panel_1.setBackground(new Color(255, 255, 255));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 70, 300, 430);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CATÁLOGO DE VEHÍCULOS");
		lblNewLabel.setBounds(76, 11, 142, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2.add(lblNewLabel);
		
		txtBuscarAuto = new JTextField();
		txtBuscarAuto.setBounds(0, 31, 196, 20);
		panel_2.add(txtBuscarAuto);
		txtBuscarAuto.setColumns(10);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(206, 30, 84, 23);
		panel_2.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 62, 290, 368);
		panel_2.add(scrollPane);
		
		catalogoVentas = new JTable();
		scrollPane.setColumnHeaderView(catalogoVentas);
		panel_1.setBackground(new Color(214, 211, 209));
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Vehículo seleccionado:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 11, 151, 14);
		panel_1.add(lblNewLabel_1);
		
		txtAutoSeleccionado = new JTextField();
		txtAutoSeleccionado.setEditable(false);
		txtAutoSeleccionado.setBounds(10, 36, 271, 20);
		panel_1.add(txtAutoSeleccionado);
		txtAutoSeleccionado.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Precio total:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 72, 133, 14);
		panel_1.add(lblNewLabel_2);
		
		txtPrecioTotal = new JTextField();
		txtPrecioTotal.setEditable(false);
		txtPrecioTotal.setBounds(10, 97, 271, 20);
		panel_1.add(txtPrecioTotal);
		txtPrecioTotal.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(255, 255, 255));
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(10, 128, 459, 2);
		panel_1.add(separator);
		
		JLabel lblNewLabel_2_1 = new JLabel("Nombre(s):");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1.setBounds(10, 141, 133, 14);
		panel_1.add(lblNewLabel_2_1);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(10, 164, 271, 20);
		panel_1.add(txtNombre);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Apellidos:");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1_1.setBounds(10, 195, 133, 14);
		panel_1.add(lblNewLabel_2_1_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 219, 271, 20);
		panel_1.add(textField);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Teléfono:");
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1_1_1.setBounds(10, 250, 133, 14);
		panel_1.add(lblNewLabel_2_1_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 277, 271, 20);
		panel_1.add(textField_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Correo:");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1_1_1_1.setBounds(10, 309, 133, 14);
		panel_1.add(lblNewLabel_2_1_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 337, 271, 20);
		panel_1.add(textField_2);
		
		JButton btnConfirmarVenta = new JButton("CONFIRMAR VENTA");
		btnConfirmarVenta.setForeground(new Color(255, 255, 255));
		btnConfirmarVenta.setBackground(new Color(159, 7, 18));
		btnConfirmarVenta.setBounds(10, 380, 176, 23);
		panel_1.add(btnConfirmarVenta);
		
		/* 
		JLabel lblNewLabel_3 = new JLabel("Drive Your Dream.");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(168, 349, 178, 29);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(VentanaVentas.class.getResource("/com/images/Gemini_Generated_Image_gk5bc8gk5bc8gk5b.jpg")));
		lblNewLabel.setBounds(148, 224, 198, 154);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(VentanaVentas.class.getResource("/com/images/bf87d944057e0d6f449201b750a4c3fb (1).jpg")));
		lblNewLabel_1.setBounds(485, 59, 351, 452);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("WELCOME");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setForeground(Color.BLACK);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_3_1.setBounds(97, 144, 303, 29);
		contentPane.add(lblNewLabel_3_1);
		
		*/

	}
}
