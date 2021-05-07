package com.senati.eti;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arrcodigo = {"A-123","A-456","A-789","A-159"};
		String[] arrnombre = {"Joe Castillo","Rosa Flores","Carlos Benavides", "Sara Montes"};
		int[] arrnota = {13,8,18,10};
		
		String codigo = "";
		String Estado = "";
		System.out.println("\n---------------------------------");
		System.out.println("COLEGIO SENATI - MODULO BUSQUEDAS");
		System.out.println("---------------------------------");
		System.out.print("Codigo a buscar: ");
		codigo = sc.nextLine();
		
		//Realizar la busqueda del codigo en el arreglo arrcodigo
		int posicion = -1;
		
		for(int i = 0; i < arrcodigo.length; i++) {
			if (arrcodigo[i].equals(codigo)) {
				posicion = i;
				break;
			}
		}
		if (posicion == -1) {
			//Codigo no fue encontrando
			System.out.println("\nCodigo no encontrado...");
		}else {
			System.out.println("Datos del participante: ");
			System.out.println("Codigo....: "+arrcodigo[posicion]);
			System.out.println("Nombre....: "+arrnombre[posicion]);
			System.out.println("Nota......: "+arrnota[posicion]);
		}
		//Muestre un estado de: Aprobado o Desaprobado
		if (arrnota[posicion] >= 11)
			System.out.println("Estado....: Aprobado");
		else
			System.out.println("Estado....: Desaprobado");
	}
}
