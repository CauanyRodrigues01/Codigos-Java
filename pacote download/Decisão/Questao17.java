package Decisão;

import java.util.Scanner;

public class Questao17 {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite um número entre 1 e 12");
		int a= sc.nextInt();
		if (a<=0 || a>12){
			System.out.println("Inválido");
		} else if (a==1){
			System.out.println("Janeiro");
		} else if (a==2){
			System.out.println("Fevereiro");
		} else if (a==3){
			System.out.println("Março");
		} else if (a==4){
			System.out.println("Abril");
		}else if (a==5){
			System.out.println("Maio");
		}else if (a==6){
			System.out.println("Junho");
		}else if (a==7){
			System.out.println("Julho");
		}else if (a==8){
			System.out.println("Agosto");
		}else if (a==9){
			System.out.println("Setembro");
		}else if (a==10){
			System.out.println("Outubro");
		}else if (a==11){
			System.out.println("Novembro");
		}else{
			System.out.println("Dezembro");
		}
	}
}