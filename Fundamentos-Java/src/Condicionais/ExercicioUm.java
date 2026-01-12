package Condicionais;


import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);	
	
		
		System.out.println("Digite o valor do produto: ");
		
		double valorProduto = input.nextDouble();
		
		
		if (valorProduto < 50) {
			
			System.out.println("Produto é barato!");
			
		} else if (valorProduto >= 50 && valorProduto <= 100) {
			
			System.out.println("Produto é medio!");
			
		} else {
			
			System.out.println("Produto é caro!");
		}
		
		
		input.close();
		

	}

}
