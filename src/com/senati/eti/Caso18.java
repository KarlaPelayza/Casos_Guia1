package com.senati.eti;

import java.util.Scanner;

public class Caso18 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese lado1: ");
		int lado1 = sc.nextInt();
		
		System.out.print("Ingrese lado2: ");
		int lado2 = sc.nextInt();
		
		int area = (lado1*lado2/2);
		
		System.out.println("----- Resultados -----");
		System.out.println("Área del triangulo.......: " + area);

	}

}
