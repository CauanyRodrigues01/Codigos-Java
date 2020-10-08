package Array;
import java.util.Scanner;
public class Questao03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sc.nextInt();
			vetorB[i] = vetorA[i]*vetorA[i];
		}
		System.out.print("Vetor A = ");
		for (int c = 0; c<vetorA.length; c++) {
			System.out.print(vetorA[c]+" ");
		}
		System.out.println();
		System.out.print("Vetor B = ");
		for (int c = 0; c<vetorB.length; c++) {
			System.out.print(vetorB[c]+" ");
		}
	}
}
