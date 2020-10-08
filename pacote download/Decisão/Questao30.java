package Decisão;

import java.util.Scanner;

public class Questao30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Litros vendidos: ");
		double LVendido = sc.nextInt();
		System.out.print("Tipo de cmbustível: A ou G ");
		String tipo = sc.next();
		
		double total = 0;
		if (tipo.equals("A")) {
			if (LVendido <= 20) {
				total = LVendido * 3/100*1.9;
				System.out.println(total);
			} else if (LVendido > 20) {
				total = LVendido * (float)(5/100*1.9);
			}
		} else if (tipo.equals("G")) {
			if (LVendido <= 20) {
				total = LVendido * (float)(4/100*2.5);
			} else if (LVendido > 20) {
				total = LVendido * (float)(6/100*2.5);
			}
		}
		
		System.out.println("Total a pagar: "+total);
	}
	}
