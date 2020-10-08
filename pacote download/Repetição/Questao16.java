package Repetição;

import java.util.Scanner;

public class Questao16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont = 0, num = 1;
		while (num != 0) {
			System.out.print("Número: ");
			num = sc.nextInt();
			if (num%3==0){
				cont ++;
			}
		}
		System.out.printf("Múltiplos de 3: %d\n", cont);
	}
}