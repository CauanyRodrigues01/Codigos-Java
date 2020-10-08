package Primeiros_comandos;
import java.util.Scanner;

public class Questao32 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double watts_100 = (float)(1/100*998);
		double watts = watts_100/100;
		System.out.println("Quilowatts gasto: ");
		double gasto = sc.nextDouble();
		System.out.println("Valor do quilowatt: "+watts);
		double pagamento = watts * gasto;
		System.out.println("Pagamento em reais: "+pagamento);
		double paga_descon = (float)(10/100*pagamento);
		System.out.println("Pagamento com desconto: "+paga_descon);
	}
}