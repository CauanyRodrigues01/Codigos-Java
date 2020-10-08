package Decisão;

import java.util.Scanner;

public class Questao06 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Salário: ");
		Float salario = sc.nextFloat();
		System.out.println("Prestação: ");
		Float prestacao = sc.nextFloat();
		if (prestacao>((float)20/100*salario)){
			System.out.println("Empréstimo não concedido");
		} else { 
			System.out.println("Empréstimo concedido");
		}
	}
}