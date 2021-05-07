package com.senati.eti;

import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int[] arrNumero=new int[5];
		int nmy=0,nmn=0,suma=0;
		
		System.out.println("REGISTRO DE NÚMEROS");
		System.out.println("-------------------");
		
		for(int x=0;x<arrNumero.length;x++) {
			System.out.print("Número "+(x+1)+": ");
			arrNumero[x]=sc.nextInt();
			
			if (x==0) {
				nmy=arrNumero[0];
				nmn=arrNumero[0];
			}
			else {
				if(arrNumero[x]>nmy)nmy=arrNumero[x];
				
				if (arrNumero[x]<nmn)nmn=arrNumero[x];
			}
			suma+=arrNumero[x];
		}
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("Número mayor....: "+ nmy);
		System.out.println("Número menor....: "+ nmn);
		System.out.println("Sumatoria.......: "+ suma);

	}

}