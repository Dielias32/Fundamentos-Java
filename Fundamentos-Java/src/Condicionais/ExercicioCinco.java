package Condicionais;


import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Digite um numero!");
		int numero = input.nextInt();
		
		
		if (numero >= 10 && numero <= 20) {
			
			System.out.println("Dentro do intervalo");
		}else {
			
			System.out.println("Fora do intervalo");
		}
		
		input.close();
	}

}
