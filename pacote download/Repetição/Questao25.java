package Repetição;

import java.util.Scanner;

public class Questao25 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = 1;
		double num = 0, res = 0;
		while (a==1) {
			System.out.println("Digite um numero: ");
			num = sc.nextFloat();
			if (num > 0 && num%1==0) {
				res = num * Math.pow(num,1) * Math.pow(num,2);
				System.out.printf("%.2f\n", res);
			} else if (num == 0) {
				a = 0;
			}
		}
	}
}
