package Repeti��o;

import java.util.Scanner;

public class Questao06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int x = 1, n;
		float soma = 0;
		
		//COM WHILE
		/*while (x <= 3) {
			System.out.print("N�mero: ");
			n = sc.nextInt();
			soma = soma + n;
			x++;
		}*/
		
		//COM FOR
		for (int y = 1; y <= 3; y++) {
			System.out.print("N�mero: ");
			n = sc.nextInt();
			soma = soma + n;
		}
		System.out.printf("A media � %.2f", soma/3);
	}

}
