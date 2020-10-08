package Array;
import java.util.Scanner;
public class Questao10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sc.nextInt();
			vetorB[i] = vetorA[i]%2;
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
	}
}
