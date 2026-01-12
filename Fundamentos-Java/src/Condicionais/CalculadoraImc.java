package Condicionais;
import java.util.Scanner;

public class CalculadoraImc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vamos calcular o seu imc!");
		
		System.out.println("Digite o peso em kg: ");
		double peso = input.nextDouble();
		
		System.out.println("Digite sua altura em metros: ");
		double altura = input.nextDouble();
		
		double imc = peso / (altura * altura);
		
		
		if (imc < 18.5) {
			System.out.println("Seu IMC é: " + imc + "vc esta abaixo do peso ideal!!");
		
		
		}else if (imc >=18.5 && imc <= 24.9) {
			
			System.out.println("Seu IMC é: " + imc + "vc esta no peso ideal!!");
		} else if(imc >=25 && imc <= 29.9) {
			System.out.println("Seu IMC é: " + imc + "vc esta com sobrepeso!!");
		}else {
			System.out.println("Seu IMC é: " + imc + "vc esta obeso!!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		input.close();
	}

}
