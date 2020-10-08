package Repetição;

import java.util.Scanner;

public class Questao21{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int num = sc.nextInt();
		int cont = 1;
		for(int c = 1; c <= num; c++){
			if (c%num==0){
				cont ++;
			}
		}
		System.out.printf("%d divisores.", cont);
	}
}