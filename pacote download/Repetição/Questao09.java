package Repetição;

import java.util.Scanner;

public class Questao09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float soma = 0, num = 1;
		
		//COM WHILE
		while (num != 0) {
			System.out.print("Número: ");
			num = sc.nextFloat();
			soma = soma + num;
		}
		
		//COM FOR
		/*for (float x = 1; x != 0;) {
			System.out.print("Número: ");
			x = sc.nextFloat();
			soma = soma + x;
		}*/
		System.out.printf("A soma é %.1f", soma);
	}
}
