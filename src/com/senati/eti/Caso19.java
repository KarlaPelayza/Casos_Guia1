package com.senati.eti;

import java.util.Scanner;

public class Caso19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese lado1: ");
		int lado1 = sc.nextInt();
		
		System.out.print("Ingrese lado2: ");
		int lado2 = sc.nextInt();
		
		System.out.print("Ingrese lado3: ");
		int lado3 = sc.nextInt();
		
		int perimetro = (lado1+lado2+lado3);
		
		System.out.println("----- Resultados -----");
		System.out.println("Perimetro del triangulo.......: " + perimetro);

	}

}
