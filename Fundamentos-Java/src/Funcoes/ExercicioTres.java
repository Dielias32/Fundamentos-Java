package Funcoes;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um numero!");
		
		int numero = input.nextInt();
		String verificar = paridade(numero);
		
		System.out.println(verificar);
		
		input.close();

	}
	
	
	
	public static String paridade(int numero) {
		
		
		
		if (numero % 2 == 0) {
			
			return "numero " + numero + " é par";
		}else {
			return "o numero " + numero +  " é impar";
		}
		
	}

}
