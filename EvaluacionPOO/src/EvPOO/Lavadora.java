package EvPOO;

public class Lavadora extends Electrodomestico {
	
	private int carga;
	
	// Constructor por defecto
	public Lavadora() {
		super();
		this.carga = 5;
	}
	
	// Constructor con parametros precio y peso
	public Lavadora(int precioBase, int peso) {
		super(precioBase, peso);
		this.carga = 5;
	}
	
	// Constructor con todos los parametros
	public Lavadora(int carga, int precioBase, String color, char consumo, int peso) {
		super(precioBase, color, consumo, peso);
		this.carga = carga;
	}
	
	// Getter
	public int getCarga() {
		return carga;
	}
	
	// Calcula el precio final
	public int precioFinal() {
		
		int precioFinal = super.precioFinal();	// Inicia del precio final de la clase padre
	
		// Aumenta el precio final según carga
		if(this.carga > 30) {
			precioFinal += 50000;
		}
		
		return precioFinal;
	}
}