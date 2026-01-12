package Condicionais;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vamos veriricar os numeros!");
		
		System.out.println("Digite um numero");
		
		
		int numero = input.nextInt();
		
		int validador = numero % 2;

		
		String resposta = Integer.toString(validador);
		
		
		System.out.println(resposta);
		
		if(resposta.equals("0")) {
			System.out.println("Par");
		}else {
			System.out.println("Impar");
			
		}
		input.close();
		
	}

}
