package Funcoes;
import java .util.Scanner;

public class RetornoDeFuncoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		dobrar(4);
		int valor = dobrar(4);
		System.out.println(valor);
		
		System.out.println(dobrar(10));
		
		System.out.println("Digite um numero");
		int numero = input.nextInt();
		
		dobrar(numero);
		int valorD = dobrar(numero);
		System.out.println("o dobro de " + numero + " é: " + valorD);
		
		
		/*
		 *  ***Funcoes com retornto x sem retorno***
		 *  	
		 *  Com retorno;
		 *  	Se usa quando precisa que o resultado seja usado em outra parte do codigo;
		 *			EX: validacoes(Senha, email, etc...),logoff, calculos, operacoes, operacoes para outros funcoes, etc...!
		 *
		 *
		 *  Sem retorno;
		 * 		Usado para exibir mensagens e pode ser usado para atualizar variaveis!  
		 */
		
		
	}
	
	public static int dobrar(int n) {
		
		return n * 2;
	}

}
