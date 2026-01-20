package Loops;

public class ExercicioDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Desenvolva um programa que use um loop while para imprimir todos os numeros
		 * pares de 1 a 20
		 */
		
		
		int valor = 1;
		while(valor <=20) {
			
			if(valor % 2 == 0) {
				System.out.println("Valor Par: " + valor);
				
			}
			valor ++;
			
		}

	}

}
