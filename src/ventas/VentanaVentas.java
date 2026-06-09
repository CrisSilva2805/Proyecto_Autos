package ventas;

import java.awt.EventQueue;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import tuning.VentanaTuning;
import stock.Stock;
import ventas.RegistroVentas;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class VentanaVentas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaVentas frame = new VentanaVentas();
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
	public VentanaVentas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 548);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(254, 254, 252));
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
		HOME.setOpaque(true);
		HOME.setBackground(new Color(158, 23, 20));
		
		
		
		
		
		
		
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
			@Override
			public void mouseClicked(MouseEvent e) {
				Stock ventanaStock = new Stock();
				ventanaStock.setVisible(true);
				dispose();
			}
		});
		
		
		
		
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
			@Override
			public void mouseClicked(MouseEvent e) {
				RegistroVentas ventanaVentas = new RegistroVentas();
				ventanaVentas.setVisible(true);
				dispose();
				
			}
		});
		
		
		
		
		JLabel TOUNING = new JLabel("TOUNING");
		TOUNING.setHorizontalAlignment(SwingConstants.CENTER);
		TOUNING.setForeground(Color.WHITE);
		TOUNING.setFont(new Font("Agency FB", Font.PLAIN, 20));
		TOUNING.setBounds(400, 0, 100, 58);
		panel.add(TOUNING);
		
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
			@Override
			public void mouseClicked(MouseEvent e) {
				VentanaTuning ventanaTuning = new VentanaTuning();
				ventanaTuning.setVisible(true);
				dispose();
			}
		});

	}
}
