package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese las horas trabajadas...: ");
		int cantidad =  sc.nextInt();
		
		System.out.print("Ingrese tarifa por hora.....: ");
		float precio =  sc.nextFloat();
		
		float importe1 = cantidad * precio;
		float importe2 = (float) (importe1 / 3.24);

	}

}
