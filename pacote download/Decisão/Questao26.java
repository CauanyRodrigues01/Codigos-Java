package Decisão;

import java.util.Scanner;

public class Questao26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Idade: ");
		int idade = sc.nextInt();
		System.out.printf("Anos de trabalho: ");
		int anosTrab = sc.nextInt();
		
		if (idade >= 65 && anosTrab >= 30) {
			System.out.println("Qualificado para aposentadoria");
		} else if (idade >= 60 && anosTrab >= 25) {
			System.out.println("Qualificado para aposentadoria");
		} else if (idade < 60 && anosTrab >= 25) {
			System.out.println("Idade insuficiente");
		} else if (idade >= 60 && anosTrab < 25) {
			System.out.println("Anos de trabalho insuficiente");
		} else if ( idade < 60 && anosTrab < 25) {
			System.out.println("Idade e anos de trabalho insuficientes");
		}
	}
}