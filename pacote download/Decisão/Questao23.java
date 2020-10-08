package Decisão;

import java.util.Scanner;

public class Questao23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ano atual: ");
		int atual = sc.nextInt();
		System.out.println("Nascimento: ");
		int nasc = sc.nextInt();
		int idade = atual - nasc;
		
		if (idade < 16) {
			System.out.println("Nao pode votar");
		} else if (idade == 16 || idade == 17) {
			System.out.println("Vota de quiser");
		} else if (idade >= 18) {
			System.out.println("Tem que votar");
		}
	}
}