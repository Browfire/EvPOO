package EvPOO;

public class Television extends Electrodomestico {
	
	private int resolucion;
	private boolean sintonizadorTDT;
	
	// Constructor por defecto
	public Television() {
		super();
		this.resolucion = 20;
		this.sintonizadorTDT = false;
	}
	
	// Constructor con parametros precio y peso
	public Television(int precioBase, int peso) {
		super(precioBase, peso);
		this.resolucion = 20;
		this.sintonizadorTDT = false;
	}
	
	// Constructor con todos los parametros
	public Television(int resolucion, boolean sintonizadorTDT, int precioBase, String color, char consumo, int peso) {
		super(precioBase, color, consumo, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	// Getters
	public int getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	// Calcula el precio final
	public int precioFinal() {
			
		int precioFinal = super.precioFinal();	// Inicia del precio final de la clase padre
		
		// Aumenta el precio final segun resolucion
		if(this.resolucion > 40) {
			precioFinal += precioFinal*0.3;
		}
		
		// Aumenta el precio final segun sintonizador
		if(this.sintonizadorTDT) {
			precioFinal += 50000;
		}
			
		return precioFinal;
	}
	
}