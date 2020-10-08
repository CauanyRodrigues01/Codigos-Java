package Decisão;

import java.util.Scanner;

public class Questao12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Idade: ");
		int idade = sc.nextInt();
		if (idade < 0 || idade > 120) {
			System.out.print("Erro");
		}
	}
}