package Primeiros_comandos;
 import java.util.Scanner;
 
 public class Questao30 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantidade de sandu�ches: ");
		int quantidade = sc.nextInt();
		int queijo = quantidade * 50;
		int presunto = quantidade * 50;
		int hamburguer = quantidade * 100;
		System.out.printf("S�O NECESS�RIOS...\nQueijo: %dg\nPresunto: %dg\nHamb�rguer: %dg", queijo, presunto, hamburguer);
	}
 }