package Condicionais;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Referente aos dias da semana, digite um numero entre 1 e 7");
		
		int dia = input.nextInt();
		
		switch (dia){
			
			case 1:
			case 7:	
				
				System.out.println("É final de semana! ");
				break;
				
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				System.out.println("Dias uteis ! ");
				break;
				
			default:
				System.out.println("numero invalido! ");
		}
		
		input.close();
	}

}
