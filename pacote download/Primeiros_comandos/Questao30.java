package Primeiros_comandos;
 import java.util.Scanner;
 
 public class Questao30 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantidade de sanduíches: ");
		int quantidade = sc.nextInt();
		int queijo = quantidade * 50;
		int presunto = quantidade * 50;
		int hamburguer = quantidade * 100;
		System.out.printf("SÃO NECESSÁRIOS...\nQueijo: %dg\nPresunto: %dg\nHambúrguer: %dg", queijo, presunto, hamburguer);
	}
 }