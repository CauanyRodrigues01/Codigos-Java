package Decisão;

import java.util.Arrays;
import java.util.Scanner;

public class Questao28 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Nota 1: ");
		double nota1 = sc.nextDouble();
		System.out.println("Nota 2: ");
		double nota2 = sc.nextDouble();
		double media = (float)((nota1 + nota2)/2);
		
		System.out.printf("Nota 1: %f\nNota 2: %f\nMédia: %f\n", nota1, nota2, media);
		
		String con = "";
		if (media < 0) {
			System.out.println("Inválido");
		} else if (media == 0 && media > 4) {
			con = "e";
			System.out.println("Conceito E");
		} else if (media >= 4 && media < 6) {
			con = "d";
			System.out.println("Conceito D");
		} else if (media >= 6 && media < 7.5) {
			con = "d";
			System.out.println("Conceito C");
		} else if (media >= 7.5 && media < 9) {
			con = "b";
			System.out.println("Conceito B");
		} else if (media >= 9 && media <= 10) {
			con = "a";
			System.out.println("Conceito A");
		}
		
		if (con.equals("a") || con.equals("b") || con.equals("c")) {
			System.out.println("APROVADO");
		} else if (con.equals("d") || con.equals("e")) {
			System.out.println("REPROVADO");
		}
	}
}