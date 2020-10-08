package Decisão;

import java.util.Scanner;

public class Questao03{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Número: ");
		int num = sc.nextInt();
		if (num%2==0) {
			System.out.println("É par");
		} else {
			System.out.println("É impar");
		}
	}
	
}