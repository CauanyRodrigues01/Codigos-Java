package Repeti��o;

import java.util.Scanner;

public class Questao16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont = 0, num = 1;
		while (num != 0) {
			System.out.print("N�mero: ");
			num = sc.nextInt();
			if (num%3==0){
				cont ++;
			}
		}
		System.out.printf("M�ltiplos de 3: %d\n", cont);
	}
}