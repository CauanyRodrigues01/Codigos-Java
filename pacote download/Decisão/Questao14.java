package Decis�o;

import java.util.Scanner;

public class Questao14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um n�mero");
		float num1 = sc.nextFloat();
		if (num1 % 1 == 0 && num1 > 0) {
			System.out.println("O n�mero � inteiro e positivo ");
		} else {
			System.out.print("O n�mero n�o � inteiro e positivo ");
		} 
		
		System.out.println("Digite um n�mero");
		float num2 = sc.nextFloat();
		if (num2 % 1 == 0 && num2 > 0) {
			System.out.println("O n�mero � inteiro e positivo ");
		} else {
			System.out.print("O n�mero n�o � inteiro e positivo ");
		}
		
		System.out.println("Digite um n�mero");
		float num3 = sc.nextFloat();
		if (num3 % 1 == 0 && num3 > 0) {
			System.out.println("O n�mero � inteiro e positivo ");
		} else {
			System.out.print("O n�mero n�o � inteiro e positivo ");
		}
	}
}