package Repetição;

import java.util.Scanner;

public class Questao24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua data de nascimento com 3 numeros: ");
		int dia = sc.nextInt();
		int mes = sc.nextInt();
		int ano = sc.nextInt();
		
		int idade = 2020 - ano;
		System.out.printf("Você tem %d", idade);
	}
}
