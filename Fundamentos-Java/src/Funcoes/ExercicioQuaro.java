package Funcoes;

import java.util.Scanner;
public class ExercicioQuaro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor da nota");
		int nota = scanner.nextInt();
		
		String verificar = classificarNota(nota);
		
		System.out.println("Sua nota é " + nota + " e vc tirou um " + verificar);

	}

	public static String classificarNota(int nota) {

		if (nota < 0 || nota > 10) {

			return "nota invalida";
		}

		switch (nota) {
		case 10:
		case 9:
			return "A";
		case 8:
			return "B";
		case 7:
			return "C";
		case 6:
			return "D";
		default:
			return "F";
		}
		
		

	}

}
