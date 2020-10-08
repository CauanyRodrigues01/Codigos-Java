package Repetição;

public class Questao11 {
	public static void main(String[] args) { 
		int p = 1;
		for (int mult = 1; mult <= 100; mult++) {
			if (mult%7==0) {
				System.out.print(""+ p);
				p = p * mult;
				System.out.printf(" * %d = %d\n", mult, p);
			}
		}
		System.out.printf("O produto é %d\n", p);
	}
}
