package Loops;

public class ExercicioSeis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Crie um programaque conte quantos digitos a em um numero inteiro positivo
		 * usando while
		 */
		
		
		int numero = 7777777;
		int contador = 0;
		
		
		System.out.println(numero);
		
		while(numero !=0) {
			numero = numero/10;
			System.out.println(numero);
			contador ++;
		}
		
		System.out.println(contador);
	}

}
