package stock;



import java.awt.Color;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//manejo de archivos

import java.util.ArrayList;
import data.coche;

import GestionArchivos.Gestor;
import tuning.VentanaTuning;
import ventas.VentanaVentas;
import ventas.RegistroVentas;


import javax.swing.BorderFactory;
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
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Stock extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtMarca;
	private JTextField txtModelo;
	private JTextField txtAnio;
	private JTextField txtPrecio;
	private JTextField txtColor;
	private JTextField txtBuscarPorModelomarca;
	
	// Componentes agregados para la tabla
	private JTable tablaStock;
	private DefaultTableModel modeloTabla;
	private JTextField txtCantidad;
	
	private Gestor gestorArchivos = new Gestor();
	private JTextField txtTransmision;
	
	

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
				HOME.setBackground(panel.getBackground()); 
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
				VentanaVentas ventanaVentas = new VentanaVentas();
				ventanaVentas.setVisible(true);
				dispose();
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
				CONSULTAS.setBackground(panel.getBackground()); 
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
				VENTAS.setBackground(panel.getBackground()); 
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
		
		JLabel ID = new JLabel("ID/Código:");
		ID.setFont(new Font("Agency FB", Font.BOLD, 17));
		ID.setBounds(10, 91, 56, 24);
		panel_1.add(ID);
		
		txtId = new JTextField();
		txtId.setBounds(76, 97, 96, 18);
		panel_1.add(txtId);
		txtId.setColumns(10);
		
		JLabel MARCA = new JLabel("Marca:");
		MARCA.setFont(new Font("Agency FB", Font.BOLD, 17));
		MARCA.setBounds(10, 126, 56, 24);
		panel_1.add(MARCA);
		
		txtMarca = new JTextField();
		txtMarca.setBounds(76, 132, 194, 18);
		panel_1.add(txtMarca);
		txtMarca.setColumns(10);
		
		JLabel MODELO = new JLabel("Modelo:");
		MODELO.setFont(new Font("Agency FB", Font.BOLD, 17));
		MODELO.setBounds(10, 160, 56, 24);
		panel_1.add(MODELO);
		
		txtModelo = new JTextField();
		txtModelo.setColumns(10);
		txtModelo.setBounds(76, 166, 194, 18);
		panel_1.add(txtModelo);
		
		JLabel ANIO = new JLabel("Año:");
		ANIO.setFont(new Font("Agency FB", Font.BOLD, 17));
		ANIO.setBounds(10, 194, 56, 24);
		panel_1.add(ANIO);
		
		txtAnio = new JTextField();
		txtAnio.setBounds(76, 200, 65, 18);
		panel_1.add(txtAnio);
		txtAnio.setColumns(10);
		
		JLabel PRECIO = new JLabel("Precio:");
		PRECIO.setFont(new Font("Agency FB", Font.BOLD, 17));
		PRECIO.setBounds(10, 228, 56, 24);
		panel_1.add(PRECIO);
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(76, 234, 65, 18);
		panel_1.add(txtPrecio);
		
		JLabel COLOR = new JLabel("Color:");
		COLOR.setFont(new Font("Agency FB", Font.BOLD, 17));
		COLOR.setBounds(10, 262, 56, 24);
		panel_1.add(COLOR);
		
		txtColor = new JTextField();
		txtColor.setColumns(10);
		txtColor.setBounds(76, 264, 65, 18);
		panel_1.add(txtColor);
		
		JButton REGISTRAR = new JButton("Registrar Auto");
		
		
		
		
		REGISTRAR.setIcon(new ImageIcon(Stock.class.getResource("/com/images/logoMas.jpg")));
		REGISTRAR.setForeground(new Color(255, 255, 255));
		REGISTRAR.setFont(new Font("Tahoma", Font.PLAIN, 15));
		REGISTRAR.setBackground(new Color(159, 7, 18));
		REGISTRAR.setBounds(10, 378, 149, 20);
		panel_1.add(REGISTRAR);
		
		JButton ACTUALIZAR = new JButton("Actualizar");
		
		ACTUALIZAR.setForeground(Color.WHITE);
		ACTUALIZAR.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ACTUALIZAR.setBackground(new Color(0, 0, 0));
		ACTUALIZAR.setBounds(10, 409, 149, 20);
		panel_1.add(ACTUALIZAR);
		
		JButton LIMPIAR = new JButton("Limpiar Campos");
		
		LIMPIAR.setFont(new Font("Tahoma", Font.PLAIN, 13));
		LIMPIAR.setBounds(165, 379, 132, 20);
		panel_1.add(LIMPIAR);
		
		JLabel CANTIDAD = new JLabel("Cantidad:");
		CANTIDAD.setFont(new Font("Agency FB", Font.BOLD, 17));
		CANTIDAD.setBounds(10, 296, 56, 24);
		panel_1.add(CANTIDAD);
		
		txtCantidad = new JTextField();
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(76, 298, 65, 18);
		panel_1.add(txtCantidad);
		
		txtTransmision = new JTextField();
		txtTransmision.setBounds(86, 327, 109, 20);
		panel_1.add(txtTransmision);
		txtTransmision.setColumns(10);
		
		JLabel lblTransmisin = new JLabel("Transmisión:");
		lblTransmisin.setFont(new Font("Agency FB", Font.BOLD, 17));
		lblTransmisin.setBounds(10, 323, 77, 24);
		panel_1.add(lblTransmisin);
		
		// --- PANEL DERECHO (CONSULTA) ---
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
		
		txtBuscarPorModelomarca.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtBuscarPorModelomarca.getText().equals("Buscar por Modelo/Marca")) {
					txtBuscarPorModelomarca.setText("");
					txtBuscarPorModelomarca.setForeground(Color.BLACK);
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtBuscarPorModelomarca.getText().isEmpty()) {
					txtBuscarPorModelomarca.setForeground(new Color(190, 190, 190));
					txtBuscarPorModelomarca.setText("Buscar por Modelo/Marca");
					cargarDatosDesdeArchivo();
				}
			}
		});
		
		txtBuscarPorModelomarca.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String texto= txtBuscarPorModelomarca.getText();
				if(!texto.equals("Buscar por Modelo/Marca")&& !texto.trim().isEmpty()) {
					buscarAutomovil(texto);
				}else if(texto.trim().isEmpty()) {
					cargarDatosDesdeArchivo();
				}
				
			}
		});
		
		txtBuscarPorModelomarca.setFont(new Font("Tahoma", Font.BOLD, 10));
		txtBuscarPorModelomarca.setForeground(new Color(190, 190, 190));
		txtBuscarPorModelomarca.setText("Buscar por Modelo/Marca");
		txtBuscarPorModelomarca.setBounds(86, 68, 374, 18);
		panel_2.add(txtBuscarPorModelomarca);
		txtBuscarPorModelomarca.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = txtBuscarPorModelomarca.getText();
				if(!texto.equals("Buscar por Modelo/Marca") && !texto.trim().isEmpty()) {
					buscarAutomovil(texto);
				}
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(Stock.class.getResource("/com/images/lupa.jpg")));
		btnNewButton_2.setBounds(63, 68, 20, 20);
		panel_2.add(btnNewButton_2);

		// --- INTEGRACIÓN DE LA TABLA PERSONALIZADA ---
		String[] columnas = {"ID", "MARCA", "MODELO", "AÑO", "COLOR", "PRECIO", "CANTIDAD"};
		modeloTabla = new DefaultTableModel(columnas, 0) {
			private static final long serialVersionUID = 1L;
			@Override
			public boolean isCellEditable(int row, int column) {
				return false; // Desactivar edición directa en celdas
			}
		};

		tablaStock = new JTable(modeloTabla);
		personalizarEstilosTabla(tablaStock);

		

		
		JScrollPane scrollPaneTabla = new JScrollPane(tablaStock);
		scrollPaneTabla.setBounds(25, 110, 460, 240); // Posicionado justo debajo del buscador
		scrollPaneTabla.setBorder(BorderFactory.createEmptyBorder()); 
		scrollPaneTabla.getViewport().setBackground(Color.WHITE); 
		
		panel_2.add(scrollPaneTabla);
		
		
		cargarDatosDesdeArchivo(); 
		
		
		
		
		//FUNCIONES
		REGISTRAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				registrarAutomovil();		
				
				
			}
		});
		
		
		LIMPIAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				limpiarCajasTexto();	
				
			}
		});
		
		ACTUALIZAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarDatosDesdeArchivo();
			}
		});
		
		
	}

	
	private void personalizarEstilosTabla(JTable tabla) {
		tabla.setBackground(Color.WHITE);
		tabla.setRowHeight(25); 
		tabla.setShowGrid(false); 
		tabla.setIntercellSpacing(new Dimension(0, 0));

		
		JTableHeader header = tabla.getTableHeader();
		header.setFont(new Font("Segoe UI", Font.BOLD, 12));
		header.setBackground(new Color(230, 230, 230)); 
		header.setForeground(Color.DARK_GRAY);
		header.setReorderingAllowed(false); 
		
		DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) header.getDefaultRenderer();
		headerRenderer.setHorizontalAlignment(JLabel.CENTER); 
		headerRenderer.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.LIGHT_GRAY)); 

		// Celdas 
		DefaultTableCellRenderer cebraRenderer = new DefaultTableCellRenderer() {
			private static final long serialVersionUID = 1L;

			@Override
			public Component getTableCellRendererComponent(JTable table, Object value, 
					boolean isSelected, boolean hasFocus, int row, int column) {
				
				Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
				setHorizontalAlignment(JLabel.CENTER); 

				if (isSelected) {
					c.setBackground(new Color(184, 207, 229)); 
					c.setForeground(Color.BLACK);
				} else {
					if (row % 2 == 0) {
						c.setBackground(Color.WHITE);
					} else {
						c.setBackground(new Color(245, 245, 245)); 
					}
					c.setForeground(Color.BLACK);
				}
				return c;
			}
		};

		for (int i = 0; i < tabla.getColumnCount(); i++) {
			tabla.getColumnModel().getColumn(i).setCellRenderer(cebraRenderer);
		}
	}
	
	private void registrarAutomovil() {
		try {
			if(txtId.getText().isEmpty()||txtMarca.getText().isEmpty()||txtModelo.getText().isEmpty()||txtAnio.getText().isEmpty()||txtPrecio.getText().isEmpty()||txtCantidad.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Por favor, llene todos los campos");
				return;
			}
			
			//Parsear datos
			int id=Integer.parseInt(txtId.getText().trim());
			String marca=txtMarca.getText().trim();
			String modelo=txtModelo.getText().trim();
			int anio=Integer.parseInt(txtAnio.getText().trim());
			float precio=Float.parseFloat(txtPrecio.getText().trim());
			String transmision= txtTransmision.getText().trim();
			String color= txtColor.getText().trim();
			int cantidad=Integer.parseInt(txtCantidad.getText().trim());
			
			//instanciamos coche
			coche nuevoCoche= new coche(id, marca, modelo, anio, transmision, color, precio, cantidad);
			
			//leer archivo
			ArrayList<coche>listaCoches=gestorArchivos.leerStock();
			listaCoches.add(nuevoCoche);
			
			boolean guardadoExitoso = gestorArchivos.actualizarStock(listaCoches);
			
			if(guardadoExitoso) {
				JOptionPane.showMessageDialog(null, "Auto registrado con exito");
				limpiarCajasTexto();
				cargarDatosDesdeArchivo();
			}else {
				JOptionPane.showMessageDialog(null, "Error al guardar");
			}
			
			
			
			
		}catch(NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Asegurate de ingresar numeros validos en ID, Año, Precio y Cantidad");
		}
	}
	
	
	
	private void cargarDatosDesdeArchivo() {
		modeloTabla.setRowCount(0);//borra el contenido de la tabla
		
		ArrayList<coche> lista = gestorArchivos.leerStock();
		
		
		
		for(coche c:lista) {
			if ((int) c.getCantidad() > 0) {
				modeloTabla.addRow(new Object[]{
					c.getId(),
					c.getMarca(),
					c.getModelo(),
					c.getAnio(),
					c.getColor(),
					"$"+String.format("%.2f", c.getPrecioBase()),
					c.getCantidad()
				});
			}
			
		}
				
	}
	
	private void buscarAutomovil(String terminoBuscado ) {
		modeloTabla.setRowCount(0);
		
		ArrayList<coche>listaCompleta=gestorArchivos.leerStock();
		String filtro= terminoBuscado.toLowerCase();
		
		for(coche c: listaCompleta) {
			if(c.getMarca().toLowerCase().contains(filtro) || c.getModelo().toLowerCase().contains(filtro)) {
				if((int) c.getCantidad()>0) {
					modeloTabla.addRow(new Object[]{
							c.getId(),
							c.getMarca(),
							c.getModelo(),
							c.getAnio(),
							c.getColor(),
							"$"+String.format("%.2f", c.getPrecioBase()),
							c.getCantidad()
					});
				}
			}
		}
	}
	
	
	
	private void limpiarCajasTexto() {
		txtId.setText("");
		txtMarca.setText("");
		txtModelo.setText("");
		txtAnio.setText("");
		txtColor.setText("");
		txtPrecio.setText("");
		txtCantidad.setText("");
		txtId.requestFocus();
		
	}
}