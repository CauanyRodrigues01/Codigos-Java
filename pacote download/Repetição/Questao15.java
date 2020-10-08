package Repetição;

import java.util.Scanner;

public class Questao15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota = 1, soma = 0, media = 0, cont = -1;
		while (nota != 0){
			System.out.print("Nota: ");
			nota = sc.nextFloat();
			soma = soma + nota;
			cont ++;
		}
		media = soma / cont;
		System.out.printf("Sua média é %.2f\n", media);
	}
}