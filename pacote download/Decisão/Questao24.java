package Decisão;

import java.util.Scanner;

public class Questao24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Time: ");
		String time1 = sc.next();
		System.out.printf("Número de gols: ");
		int gols1 = sc.nextInt();
		System.out.printf("Time: ");
		String time2 = sc.next();
		System.out.printf("Número de gols: ");
		int gols2 = sc.nextInt();
		
		if (gols1 > gols2) {
			System.out.println("Vencedor: "+time1);
		} else if (gols2 > gols1) {
			System.out.println("Vencedor: "+time2);
		} else if (gols1 == gols2) {
			System.out.println("EMPATE");
		} else {
			System.out.println("Inválidos");
		}
	}
}