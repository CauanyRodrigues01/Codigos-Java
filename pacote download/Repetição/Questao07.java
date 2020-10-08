package Repetição;

import java.util.Scanner;

public class Questao07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		float x = 1, soma = 0, cont = -1;
		
		//COM WHILE
		/*while (x != 0) {
			System.out.print("Número: ");
			x = sc.nextFloat();
			soma = soma + x;
			cont++;
		}*/
		
		//COM FOR
		for (float y = 1; y != 0; cont++) {
			System.out.print("Número: ");
			y = sc.nextFloat();
			soma = soma + y;
		}
		
		float media = soma / cont;
		System.out.printf("A média é %.2f", media);
	}
}