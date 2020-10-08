package Decisão;

import java.util.Scanner;
import java.lang.Math;

public class Questao18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Cateto 1:");
		int ca_1 = sc.nextInt();
		System.out.print("Cateto 2: ");
		int ca_2 = sc.nextInt();
		if (ca_1 > 0 && ca_2 > 0 && ca_1%1==0 && ca_2%1==0) {
			double hipotenusa = (Math.pow(ca_1,2)) + (Math.pow(ca_2,2));
			System.out.print(hipotenusa);
		}
	}
}

