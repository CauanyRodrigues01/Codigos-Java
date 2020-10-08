package Array;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Questao04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###.###");
		int[] vetorA = new int[15];
		double[] vetorB = new double[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sc.nextInt();
			vetorB[i] = Math.sqrt(vetorA[i]);
		}
		System.out.print("Vetor A = ");
		for (int c = 0; c<vetorA.length; c++) {
			System.out.print(vetorA[c]+" ");
		}
		System.out.println();
		System.out.print("Vetor B = ");
		for (int c = 0; c<vetorB.length; c++) {
			System.out.print(df.format(vetorB[c])+" ");
		}
	}
}
