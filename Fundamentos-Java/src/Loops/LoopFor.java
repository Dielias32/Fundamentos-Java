package Loops;

public class LoopFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		/*
		 * **Usa-se mais for quando já se sabe a quantidade de vezes necessarias para o loop**
		 * Variavel de inicializacao == i, j, k, etc...
		 * Condicao -> determina a'te quando ou quantas vezes, o loop vai rodar
		 * Incremento -> a variavel vai chegar na condicao
		 */
		
		// conta de 1 a 5
		for(int i = 1; i <=5; i++) {
			System.out.println("Contador " + i);
		}
		
		//contador de palavras
		String palavra = "Java";
		
		for(int i = 0; i < palavra.length(); i++) {
			
			System.out.println("Caracterer " + palavra.charAt(i));
		}
		
		
		//Contagem regreciva
		for(int i = 5; i > 0; i--) {
			System.out.println("Regreciva" + i);
		}

	}

}
