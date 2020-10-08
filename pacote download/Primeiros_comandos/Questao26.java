package Primeiros_comandos;
import java.util.Scanner;

public class Questao26 {
	public static void main(String[] args) {
		Scanner eu = new Scanner(System.in);
		System.out.println("Preço por litro: ");
		float preco = eu.nextFloat();
		System.out.println("Valor do pagamento: ");
		float valor = eu.nextFloat();
		float litro = valor/preco;
		System.out.println("Litros: "+preco);
	}
}