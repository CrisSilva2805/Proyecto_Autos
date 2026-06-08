package tuning;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import data.coche;
import ventas.RegistroVentas;
import javax.swing.JSeparator;
import java.awt.CardLayout;
import javax.swing.JComboBox;

public class VentanaTuning extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBuscarAuto;
	private JTable catalogoVentas;
	
	private DefaultTableModel modeloTabla;
	private ArrayList<coche> listaCochesDisponibles;
	private coche autoSeleccionadoParaVender = null;
	private JTextField txtAutoSeleccionado;
	private JTextField txtCantidadTuning;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaTuning frame = new VentanaTuning();
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
	public VentanaTuning() {
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
		panel_1.setBounds(453, 70, 371, 430);
		contentPane.add(panel_1);
		panel_1.setBackground(new Color(255, 255, 255));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 70, 433, 430);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("VEHÍCULOS DISPONIBLES PARA TUNING");
		lblNewLabel.setBounds(76, 11, 315, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2.add(lblNewLabel);
		
		txtBuscarAuto = new JTextField();
		txtBuscarAuto.setBounds(0, 31, 261, 20);
		panel_2.add(txtBuscarAuto);
		txtBuscarAuto.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(RegistroVentas.class.getResource("/com/images/lupa.jpg")));
		btnNewButton.setBounds(271, 28, 22, 23);
		panel_2.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 62, 433, 368);
		panel_2.add(scrollPane);
		
		catalogoVentas = new JTable();
		scrollPane.setColumnHeaderView(catalogoVentas);
		panel_1.setBackground(new Color(214, 211, 209));
		panel_1.setLayout(null);
		
		txtAutoSeleccionado = new JTextField();
		txtAutoSeleccionado.setEditable(false);
		txtAutoSeleccionado.setBounds(10, 32, 271, 20);
		panel_1.add(txtAutoSeleccionado);
		txtAutoSeleccionado.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Vehículo seleccionado:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 11, 159, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Costo de las modificaciones:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(10, 65, 185, 14);
		panel_1.add(lblNewLabel_1_1);
		
		txtCantidadTuning = new JTextField();
		txtCantidadTuning.setEditable(false);
		txtCantidadTuning.setColumns(10);
		txtCantidadTuning.setBounds(10, 90, 271, 20);
		panel_1.add(txtCantidadTuning);
		
		JPanel panelTarjetas = new JPanel();
		panelTarjetas.setBounds(10, 118, 351, 273);
		panel_1.add(panelTarjetas);
		panelTarjetas.setLayout(new CardLayout(0, 0));
		
		JPanel panelMenuBotones = new JPanel();
		panelTarjetas.add(panelMenuBotones, "name_255942830743800");
		panelMenuBotones.setLayout(null);
		
		JButton btnLlantas = new JButton("Llantas");
		btnLlantas.setForeground(new Color(255, 255, 255));
		btnLlantas.setBackground(new Color(159, 7, 18));
		btnLlantas.setBounds(10, 11, 100, 37);
		panelMenuBotones.add(btnLlantas);
		
		JButton btnAleron = new JButton("Alerón");
		btnAleron.setForeground(Color.WHITE);
		btnAleron.setBackground(new Color(159, 7, 18));
		btnAleron.setBounds(120, 11, 100, 37);
		panelMenuBotones.add(btnAleron);
		
		JButton btnSonido = new JButton("Sonido");
		btnSonido.setForeground(Color.WHITE);
		btnSonido.setBackground(new Color(159, 7, 18));
		btnSonido.setBounds(230, 11, 100, 37);
		panelMenuBotones.add(btnSonido);
		
		JButton btnEscape = new JButton("Escape");
		btnEscape.setForeground(Color.WHITE);
		btnEscape.setBackground(new Color(159, 7, 18));
		btnEscape.setBounds(10, 75, 100, 37);
		panelMenuBotones.add(btnEscape);
		
		JButton btnAsientos = new JButton("Asientos");
		btnAsientos.setForeground(Color.WHITE);
		btnAsientos.setBackground(new Color(159, 7, 18));
		btnAsientos.setBounds(120, 75, 100, 37);
		panelMenuBotones.add(btnAsientos);
		
		JButton btnPintura = new JButton("Pintura");
		btnPintura.setForeground(Color.WHITE);
		btnPintura.setBackground(new Color(159, 7, 18));
		btnPintura.setBounds(230, 75, 100, 37);
		panelMenuBotones.add(btnPintura);
		
		JPanel panelSeleccionDetalle = new JPanel();
		panelTarjetas.add(panelSeleccionDetalle, "name_256337987976900");
		panelSeleccionDetalle.setLayout(null);
		
		JLabel lblTituloOpcion = new JLabel("Tipo de modificación:");
		lblTituloOpcion.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTituloOpcion.setBounds(10, 11, 331, 14);
		panelSeleccionDetalle.add(lblTituloOpcion);
		
		JComboBox comboOpciones = new JComboBox();
		comboOpciones.setBounds(10, 43, 331, 22);
		panelSeleccionDetalle.add(comboOpciones);
		
		JButton btnRegresar = new JButton("<- Regresar");
		btnRegresar.setBounds(238, 88, 103, 23);
		panelSeleccionDetalle.add(btnRegresar);
		
		JButton btnConfirmarTuning = new JButton("CONFIRMAR MODIFICACIONES");
		btnConfirmarTuning.setForeground(new Color(255, 255, 255));
		btnConfirmarTuning.setBackground(new Color(159, 7, 18));
		btnConfirmarTuning.setBounds(10, 402, 209, 23);
		panel_1.add(btnConfirmarTuning);
		
		
		
		String[] columnas = {"ID", "Marca", "Modelo", "Año", "Color", "Precio", "Stock"};
		modeloTabla = new DefaultTableModel(columnas, 0) {
			@Override
			public boolean isCellEditable(int row, int column) { return false; }
		};
		catalogoVentas.setModel(modeloTabla);
		
		actualizarTabla();
		
		// Evento del click en la tabla
		catalogoVentas.addMouseListener(new MouseAdapter( ) {
			@Override
			public void mouseClicked(MouseEvent e) {
				int fila = catalogoVentas.getSelectedRow();
				if (fila != -1) {
					autoSeleccionadoParaVender = listaCochesDisponibles.get(fila);
					
					txtAutoSeleccionado.setText(autoSeleccionadoParaVender.getMarca() + " " + autoSeleccionadoParaVender.getModelo());
					txtCantidadTuning.setText(String.valueOf(autoSeleccionadoParaVender.getPrecioBase()));
				}
			}
		});
	}
	
	private void actualizarTabla() {
		modeloTabla.setRowCount(0);
		
		GestionArchivos.Gestor gestorArchivos = new GestionArchivos.Gestor();
		listaCochesDisponibles = gestorArchivos.leerStock();
		
		for (data.coche c : listaCochesDisponibles) {
			if ((int) c.getCantidad() > 0) {
				modeloTabla.addRow(new Object[] {
						c.getId(),
						c.getMarca(),
						c.getModelo(),
						c.getAnio(),
						c.getColor(),
						"$" + c.getPrecioBase(),
						c.getCantidad()
				});
			}
		}
	}
}
