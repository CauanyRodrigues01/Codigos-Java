package Decis�o;

import java.util.Scanner;

public class Questao03{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("N�mero: ");
		int num = sc.nextInt();
		if (num%2==0) {
			System.out.println("� par");
		} else {
			System.out.println("� impar");
		}
	}
	
}