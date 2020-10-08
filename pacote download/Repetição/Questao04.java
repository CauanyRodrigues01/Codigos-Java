package Repetição;

public class Questao04 {
	public static void main(String[] args){
		//COM WHILE
		int x = 1;
		while (x <= 100) {
			if (x%2==0) System.out.printf("%d\n", x);
			x++;
		}
		
		//COM FOR
		for (int t = 1; t <= 100; t++) {
			if (t%2==0) System.out.printf("%d\n", t);
		}
	}
}