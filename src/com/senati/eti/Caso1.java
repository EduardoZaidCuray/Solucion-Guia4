package com.senati.eti;

import java.util.Arrays;

public class Caso1 {

	public static void main(String[] args) {
		String[] arrNombre = new String[4];
		
		arrNombre[0] = "Jose Castillo";
		arrNombre[1] = "Rosa García";
		arrNombre[2] = "Carlos Ramos";
		arrNombre[3] = "Ericka Vásquez";
		
		//Imporesion de valores
		//Forma 1
		System.out.println("Forma 1");
		System.out.println("-------");
		System.out.println(Arrays.toString(arrNombre));
		
		System.out.println("");
		
		//Forma 2
		System.out.println("Forma 2");
		System.out.println("-------");
		for (int x = 0 ; x < arrNombre.length; x++)
			System.out.println("Nombre" + (x + 1) + ": " + arrNombre[x]);
		
		System.out.println("");
		
		//Forma 3
		System.out.println("Forma 3");
		System.out.println("-------");
		int n= 1;
		for (String nombre:arrNombre) {
			System.out.println("Nombre: " + n + ": "+ nombre);
			n++;
		}
	}

}
