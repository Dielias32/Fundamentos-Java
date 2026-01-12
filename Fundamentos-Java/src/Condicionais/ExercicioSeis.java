package Condicionais;

import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite uma letra");
		
		String letra = input.next().toLowerCase();
		
		
		switch(letra) {
		
		
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
		
		System.out.println("É vogal!");
		break;
		
		default:
			System.out.println("É Consoante!");
			break;
		}
		input.close();
		
	}

}
