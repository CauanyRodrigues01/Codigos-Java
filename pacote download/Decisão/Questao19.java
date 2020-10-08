package Decisão;
 
import java.util.Scanner;

public class Questao19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Turno [M/V/N]: ");
		String turno = sc.nextLine();
		if (turno.intern() == "M") {
			System.out.print("Bom dia!");
		} else if (turno.intern() == "V") {
			System.out.print("Boa tarde!");
		} else if (turno.intern() == "N") {
			System.out.print("Boa noite!");
		} else {
			System.out.print("Valor inválido!");
		}
	}
}