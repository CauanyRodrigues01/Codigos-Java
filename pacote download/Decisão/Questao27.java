package Decis�o;

import java.util.Scanner;

public class Questao27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N�mero: ");
		int n1 = sc.nextInt();
		System.out.print("N�mero: ");
		int n2 = sc.nextInt();
		System.out.print("N�mero: ");
		int n3 = sc.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			System.out.print(n1);
			if (n2 > n3) {
				System.out.printf(" %d %d",n2, n3);
			} else if (n3 > n2) {
				System.out.printf(" %d %d",n3, n2);
			}
		} else if (n2 > n1 && n2 > n3) {
			System.out.print(n2);
			if (n1 > n3) {
				System.out.printf(" %d %d",n1, n3);
			} else if (n3 > n1) {
				System.out.printf(" %d %d",n3, n1);
			}
		} else if (n3 > n1 && n3 > n2) {
			System.out.print(n3);
			if (n1 > n2) {
				System.out.printf(" %d %d",n1, n2);
			} else if (n2 > n1) {
				System.out.printf(" %d %d",n2, n1);
			}
		}
	}
}