package Repetição;

public class Questao02 {
	public static void main(String[] args) {
		//COM WHILE
		/*int x = 1, soma = 0;
		while (x <= 1000) {
			soma = soma + x;
			x++;
		}*/
		
		//COM FOR
		int soma = 0;
		for (int x = 1; x <= 1000; x++) {
			soma = soma + x;
		}
		
		System.out.printf("A soma é %d", soma);
	}
}