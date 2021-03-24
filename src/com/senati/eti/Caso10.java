package com.senati.eti;

import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese Radio: ");
		int radio = sc.nextInt();
		int pi = (int)3.1416;

		int area1 = (int)(pi *Math.pow(radio,2));
		int perimetro = (int)2* pi *radio;
		
		System.out.println("----- Resultados -----");
		System.out.println("Área del circulo.......: " + area1);
		System.out.println("Perímetro del circulo..: " + perimetro);
	}

	}
