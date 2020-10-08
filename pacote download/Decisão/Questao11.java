package Decisão;

import java.util.Scanner;

public class Questao11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Idade: ");
		int idade = sc.nextInt();
		
		if (idade >= 5 && idade <= 7) {
			System.out.print("Infantil A");
		} else if (idade >= 8 && idade <= 10) {
			System.out.print("Infantil B");
		} else if (idade >= 11 && idade <= 13) {
			System.out.print("Juvenil A");
		} else if (idade >= 14 && idade <= 17) {
			System.out.print("Juvenil B");
		} else if (idade >= 18) {
			System.out.print("Adulto");
		}
	}
}