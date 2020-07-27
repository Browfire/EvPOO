package EvPOO;

import java.util.Arrays;

public class Electrodomestico {
		
	// Atributos heredables
	protected int precioBase;
	protected String color;
	protected char consumo;
	protected int peso;
	
	// Atributos locales
	private char[] val_consumo = {'A', 'B', 'C', 'D', 'E', 'F'};
	private String[] val_color = {"blanco", "negro", "rojo", "azul", "gris"};
	private int[] precioConsumo = {100000, 80000, 60000, 50000, 30000, 10000};
	private int[] precioPeso = {10000, 50000, 80000, 100000};

	// Constructor por defecto
	public Electrodomestico() {
		this.precioBase = 100000;
		this.color = "blanco";
		this.consumo = 'F';
		this.peso = 5;
	}
	
	// Constructor con parametros precio y peso
	public Electrodomestico(int precioBase, int peso) {
		this.precioBase = precioBase;
		this.color = "blanco";
		this.consumo = 'F';
		this.peso = peso;
	}
	
	// Constructor con todos los parametros
	public Electrodomestico(int precioBase, String color, char consumo, int peso) {
		this.precioBase = precioBase;
		this.color = (comprobarColor(color))?color.toLowerCase():"blanco";
		this.consumo = (comprobarConsumoEnergetico(consumo))?consumo:'F';
		this.peso = peso;
	}
	
	// Getters
	public int getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumo() {
		return consumo;
	}

	public int getPeso() {
		return peso;
	}

	// Comprueba que consumo sea un parametro valido
	private boolean comprobarConsumoEnergetico(char consumo) {
		return Arrays.asList(this.val_consumo).contains(consumo);
	}
	
	// Comprueba que color sea un parametro valido
	private boolean comprobarColor(String color) {
		return Arrays.asList(this.val_color).contains(color.toLowerCase());
	}
	
	// Calcula el precio final
	public int precioFinal() {
		
		int precioFinal = this.precioBase;	// Inicia del precio base
		
		// Aumenta el precio final segun consumo energetico
		switch(this.consumo) {
			case 'A':
				precioFinal += this.precioConsumo[0];
			case 'B':
				precioFinal += this.precioConsumo[1];
			case 'C':
				precioFinal += this.precioConsumo[2];
			case 'D':
				precioFinal += this.precioConsumo[3];
			case 'E':
				precioFinal += this.precioConsumo[4];
			case 'F':
				precioFinal += this.precioConsumo[5];
			default:
				break;
		}
		
		// Aumenta el precio final segun peso
		if(this.peso <= 19) {
			precioFinal += this.precioPeso[0];
		}else if(this.peso <= 49) {
			precioFinal += this.precioPeso[1];
		}else if(this.peso <= 79) {
			precioFinal += this.precioPeso[2];
		}else {
			precioFinal += this.precioPeso[3];
		}
		
		return precioFinal;
	}	
}