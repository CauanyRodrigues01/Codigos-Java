package Repetição;

import java.util.Scanner;

public class Questao19 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float nota1, nota2, media;
		for (int a = 1; a <= 10; a++) {
			System.out.printf("Aluno %d\n", a);
			int b = 0, c = 0;
			while (b == 0) {
				System.out.print("Nota 1: ");
				nota1 = sc.nextFloat();
				if (nota1 > 0 && nota1 < 100) {
					b = 1;
					while(c == 0) {
						System.out.print("Nota 2: ");
						nota2 = sc.nextFloat();
						if (nota2 > 0 && nota2 < 100) {
							c = 1;
							media = (nota1 + nota2)/2;
							System.out.printf("Média: %.2f\n", media);
						} else {
							System.out.println("Invalido");
						}
					}
				} else {
					System.out.println("Invalido");
				}
			}
		}
	}
}