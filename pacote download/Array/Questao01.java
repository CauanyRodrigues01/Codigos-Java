package Array;
import java.util.Scanner;
public class Questao01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sc.nextInt();
			vetorB[i] = vetorA[i];
		}
		for (int c = 0; c<vetorB.length; c++) {
			System.out.println(vetorB[c]);
		}
	}
}
