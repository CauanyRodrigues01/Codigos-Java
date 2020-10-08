package Decisão;

import java.util.Scanner;

public class Questao09 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Peso: ");
		float peso = sc.nextFloat();
		System.out.println("Altura: ");
		float altura = sc.nextFloat();
		float imc = peso/altura*altura;
		if (imc< 18.5){
			System.out.println("Você está abaixo do peso ideal");
		} else if (18.5<imc && imc<=24.9){
			System.out.println("Parabéns — você está em seu peso normal!");
		} else if (25<imc && imc<=29.9){
			System.out.println("Você está acima de seu peso (sobrepeso)");
		} else if (30<imc && imc<=34.9){
			System.out.println("Obesidade grau I");
		} else if (35<imc && imc<=39.9) {
			System.out.println("Obesidade grau II");
		} else if (imc>40) {
			System.out.println("Obesidade grau II");
		}
	}
}
