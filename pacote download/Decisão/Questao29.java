package Decis�o;

import java.util.Scanner;

public class Questao29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		System.out.print("Telefonou para a v�tima? S ou N ");
		String pista1 = sc.next();
		if (pista1.equals("S")) {
			cont++;
		}
		System.out.print("Esteve no local do crime? S ou N ");
		String pista2 = sc.next();
		if (pista2.equals("S")) {
			cont++;
		}
		System.out.print("Mora perto da v�tima? S ou N ");
		String pista3 = sc.next();
		if (pista3.equals("S")) {
			cont++;
		}
		System.out.print("Devia para a v�tima? S ou N ");
		String pista4 = sc.next();
		if (pista4.equals("S")) {
			cont++;
		}
		System.out.print("J� trabalhou com a v�tima? S ou N ");
		String pista5 = sc.next();
		if (pista5.equals("S")) {
			cont++;
		}
		
		if (cont == 0 || cont == 1){
			System.out.println("Inocente");
		} else if (cont == 2) {
			System.out.println("Suspeita");
		} else if (cont == 3 || cont == 4) {
			System.out.println("C�mplice");
		} else if (cont == 5) {
			System.out.println("Assassino");
		}
	}
}