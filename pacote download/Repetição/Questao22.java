package Repetição;

public class Questao22 {
	public static void main(String args[]) {
		int cont = 0;
		for (int c = 1; c <= 121; c++) {
			if (121%c==0) {
				cont++;
			}
		}
		if (cont == 2) {
			System.out.println("É primo");
		} else {
			System.out.println("Não é primo");
		}
	}
}
