package Loops;

public class ExerciciosRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("impressao de numeros pares ate 50");
		
		for(int i = 0; i <=50; i++) {
			
			
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("Dois");
		int numero = 1;
		int soma = 0;
		int contador = 0;
		while(numero != 0) {
			
			numero = (int) (Math.random() * 10);
			
			
			soma += numero;
			contador++;
			
			System.out.println("numero: " + numero);
			System.out.println("soma: " + soma);
			
			
		}
		System.out.println("Contador: " + contador);
		
		

	}

}
