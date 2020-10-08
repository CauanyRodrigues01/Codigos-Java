package Decisão;

import java.util.Scanner;

public class Questao01 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("num1:");
		int a = sc.nextInt();
		System.out.println("num2:");
		int b = sc.nextInt();
		System.out.println("num3");
		int c = sc.nextInt();
		if (b>a && a<c){
			System.out.println(a);
		} else if (a>b && b<c){
			System.out.println(b);
		} else if (a>c && c<b){
			System.out.println(c);
		}
	}
}