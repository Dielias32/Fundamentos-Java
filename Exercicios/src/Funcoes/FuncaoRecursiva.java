package Funcoes;
import java.util.Scanner;

public class FuncaoRecursiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o numero para soma recursiva");
		
		int numero = input.nextInt();
		
		int somaR = somaRecursiva(numero);
		
		System.out.println(somaR);
		
		
		System.out.println("Digite o numero para soma recursiva Dois");
		
		int numeroDois = input.nextInt();
		
		int somaRDois = somaRecursivaDois(numeroDois);
		
		System.out.println(somaRDois);
		
		
		input.close();

	}
	
	public static int somaRecursiva(int numero) {
		
		if(numero == 1) {
			return 1;
		}else {
			return numero + somaRecursiva(numero - 1);
		}
		
	}
	
	
	public static int somaRecursivaDois(int numeroDois) {
		
		if(numeroDois == 10) {
			return 10;
		}else {
			return numeroDois + somaRecursivaDois(numeroDois + 1);
		}
		
	}
	

}
