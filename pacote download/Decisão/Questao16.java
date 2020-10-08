package Decisão;

import java.lang.Math;

import java.util.Scanner;

public class Questao16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("TRIÂNGULO");
		
		System.out.print("Digite um número para a hipotenusa: ");
		float a = sc.nextFloat();
		if (a<0 && a%1!=0) {
			System.out.print("Só pode ser inteiro e positivo");
		} else {
		
			System.out.print("Digite um número para um cateto: ");
			float b = sc.nextFloat();
			if (b<0 && b%1!=0) {
				System.out.print("Só pode ser inteiro e positivo");
		} else {
		
			System.out.print("Digite um número para outro cateto: ");
			float c = sc.nextFloat();
			if (c<0 && c%1!=0) {
				System.out.print("Só pode ser inteiro e positivo");
		} else {
			double h_2 = Math.pow(a,2);
			double c1_2 = Math.pow(b,2);
			double c2_2 = Math.pow(c,2);
			if (h_2 == c1_2 + c2_2) {
				System.out.print("O triângulo é retangulo");
		} else {
			System.out.print("O triângulo não é triângulo retângulo");
		}
				}
			}
		}
	}
}