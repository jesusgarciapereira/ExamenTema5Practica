package examen;

import java.util.Arrays;

/**
 * Clase con los atributos y las funciones referentes a nuestra maquina de
 * golosinas
 * 
 * @author jgarcia
 */
public class MaquinaGolosinas {
	/**
	 * Tabla con los nombres de las golosinas en su disposicion correspondiente
	 * dentro de la maquina
	 */
	static String[][] nombresGolosinas = { { "KitKat", "Chicles de fresa", "Lacasitos", "Palotes" },
			{ "Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix" },
			{ "Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta" },
			{ "Lacasitos", "Crunch", "Milkybar", "KitKat" } };
	/**
	 * Tabla con los precios de cada producto en la disposicion de la maquina
	 */
	static double[][] precio = { { 1.1, 0.8, 1.5, 0.9 }, { 1.8, 1, 1.2, 1 }, { 1.8, 1.3, 1.2, 0.8 },
			{ 1.5, 1.1, 1.1, 1.1 } };
	/**
	 * Tabla que indica las cantidades correspondientes de cada golosina en la
	 * disposicion de la maquina
	 */
	static int cantidades[][] = new int[nombresGolosinas.length][nombresGolosinas[0].length];
	/**
	 * Tabla unidimensional con los nombres de las golosinas vendidas (inicialmente vacia)
	 */
	static int ventas[] = new int[0];

	/**
	 * Atributo con el precio total de las ventas de la maquina
	 */
	static double total;
	
	/**
	 * Funcion para rellenar la tabla cantidades 
	 * 
	 * @param num Numero con el que se rellenara la tabla
	 */
	public static void rellenarMatriz(int num) {
		// Llamamos a la funcion fill() indicando la tabla cantidades y el numero del parametro
		Arrays.fill(cantidades, num);
	}
	
	public static void mostrarGolosinas() {
		
		
	}
}
