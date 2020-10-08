package Repetição;

import java.util.Scanner;

public class Questao05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = 1, soma = 0;
		//COM WHILE
		/*while (!(n == 0)) {
			System.out.println("Número: ");
			n = sc.nextInt();
			soma = soma + n;
			
		}*/
		
		//COM FOR 
		for (int y = 1; !(n == 0);) {
			System.out.println("Número: ");
			n = sc.nextInt();
			soma = soma + n;
		}
		System.out.printf("A soma é %d", soma);
	}
}