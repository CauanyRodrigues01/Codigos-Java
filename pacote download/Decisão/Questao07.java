package Decisão;

import java.util.Scanner;

public class Questao07 {
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
		System.out.println("Valor de a: ");
		int a = sc.nextInt();
		System.out.println("Valor de b: ");
		int b = sc.nextInt();
		System.out.println("Valor de x: ");
		int x = sc.nextInt();
		int valor = (a*x)+b;
		System.out.printf("f(%d) = %d%d + %d\nf(%d) = %d", x, a, x, b, x, valor);
	}
}