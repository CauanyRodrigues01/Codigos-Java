package Repetição;

import java.util.Scanner;

public class Questao26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3;
		System.out.print("Digite um numero: ");
		n1 = sc.nextInt();
		System.out.print("Digite um numero: ");
		n2 = sc.nextInt();
		System.out.print("Digite um numero: ");
		n3 = sc.nextInt();
		if (n1 < n2 && n2 < n3) {
			System.out.printf("%d %d %d", n1, n2, n3);
		} else if (n1 < n3 && n3 < n2) {
			System.out.printf("%d %d %d", n1, n3, n2);
		} else if (n2 < n1 && n1 < n3) {
			System.out.printf("%d %d %d", n2, n1, n3);
		} else if (n2 < n3 && n3 < n1) {
			System.out.printf("%d %d %d", n2, n3, n1);
		} else if (n3 < n1 && n1 < n2) {
			System.out.printf("%d %d %d", n3, n1, n2);
		} else if (n3 < n2 && n2 < n1) {
			System.out.printf("%d %d %d", n3, n2, n1);
		}
	}
}
