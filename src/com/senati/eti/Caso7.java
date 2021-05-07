package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso7 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#.00");
		
		// Definir la matriz de numeros 3x4
		int[][] mNumeros = new int[3] [4];
		
		int num_mayor= 0, num_menor=0, sumatoria=0;
		double promedio=0;
		
		System.out.println("LECTURA DE NÚMEROS");
		System.out.println("------------------");
		
		for (int f = 0; f < mNumeros.length; f++) {
			System.out.println("\nFila: " +(f+1));
			System.out.println("------");
			
			for (int c = 0; c< mNumeros[0].length; c++) {
				System.out.print("Número" + (c + 1) + ": ");
				mNumeros[f][c] = entrada.nextInt();
			
			
			if (f==0 && c==0) {
				num_mayor = mNumeros[0][0];
			} else {
				if (mNumeros[f][c] > num_mayor) num_mayor = mNumeros[f][c];
			}
			
			if (f==0 && c==0) {
				num_menor = mNumeros[0][0];
			} else {
				if (mNumeros[f][c] < num_menor) num_menor = mNumeros[f][c];
			}
			sumatoria+=mNumeros[f][c];
			promedio=sumatoria/12f;
		  }
	   }
		
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("Número mayor........: " + num_mayor);
		System.out.println("Número menor........: " + num_menor);
		System.out.println("Sumatoria...........: " + sumatoria);
		System.out.println("Promedio............: " + df.format(promedio));
		
	}	

}