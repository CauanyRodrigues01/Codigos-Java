package Repetição;

import java.util.Scanner;

public class Questao14 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Número: ");
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