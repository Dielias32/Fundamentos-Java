package Funcoes;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus °C para ser coinvertido em °F");
		
		double temperatura = input.nextDouble();
		
		double conversao = conversorTemperatura(temperatura);
				
		
		
		System.out.println("A temperatura em °F é " + conversao);
		 

	}
	
	
	
	public static double conversorTemperatura(double gc) {
		
		
	return (gc * 9/5) + 32;
		
		
		
	}

}
