package Funcoes;
import java.util.Scanner;

public class EmcapsulamentoDeReturnVariaveis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero = input.nextInt();
		
		verificarPar(numero);
		
		String resultado = verificarPar(numero);
		System.out.println(resultado);
		
		
		String somarD = verificarPar(somar(1, 3));
		System.out.println(somarD);
		
		
		input.close();

	}
	
	
	public static String verificarPar(int valor) {
		
		if(valor % 2 == 0) {
			
			return "O " + valor + " é par!";
		}else {
			
			return "O " + valor + " é impar!";
		}
	}
	
	
	public static int somar(int a, int b) {
		
		return a + b;
	}

}
