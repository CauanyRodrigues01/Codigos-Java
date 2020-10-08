package Primeiros_comandos;
import java.util.Scanner;

public class Questao27 {
	public static void main(String[] args) {
		Scanner eu = new Scanner(System.in);
		System.out.println("Pequenas: ");
		int pequena = eu.nextInt();
		System.out.println("Médias: ");
		int media = eu.nextInt();
		System.out.println("Grandes: ");
		int grande = eu.nextInt();
		int total = (pequena*10)+(media*12)+(grande*15);
		System.out.println("Total: "+total);
	}
}