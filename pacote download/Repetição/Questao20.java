package Repeti��o;

public class Questao20 {
	public static void main(String[] args) {
		int cont = 0;
		for (float a = 0; a <= 1000; a++) {
			for (float b = 0; b <= 1000; b++) {
				if (a%b==0) {
					cont ++;
				}
			}
		}
		System.out.printf("%d n�meros divisores de 1000", cont);
	}
}
