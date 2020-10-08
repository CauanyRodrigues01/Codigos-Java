package Array;

import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		for(int a = 0; a < vetorA.length; a++) {
			vetorA[a] = sc.nextInt();
		}
		for(int b = 0; b < vetorA.length; b++) {
			vetorB[b] = sc.nextInt();
		}
		for(int c = 0; c < vetorA.length; c++) {
			vetorC[c] = vetorA[c] - vetorB[c];
		}
		
		System.out.print("Vetor A = ");
		for (int d = 0; d < vetorA.length; d++) {
			System.out.print(vetorA[d]+" ");
		}
		System.out.println();
		System.out.print("Vetor B = ");
		for (int e = 0; e < vetorB.length; e++) {
			System.out.print(vetorB[e]+" ");
		}
		System.out.println();
		System.out.print("Vetor C = ");
		for (int f = 0; f < vetorC.length; f++) {
			System.out.print(vetorC[f]+" ");
		}
	}
}
