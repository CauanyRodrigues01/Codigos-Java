package Primeiros_comandos;
import java.util.Scanner;

public class Questao22 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		int num = x.nextInt();
		System.out.println(num-1);
		System.out.println(num+1);
	}
}