package Repeti��o;

import java.util.Scanner;

public class Questao14 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("N�mero: ");
		int num = sc.nextInt();
		while (num != 0) {
			System.out.printf("%d\n", num);
			if (num < 0) {
				num ++;
			} else if (num > 0) {
				num --;
			}
		}
	}
}