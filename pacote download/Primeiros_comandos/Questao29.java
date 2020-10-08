package Primeiros_comandos;
import java.util.Scanner;

public class Questao29 {
	public static void main(String[] args) {
		Scanner eu = new Scanner(System.in);
		System.out.println("Moedas de 1 real: ");
		int um = eu.nextInt();
		System.out.println("Notas de 5 reais: ");
		int cinco = eu.nextInt();
		System.out.println("Notas de 10 reais: ");
		int dez = eu.nextInt();
		System.out.println("Notas de 50 reais: ");
		int cinquenta = eu.nextInt();
		System.out.println("Notas de 100 reais: ");
		int cem = eu.nextInt();
		
		double total = (um*1)+(cinco*5)+(dez*10)+(cinquenta*50)+(cem*100);
		System.out.println("TOTAL: "+total);
	}
}
