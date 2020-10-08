package Decisão;

import java.util.Scanner;

public class Questao05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o ano: ");
		int ano = sc.nextInt();
		if (ano%400==0) {
			System.out.print("O ano é bissexto");
		} else if (ano%4==0 && ano%100!=0){
			System.out.print("O ano é bissexto");
		}else {
			System.out.print("Não é ano bissexto");
		}
	}
}