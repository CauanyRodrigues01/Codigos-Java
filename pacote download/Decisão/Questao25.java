package Decis�o;
 // N�o condiz com a l�gica da quest�o pq eu quero!
import java.util.Scanner;

public class Questao25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N�mero um: ");
		float n1 = sc.nextFloat();
		System.out.print("N�mero dois: ");
		float n2 = sc.nextFloat();
		System.out.print("N�mero tr�s: ");
		float n3 = sc.nextFloat();
		
		if (n1 == n2 && n2 == n3) {
			System.out.println("N�meros iguais");
		} else if (n1 > n2 && n1 > n3) {
			System.out.println("Primeiro � maior");
		} else if (n2 > n1 && n2 > n3) {
			System.out.println("Segundo � maior");
		} else if (n3 > n1 && n3 > n2) {
			System.out.println("�ltimo � maior");
		}
	}
}