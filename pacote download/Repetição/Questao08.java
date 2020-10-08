package Repetição;

import java.util.Scanner;

public class Questao08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String x = "";
		int cont = 0;
		
		//COM WHILE
		/*while (!(x.equals("sair"))) {
			System.out.print("Digite uma palavra: ");
			x = sc.next();
			if (x.equals("oi")) {
				cont++;
			}
		}*/
		
		//COM FOR
		for (x = ""; (!(x.equals("sair")));) {
			System.out.print("Digite uma palavra: ");
			x = sc.next();
			if (x.equals("oi")) {
				cont++;
			}
		}
		
		System.out.printf("Você digitou \"oi\" %d vezes", cont);
	}
}
