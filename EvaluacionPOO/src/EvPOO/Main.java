package EvPOO;

public class Main {

	public static void main(String[] args) {
		
		// Variables que almacenarán los precios finales
		String preciosT = " Televisores: ";
		String preciosL = " Lavadoras: ";
		String preciosO = " Otros electrodomésticos: ";
		int totalPrecios = 0;
		
		// Array de electrodomesticos con 10 posiciones
		Electrodomestico productos[] = new Electrodomestico[10];
		
		// Se asigna un objeto a cada posicion, con distintos parametros
		productos[0] = new Electrodomestico();
		productos[1] = new Lavadora();
		productos[2] = new Television();
		
		productos[3] = new Electrodomestico(125000, 20);
		productos[4] = new Lavadora(125000, 20);
		productos[5] = new Television(125000, 20);
		
		productos[6] = new Electrodomestico(200000, "Gris", 'B', 50);
		productos[7] = new Electrodomestico(250000, "RoJo", 'A', 90);
		productos[8] = new Lavadora(40, 60000, "azul", 'D', 60);
		productos[9] = new Television(45, true, 111000, "NEGRO", 'C', 10);
		
		// Identifica que tipo de electrodomestico es y separa los precios
		for(int i = 0; i<productos.length; i++) {
			
			if(productos[i] instanceof Television) {
				preciosT += "\n-> $"+productos[i].precioFinal();
				
			}else if(productos[i] instanceof Lavadora) {	
				preciosL += "\n-> $"+productos[i].precioFinal();
				
			}else {
				preciosO += "\n-> $"+productos[i].precioFinal();
				
			}
			totalPrecios += productos[i].precioFinal();

		}
		
		// Muestra los precios de cada producto diferenciados por su etiqueta
		System.out.println("/////////////////////////////////////////");
		System.out.println("---------- Listado de precios ----------");
		System.out.println("/////////////////////////////////////////");
		System.out.println(preciosT);
		System.out.println("----------------------------------------");
		System.out.println(preciosL);
		System.out.println("----------------------------------------");
		System.out.println(preciosO);
		System.out.println("/////////////////////////////////////////");
		System.out.println(" Suma de electrodomésticos: $"+totalPrecios);
		System.out.println("/////////////////////////////////////////");
	}
}