package Repetição;

import java.util.Scanner;

public class Questao10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String x = "c", menor = "", maior = "";
		int cont = 0;
		
		//COM WHILE
		/*while (!(x.equals(""))) {
			System.out.print("Palavra: ");
			x = sc.nextLine();
			cont++;
			if (cont == 1) {
				menor = x;
				maior = x;
			} else if (!(x.equals(""))){
				if (x.length() < menor.length()) {
					menor = x;
				}
				if (x.length() > maior.length()) {
					maior = x;
				}
			}
		}*/
		
		//COM FOR 
		for (String y = "c"; !(y.equals(""));) {
			System.out.print("Palavra: ");
			y = sc.nextLine();
			cont++;
			if (cont == 1) {
				menor = y;
				maior = y;
			} else if (!(y.equals(""))){
				if (y.length() < menor.length()) {
					menor = y;
				}
				if (y.length() > maior.length()) {
					maior = y;
				}
			}
		}
		System.out.printf("A menor palavra foi %s e a maior foi %s", menor, maior);
	}
}
