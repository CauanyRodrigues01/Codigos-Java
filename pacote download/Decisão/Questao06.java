package Decis�o;

import java.util.Scanner;

public class Questao06 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Sal�rio: ");
		Float salario = sc.nextFloat();
		System.out.println("Presta��o: ");
		Float prestacao = sc.nextFloat();
		if (prestacao>((float)20/100*salario)){
			System.out.println("Empr�stimo n�o concedido");
		} else { 
			System.out.println("Empr�stimo concedido");
		}
	}
}