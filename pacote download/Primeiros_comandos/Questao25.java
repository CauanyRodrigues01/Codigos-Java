package Primeiros_comandos;
import java.util.Scanner;

public class Questao25 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.printf("Pão francês: ");
		int frances = x.nextInt();
		System.out.printf("Pão doce: ");
		int doce = x.nextInt();
		float total = (float)((frances * 0.12) + (doce*1.50));
		System.out.println("Arrecadação: "+total);
		double poupanca = (float)10/100*total;
		System.out.println("Poupança: "+poupanca);
		
	}
}