package Decisão;

import java.util.Scanner;

public class Questao20 {
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.print("Número entre 1 e 7: ");
		int num = sc.nextInt();
		if (num == 1) {
			System.out.print("Domingo");
		} else if (num == 2) {
			System.out.print("Segunda");
		} else if (num == 3) {
			System.out.print("Terça");
		} else if (num == 4) {
			System.out.print("Quarta");
		} else if (num == 5) {
			System.out.print("Quinta");
		} else if (num == 6) {
			System.out.print("Sexta");
		} else if (num == 7) {
			System.out.print("Sábado");
		} else {
			System.out.print("Valor inválido");
		}*/
		Scanner sc = new Scanner(System.in);
	    System.out.println("JOQUEMPÔ\n---------\n");
	    boolean a;
	    while (a = true){
	      System.out.println("Escolha uma das opções:");
	      System.out.println("0-Pedra\n1-Papel\n2-Tesoura\n");
	      int opcao = sc.nextInt();
	      if (opcao!=0 && opcao!=1 && opcao!=2){
	        System.out.println("Opção inválida");
	      } else if (opcao == 0){
	        //alguma coisa
	      } else if (opcao == 1){
	        //alguma coisa
	      } else if (opcao == 2){
	        //alguma coisa
	      }
	      System.out.println("\nVamos jogar novamente?");
	      String continuar = sc.nextLine();
	      String tem = "nao";
	      if (continuar.equalsIgnoreCase(tem)){
	        a = false;
	      }
	    }
	  }
	}
}