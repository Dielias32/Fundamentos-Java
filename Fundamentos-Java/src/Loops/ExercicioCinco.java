package Loops;

public class ExercicioCinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Desenvolva um programa que calcule o fatorial de um numero inteiro positivo
		 * usando for
		 */
		
		int valor = 5;
		int fatorial = 1;
		
		for(int i = 1; i <= valor; i++) {
			
			fatorial *= i;
			
			
		}
		
		System.out.println(fatorial);
	}

}
