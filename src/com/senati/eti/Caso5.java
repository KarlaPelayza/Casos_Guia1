package com.senati.eti;
import java.util.Scanner;
public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float n1 = 0, n2 = 0;
		
		System.out.print("Ingresar primer número: ");
		n1 = sc.nextFloat();
		
		System.out.print("Ingresar segundo número: ");
		n2 = sc.nextFloat();
		
		float promedio=(n1+n2)/2;
		float aumento=(n1+n1*20/100);
		float disminuye =(n2-n2*30/100);
		
		System.out.println("-----------------");
		System.out.println("Resultados");
		System.out.println("-----------------");
		System.out.println("Resultado 1:"+ promedio);
		System.out.println("Resultado 2:"+ aumento);
		System.out.println("Resultado 3:"+ disminuye);
	}

}
