package Repetição;

public class Questao18 {
	public static void main(String[] args){
		int num = 1000, soma = 0, cont = 0;
		while (num <= 2000){
			if (num%3==0 && num%5==0 && num%10!=0){
				System.out.printf("%d\n", num);
				soma = soma + num;
				cont++;
			}
			num++;
		}
		float media = soma / cont;
		System.out.printf("A media é %.2f", media);
	}
}