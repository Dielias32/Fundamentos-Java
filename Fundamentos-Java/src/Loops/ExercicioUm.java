package Loops;

public class ExercicioUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Crie um programa que use um loop for para calcular o somatorio dos numeros de
		 * 1 a 100 e exiba o resultado!
		 */
		
		int somatorio = 0;
		
		for(int i = 1; i <= 100; i++) {
			somatorio += i;
			
			
		}
		System.out.println("Soma de 1 a 100 é: " + somatorio);

	}

}
