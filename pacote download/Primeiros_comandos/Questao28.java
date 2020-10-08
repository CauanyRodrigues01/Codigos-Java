package Primeiros_comandos;
import java.util.Scanner;

public class Questao28 {
	public static void main(String[] args) {
		Scanner eu = new Scanner(System.in);
		System.out.println("Latinhas de 350ml: ");
		int latinhas = eu.nextInt();
		System.out.println("Garrafas de 600ml: ");
		int gara_600 = eu.nextInt();
		System.out.println("Garrafas de 2l: ");
		int gara_2 = eu.nextInt();
		double total = (latinhas*3.5) + (gara_600*6.0) + (gara_2*2000);
		System.out.println("TOTAL DE LITROS: "+total);
	}
}