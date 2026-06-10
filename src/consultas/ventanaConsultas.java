package consultas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import login.Login;
import tuning.VentanaTuning;
import ventas.VentanaVentas;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import GestionArchivos.Gestor;

public class ventanaConsultas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaConsultas frame = new ventanaConsultas();
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
	public ventanaConsultas() {
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
				HOME.setBackground(panel.getBackground()); 
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Login ventanaLogin = new Login();
				ventanaLogin.setVisible(true);
				dispose();
			}
		});
		
		JLabel CONSULTAS = new JLabel("CONSULTAS");
		CONSULTAS.setHorizontalAlignment(SwingConstants.CENTER);
		CONSULTAS.setForeground(Color.WHITE);
		CONSULTAS.setFont(new Font("Agency FB", Font.PLAIN, 20));
		CONSULTAS.setBounds(200, 0, 100, 58);
		panel.add(CONSULTAS);
		CONSULTAS.setOpaque(true);
		CONSULTAS.setBackground(new Color(158, 23, 20));
		
		
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
				STOCK.setBackground(panel.getBackground()); 
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
				VENTAS.setBackground(panel.getBackground()); 
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				VentanaVentas ventanaVentas = new VentanaVentas();
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
		
		JLabel txtReportes = new JLabel("REPORTES");
		txtReportes.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtReportes.setBounds(335, 95, 105, 42);
		contentPane.add(txtReportes);
		
		JLabel ventaslabel = new JLabel("Reporte de Ventas");
		ventaslabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		ventaslabel.setBounds(77, 187, 167, 29);
		contentPane.add(ventaslabel);
		
		JLabel stocklabel = new JLabel("Reporte de Stock");
		stocklabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		stocklabel.setBounds(77, 281, 167, 29);
		contentPane.add(stocklabel);
		
		JButton btnReportVentas = new JButton("GENERAR");
		btnReportVentas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gestor Reporte = new Gestor();
				Reporte.leerVentas();
				
			}
		});
		btnReportVentas.setBounds(286, 187, 89, 23);
		contentPane.add(btnReportVentas);
		
		JButton btnReportStock = new JButton("GENERAR");
		btnReportStock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gestor reporte = new Gestor();
				reporte.makeReporteStock();
			}
		});
		btnReportStock.setBounds(286, 287, 89, 23);
		contentPane.add(btnReportStock);
		TOUNING.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				TOUNING.setOpaque(true);
				TOUNING.setBackground(new Color(158, 23, 20));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				TOUNING.setBackground(panel.getBackground()); 
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
