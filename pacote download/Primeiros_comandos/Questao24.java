package Primeiros_comandos;
import java.util.Scanner;

public class Questao24 {
	public static void main(String[] args) {
		Scanner eu = new Scanner(System.in);
		String nome = eu.next();
		int idade = eu.nextInt();
		int dias = idade*365;
		System.out.printf("%s, você já viveu %d dias",nome, dias);
	}
}