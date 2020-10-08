package Decisão;

import java.util.Scanner;
import java.lang.Double;

public class Questao21 {
	public static void main(String[] args) {
		Scanner sc 
		= new Scanner(System.in);
		
		float hora = 0, quantHora = 0;
		//Calculo do salario bruto
		System.out.print("Valor por hora: ");
		hora = sc.nextFloat();
		System.out.print("Quantidade de horas: ");
		quantHora = sc.nextFloat();
		float bruto = hora*quantHora;
		System.out.printf("Salário bruto: %f X %f = R$ %f", hora, quantHora, bruto);
		
		//IR
		float liquido1 = 0, desconto = 0;
		if (bruto > 0 && bruto <=900) {
			System.out.println("Insento de IR");
		} else if (bruto > 900 && bruto <= 1500) {
			desconto = (float)5/100*bruto;
			liquido1 = bruto - desconto;
			System.out.printf("(-) IR (5%) = R$ %d", desconto);
		} else if (bruto > 1500 && bruto <= 2500) {
			desconto = (float)10/100*bruto;
			liquido1 = bruto - desconto;
			System.out.printf("(-) IR (5%) = R$ %d", desconto);
		} else if (bruto > 2500) {
			desconto = (float)20/100*bruto;
			liquido1 = bruto - desconto;
			System.out.printf("(-) IR (5%) = R$ %d", desconto);
		} else {
			System.out.printf("Inválidos");
		}
		
		//INSS
		float descINSS = (float)10/100*bruto;
		float liquido2 = liquido1 - descINSS;
		System.out.printf("- INSS 10% = R$ %f", descINSS);
		
		//FGTS
		double FGTS = (float)11/100*bruto;
		double liquido3 = liquido2+FGTS;
		System.out.printf("FGTS 11% = R$ %d", FGTS);
		
		System.out.printf("Total de descontos = R$ %d",(desconto+descINSS));
		System.out.printf("Salário líquido: = R$ %d", liquido3);
	}
}