package Decis�o;

import java.util.Scanner;

public class Questao10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		int num = sc.nextInt();
		if (num%2==0 && num%5==0) {
			System.out.println("� divis�vel por 2 e 5");
		} else {
			System.out.println("N�o � divis�vel por 2 e 5");
		}
	}
}