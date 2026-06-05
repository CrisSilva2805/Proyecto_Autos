package data;

public class CocheTuneado extends coche {
	
	private static final long serialVersionUID = 1L;
	
	private String llantas;
	private String aleron;
	private String sonido;
	private String escape;
	private String asientos;
	private String pintura;
	
	// Constructor
	public CocheTuneado(coche autoBase) {
		super(autoBase.getId(), autoBase.getMarca(), autoBase.getModelo(), autoBase.getAnio(), autoBase.getColor(), autoBase.getPrecioBase(), (int)autoBase.getCantidad());
		this.llantas = "De fábrica";
		this.aleron = "De fábrica";
		this.sonido = "De fábrica";
		this.escape = "De fábrica";
		this.asientos = "De fábrica";
		this.pintura = "De fábrica";
	}
	
	public void aplicarModificacion(String categoria, String descripcion, float costo) {
		switch (categoria.toLowerCase()) {
			case "llantas":
				this.llantas = descripcion;
				break;
			case "aleron":
				this.aleron = descripcion;
				break;
			case "sonido":
				this.sonido = descripcion;
				break;
			case "escape":
				this.escape = descripcion;
				break;
			case "asientos":
				this.asientos = descripcion;
				break;
			case "pintura":
				this.pintura = descripcion;
				break;
			default:
				System.out.println("Descripcion no valida.");
				return;
		}
		
		this.precioBase += costo;
	}
	
	@Override
	public String mostrarInfo() {
		String infoBase = super.mostrarInfo();
		
		String infoTuning = "\n [ESPECIFICACIONES DE TUNING]" +
							"\n - Llantas: " + this.llantas +
							"\n - Aleron: " + this.aleron +
							"\n - Sonido: " + this.sonido +
							"\n - Escape: " + this.escape +
							"\n - Asientos: " + this.asientos +
							"\n - Pintura: " + this.pintura;
		
		return infoBase + infoTuning;
	}
}
