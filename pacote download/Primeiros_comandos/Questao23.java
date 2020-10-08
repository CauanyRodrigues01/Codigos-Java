package Primeiros_comandos;
import java.util.Scanner;

public class Questao23 {
	public static void main(String[] args){
		Scanner c = new Scanner(System.in);
		System.out.println("LADO DO QUADRADO: ");
		int num = c.nextInt();
		int peri = 4*num;
		System.out.println("Perímetro: "+ peri);
		int area = num*num;
		System.out.println("Área: "+ area);
	}
}