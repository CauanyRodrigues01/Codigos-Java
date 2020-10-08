package Decisão;
 // Não condiz com a lógica da questão pq eu quero!
import java.util.Scanner;

public class Questao25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Número um: ");
		float n1 = sc.nextFloat();
		System.out.print("Número dois: ");
		float n2 = sc.nextFloat();
		System.out.print("Número três: ");
		float n3 = sc.nextFloat();
		
		if (n1 == n2 && n2 == n3) {
			System.out.println("Números iguais");
		} else if (n1 > n2 && n1 > n3) {
			System.out.println("Primeiro é maior");
		} else if (n2 > n1 && n2 > n3) {
			System.out.println("Segundo é maior");
		} else if (n3 > n1 && n3 > n2) {
			System.out.println("Último é maior");
		}
	}
}