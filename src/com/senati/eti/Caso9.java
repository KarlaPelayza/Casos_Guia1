package com.senati.eti;
import java.util.Scanner;
public class Caso9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese lado1: ");
		int lado1 = sc.nextInt();
		
		System.out.print("Ingrese lado2: ");
		int lado2 = sc.nextInt();
		
		int area_rectangulo=0;
		int altura=20;
		int base=10;
		int area = lado1*lado2;
		int perimetro = 2*(lado1+lado2);
		
		System.out.println("----- Resultados -----");
		System.out.println("�rea del rectangulo.......: " + area);
		System.out.println("Per�metro del rectangulo..: " + perimetro);
}

	}
