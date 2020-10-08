package Repetição;

import java.util.Scanner;

public class Questao23 {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int num = sc.nextInt();
		int cont = 0;
		for (int c = 1; c <= num; c++) {
			if (num%c==0) {
				cont++;
			}
		}
		if (cont == 2) {
			System.out.println("É primo");
		} else {
			System.out.println("Não é primo");
		}
	}
}