package Funcoes;

public class PrimeiraFuncao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		saudacao();
		soma(1, 2);
		soma(-10, 5);
		saudar("Elias");
		dobrar(4);
		int numero = 20;
		dobrar(numero);
		int dobra = dobrar(numero);
		System.out.println(numero);
		
		System.out.println(proximo(0));
	}
	
	public static void saudacao(){
		System.out.println("Primeira");
	}
	
	
	public static void soma(int num1, int num2) {
		
		int resultado = num1 + num2;
		System.out.println("A soma é: " + resultado);
	}
	
	
	
	
	
	public static void saudar(String nome) {
		
		System.out.println("Ola " + nome + " tudo bem?");
	}
	
	
	public static int dobrar(int n) {
		
		return n * 2;
		
	}
	
	public static int proximo(int valor) {
		
		int aux = valor++;
				if (valor == 0) {
					
					return 1;
				}
				
		while (true) {
			if (aux > valor) {
				aux ++;
			}
			return aux;
		}
		
		
	}

	
}
