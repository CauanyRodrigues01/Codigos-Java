package Decisão;

import java.util.Scanner;

public class Questao13{
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Digite uma nota");
	int a= sc.nextInt();
	if (a<0 || a>100) {
		System.out.println("Inválido");
	} else {
		System.out.println("Digite a segunda nota");
		int b= sc.nextInt();
		if (b<0 || b>100){
			System.out.println("Inválido");
		} else{
			System.out.println("Digite a terceira nota");
			int c= sc.nextInt();
			if (c<0 || c>100){
				System.out.println("Inválido");
			} else{
				float media= (a+b+c)/ 3;
				System.out.println(media);
			}	
		}
	}
	}
}