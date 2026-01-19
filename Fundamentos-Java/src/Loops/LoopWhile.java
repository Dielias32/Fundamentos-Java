package Loops;

public class LoopWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		while (i <= 5) {

			i++;

			System.out.println("Contador While: " + i);
		}

		int valor = 0;

		while (valor != 7) {

			valor = (int) (Math.random() * 10);

			System.out.println(valor);
		}

		// *** Exemplo de loop infinito***
		// Condicioanis que nunca vao ser atendidas!!!

		/*
		 * while (true) { System.out.println("infinito"); }
		 * 
		 * for (int j = 0; j <= 5; j--) {
		 * 
		 * System.out.println(j); }
		 */

	}

}
