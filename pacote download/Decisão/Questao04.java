package Decis�o;

import java.util.Scanner;

public class Questao04{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("N�mero 1: ");
		int a = sc.nextInt();
		System.out.println("N�mero 2: ");
		int b = sc.nextInt();
		int soma = a+b;
		System.out.println(soma);
		if (soma%2==0) {
			System.out.println("A soma � par");
		} else {
			System.out.println("A soma � �mpar");
		}
	}
	
}