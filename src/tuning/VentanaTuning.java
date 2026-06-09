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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import data.coche;
import ventas.RegistroVentas;
import ventas.VentanaVentas;

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
	
	private String modificacionActual = "";
	private String selLlantas = "De serie", selAleron = "De serie", selSonido = "De serie";
	private String selEscape = "De serie", selAsientos = "De serie", selPintura = "De serie";
	
	private boolean mostrandoTuneados = false;

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
		TOUNING.setOpaque(true);
		TOUNING.setBackground(new Color(158, 23, 20));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(453, 70, 371, 430);
		contentPane.add(panel_1);
		panel_1.setBackground(new Color(255, 255, 255));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 70, 433, 430);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("VEHÍCULOS DISPONIBLES PARA TUNING");
		lblNewLabel.setBounds(0, 11, 315, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2.add(lblNewLabel);
		
		txtBuscarAuto = new JTextField();
		txtBuscarAuto.setBounds(0, 31, 261, 20);
		panel_2.add(txtBuscarAuto);
		txtBuscarAuto.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(RegistroVentas.class.getResource("/com/images/lupa.jpg")));
		btnNewButton.setBounds(261, 28, 22, 23);
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
		
		JLabel lblNewLabel_1_1 = new JLabel("Cantidad a tunear:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(10, 65, 185, 14);
		panel_1.add(lblNewLabel_1_1);
		
		txtCantidadTuning = new JTextField();
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
		
		JButton btnCochesBase = new JButton("Coches");
		btnCochesBase.setForeground(Color.WHITE);
		btnCochesBase.setBackground(new Color(159, 7, 18));
		btnCochesBase.setBounds(291, 0, 142, 23);
		panel_2.add(btnCochesBase);
		btnCochesBase.addActionListener(e -> {
			mostrandoTuneados = false;
			actualizarTabla();
		});
		
		JButton btnCochesTuneados = new JButton("Coches Tuneados");
		btnCochesTuneados.setForeground(Color.WHITE);
		btnCochesTuneados.setBackground(new Color(159, 7, 18));
		btnCochesTuneados.setBounds(291, 30, 142, 23);
		panel_2.add(btnCochesTuneados);
		btnCochesTuneados.addActionListener(e -> {
			mostrandoTuneados = true;
			actualizarTabla();
		});
		
		actualizarTabla();
		
		// Evento del click en la tabla
		catalogoVentas.addMouseListener(new MouseAdapter( ) {
			@Override
			public void mouseClicked(MouseEvent e) {
				int fila = catalogoVentas.getSelectedRow();
				if (fila != -1) {
					// Extraemos el ID de la fila seleccionada
					int idSeleccionado = (int) catalogoVentas.getValueAt(fila, 0);
					
					// Buscamos en el ArrayList ese ID
					for (coche c : listaCochesDisponibles) {
						if (c.getId() == idSeleccionado) {
							autoSeleccionadoParaVender = c;
							break;
						}
					}
					
					// Se llenan los inputs
					txtAutoSeleccionado.setText(autoSeleccionadoParaVender.getMarca() + " " + autoSeleccionadoParaVender.getModelo());
					
					if (autoSeleccionadoParaVender instanceof data.CocheTuneado) {
						data.CocheTuneado autoYaTuneado = (data.CocheTuneado) autoSeleccionadoParaVender;
						selLlantas = autoYaTuneado.getLlantas();
						selAleron = autoYaTuneado.getAleron();
						selSonido = autoYaTuneado.getSonido();
						selEscape = autoYaTuneado.getEscape();
						selAsientos = autoYaTuneado.getAsientos();
						selPintura = autoYaTuneado.getPintura();
					} else {
						selLlantas = "De serie"; selAleron = "De serie"; selSonido = "De serie";
						selEscape = "De serie"; selAsientos = "De serie"; selPintura = "De serie";
					}
				}
			}
		});
		
		// Lógica de navegación del CardLayout y las opciones del ComboBox
		CardLayout manejadorTarjetas = (CardLayout) panelTarjetas.getLayout();
		
		btnLlantas.addActionListener(e -> {
			lblTituloOpcion.setText("Seleccione las llantas:");
			comboOpciones.removeAllItems();
			comboOpciones.addItem("De serie");
			comboOpciones.addItem("Llantas Deportivas de Aleación");
			comboOpciones.addItem("Llantas Off-Road Todo Terreno");
			comboOpciones.setSelectedItem(selLlantas);
			manejadorTarjetas.show(panelTarjetas, "name_256337987976900");
			modificacionActual = "Llantas";
		});
		
		btnAleron.addActionListener(e -> {
			lblTituloOpcion.setText("Seleccione el alerón:");
			comboOpciones.removeAllItems();
			comboOpciones.addItem("De serie");
			comboOpciones.addItem("Alerón Deportivo de Fibra de Carbono");
			comboOpciones.addItem("Alerón CLásico Discreto");
			comboOpciones.setSelectedItem(selAleron);
			manejadorTarjetas.show(panelTarjetas, "name_256337987976900");
			modificacionActual = "Aleron";
		});
		
		btnSonido.addActionListener(e -> {
			lblTituloOpcion.setText("Seleccione el sonido:");
			comboOpciones.removeAllItems();
			comboOpciones.addItem("De serie");
			comboOpciones.addItem("Sistema Premium Bose (8 Bocinas)");
			comboOpciones.addItem("Subwoofer con Amplificador Pioneer");
			comboOpciones.setSelectedItem(selSonido);
			manejadorTarjetas.show(panelTarjetas, "name_256337987976900");
			modificacionActual = "Sonido";
		});
		
		btnEscape.addActionListener(e -> {
			lblTituloOpcion.setText("Seleccione el escape:");
			comboOpciones.removeAllItems();
			comboOpciones.addItem("De serie");
			comboOpciones.addItem("Escape Deportivo Acero Inoxidable");
			comboOpciones.addItem("Escape de Titanio Alto Rendimiento");
			comboOpciones.setSelectedItem(selEscape);
			manejadorTarjetas.show(panelTarjetas, "name_256337987976900");
			modificacionActual = "Escape";
		});
		
		btnAsientos.addActionListener(e -> {
			lblTituloOpcion.setText("Seleccione los asientos:");
			comboOpciones.removeAllItems();
			comboOpciones.addItem("De serie");
			comboOpciones.addItem("Asientos de Cuero Premium");
			comboOpciones.addItem("Asientos Deportivos tipo Cubo");
			comboOpciones.setSelectedItem(selAsientos);
			manejadorTarjetas.show(panelTarjetas, "name_256337987976900");
			modificacionActual = "Asientos";
		});
		
		btnPintura.addActionListener(e -> {
			lblTituloOpcion.setText("Seleccione la pintura:");
			comboOpciones.removeAllItems();
			comboOpciones.addItem("De serie");
			comboOpciones.addItem("Pintura Metálica Brillante");
			comboOpciones.addItem("Pintura Mate");
			comboOpciones.setSelectedItem(selPintura);
			manejadorTarjetas.show(panelTarjetas, "name_256337987976900");
			modificacionActual = "Pintura";
		});
		
		btnRegresar.addActionListener(e -> {
			String eleccion = comboOpciones.getSelectedItem().toString();
			switch (modificacionActual) {
			case "Llantas": selLlantas = eleccion; break;
			case "Aleron": selAleron = eleccion; break;
			case "Sonido": selSonido = eleccion; break;
			case "Escape": selEscape = eleccion; break;
			case "Asientos": selAsientos = eleccion; break;
			case "Pintura": selPintura = eleccion; break;
			}
			
			manejadorTarjetas.show(panelTarjetas, "name_255942830743800");
		});
		
		btnConfirmarTuning.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				if (autoSeleccionadoParaVender == null) {
					JOptionPane.showMessageDialog(null, "Error: Selecciona un auto de los disponibles.");
					return;
				}
				
				int cantidadATunear = 0;
				try {
					cantidadATunear = Integer.parseInt(txtCantidadTuning.getText().trim());
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Error: Ingresa una cantidad válida.");
					return;
				}
				
				int stockOriginal = (int) autoSeleccionadoParaVender.getCantidad();
				
				if (cantidadATunear <= 0) {
					JOptionPane.showMessageDialog(null, "La cantidad debe ser mayor a 0.");
					return;
				}
				if (cantidadATunear > stockOriginal) {
					JOptionPane.showMessageDialog(null, "No puedes tunear más autos de los que hay en el registro.");
					return;
				}
				
				String llantasViejas = "De serie", aleronViejo = "De serie", sonidoViejo = "De serie";
				String escapeViejo = "De serie", asientosViejos = "De serie", pinturaVieja = "De serie";
				
				if (autoSeleccionadoParaVender instanceof data.CocheTuneado) {
					data.CocheTuneado viejo = (data.CocheTuneado) autoSeleccionadoParaVender;
					llantasViejas = viejo.getLlantas();
					aleronViejo = viejo.getAleron();
					sonidoViejo = viejo.getSonido();
					escapeViejo = viejo.getEscape();
					asientosViejos = viejo.getAsientos();
					pinturaVieja = viejo.getPintura();
				}
				
				float costoExtra = 0;
				
				if (!selLlantas.equals(llantasViejas)) {
					if (selLlantas.equals("Llantas Deportivas de Aleación")) costoExtra += 12000;
					else if (selLlantas.equals("Llantas Off-Road Todo Terreno")) costoExtra += 18000;
				}
				
				if (!selAleron.equals(aleronViejo)) {
					if (selAleron.equals("Alerón Deportivo de Fibra de Carbono")) costoExtra += 8500;
					else if (selAleron.equals("Alerón Clásico Discreto")) costoExtra += 3000;
				}
				
				if (!selSonido.equals(sonidoViejo)) {
					if (selSonido.equals("Sistema Premium Bose (8 Bocinas)")) costoExtra += 25000;
					else if (selSonido.equals("Subwoofer con Amplificador Pioneer")) costoExtra += 15000;
				}
				
				if (!selEscape.equals(escapeViejo)) {
					if (selEscape.equals("Escape Deportivo Acero Inoxidable")) costoExtra += 11000;
					else if (selEscape.equals("Escape de Titanio Alto Rendimiento")) costoExtra += 22000;
				}
				
				if (!selAsientos.equals(asientosViejos)) {
					if (selAsientos.equals("Asientos de Cuero Premium")) costoExtra += 20000;
					else if (selAsientos.equals("Asientos Deportivos tipo Cubo")) costoExtra += 28000;
				}
				
				if (!selPintura.equals(pinturaVieja)) {
					if (selPintura.equals("Pintura Metálica Brillante")) costoExtra += 15000;
					else if (selPintura.equals("Pintura Mate")) costoExtra += 19000;
				}
				
				data.CocheTuneado nuevoTuning = new data.CocheTuneado(autoSeleccionadoParaVender);
				nuevoTuning.setCantidad(cantidadATunear);
				nuevoTuning.setPrecioBase(autoSeleccionadoParaVender.getPrecioBase() + costoExtra);
				
				nuevoTuning.setLlantas(selLlantas);
				nuevoTuning.setAleron(selAleron);
				nuevoTuning.setSonido(selSonido);
				nuevoTuning.setEscape(selEscape);
				nuevoTuning.setAsientos(selAsientos);
				nuevoTuning.setPintura(selPintura);
				
				GestionArchivos.Gestor gestor = new GestionArchivos.Gestor();
				autoSeleccionadoParaVender.setCantidad(stockOriginal - cantidadATunear);
				
				if (mostrandoTuneados) {
					ArrayList<data.CocheTuneado> listaTuneadosParaGuardar = new ArrayList<>();
					for(data.coche c : listaCochesDisponibles) {
						listaTuneadosParaGuardar.add((data.CocheTuneado) c);
					}
					listaTuneadosParaGuardar.add(nuevoTuning);
					gestor.actualizarStockTuneados(listaTuneadosParaGuardar);
				} else {
					gestor.registrarCocheTuneado(nuevoTuning);
					gestor.actualizarStock(listaCochesDisponibles);
				}
				
				JOptionPane.showMessageDialog(null, "¡Tuning realizado con éxito!");
				
				txtAutoSeleccionado.setText("");
				txtCantidadTuning.setText("");
				autoSeleccionadoParaVender = null;
				selLlantas = "De serie"; selAleron = "De serie"; selSonido = "De serie";
				selEscape = "De serie"; selAsientos = "De serie"; selPintura = "De serie";
				
				actualizarTabla();
			}
		});
	}
	
	private void actualizarTabla() {
		modeloTabla.setRowCount(0);
		
		GestionArchivos.Gestor gestorArchivos = new GestionArchivos.Gestor();
		
		if (mostrandoTuneados) {
			ArrayList<data.CocheTuneado> tuneados = gestorArchivos.leerCochesTuneados();
			listaCochesDisponibles = new ArrayList<data.coche>(tuneados);
		} else {
			listaCochesDisponibles = gestorArchivos.leerStock();
		}
		
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
