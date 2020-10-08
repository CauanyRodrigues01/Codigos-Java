package Decisão;

import java.util.Scanner;

public class Questao22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas bananas? ");
		int quant = sc.nextInt();
		
		if (quant < 12) {
			double n = quant * 1.3;
			System.out.println(n+" Reais");
		} else if (quant >= 12) {
			float n = quant * 1;
			System.out.println(n+" Reais");
		}
	}
}