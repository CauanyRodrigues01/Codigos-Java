package Repetição;

import java.util.Scanner;

public class Questao12 {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
		int cont = 1;
		while (cont >= 0) {
			System.out.print("Digite um numero [negativos para parar] ");
			cont = sc.nextInt();
		}
	}
}