package Decisão;

import java.util.Scanner;

public class Questao10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num = sc.nextInt();
		if (num%2==0 && num%5==0) {
			System.out.println("É divisível por 2 e 5");
		} else {
			System.out.println("Não é divisível por 2 e 5");
		}
	}
}