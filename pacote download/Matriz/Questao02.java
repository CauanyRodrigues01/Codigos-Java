package Matriz;

import java.util.Random;
import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[][] numerosAleatorios = new int[10][10];
		
		Random numeroRandom = new Random();
		
		for(int i = 0; i < numerosAleatorios.length; i++ ) {
			for(int j = 0; j < numerosAleatorios.length; j++ ) {
				numerosAleatorios[i][j] = numeroRandom.nextInt(100);
			}
		}
		
		for(int i = 0; i < numerosAleatorios.length; i++ ) {
			for(int j = 0; j < numerosAleatorios.length; j++ ) {
				System.out.print(numerosAleatorios[i][j]+" ");
			}
			System.out.println();
		}
		
		int maiorL5 = 0;
		int menorL5 = 101;
		int linha5 = 5;
		for(int g = 0; g < numerosAleatorios[linha5].length; g++) {
			if (numerosAleatorios[linha5][g] > maiorL5) {
				maiorL5 = numerosAleatorios[linha5][g];
			}
			if (numerosAleatorios[5][g] < menorL5) {
				menorL5 = numerosAleatorios[linha5][g];
			}
		}
		System.out.println("Maior valor da linha 5 = " + maiorL5);
		System.out.println("Menor valor da linha 5 = " + menorL5);	
		
		int maiorC7 = 0;
		int menorC7 = 101;
		int col7 = 7;
		for(int g = 0; g < numerosAleatorios.length; g++) {
			if (numerosAleatorios[g][col7] > maiorC7) {
				maiorC7 = numerosAleatorios[g][col7];
			}
			if (numerosAleatorios[g][col7] < menorC7) {
				menorC7 = numerosAleatorios[g][col7];
			}
		}
		System.out.println("Maior valor da coluna 7 = " + maiorC7);
		System.out.println("Menor valor da coluna 7 = " + menorC7);	
	}

}
