package Repeti��o;

import java.util.Scanner;

public class Questao17 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float num = 1, soma = 0, cont = 0;
		while (num >= 0){
			System.out.print("N�mero: ");
			num = sc.nextFloat();
			if (num%3==0){
				soma = soma + num;
				cont ++;
			}
		}
		float media = soma / cont;
		System.out.printf("m�dia dos multiplos de 3: %.2f", media);
	}
}