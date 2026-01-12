package Funcoes;

public class EscoposJava {

	// escopo global'

	static int globalVar = 11;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int localVar = 10;
		
		if(true) {
			System.out.println(localVar);
		}
		
		
		
		if(true) {
			System.out.println(globalVar);
		}
		
		
		escopoLocal(2);
		
		//int soma = escopoLocalVar() + 1;
		
		int somaDois = escopoLocalDois() + 1;
		
		System.out.println(somaDois);

	}

	public static void escopoLocal(int a) {
		
		int escopoLocalVar = 1;
		
		
		
		System.out.println(globalVar);
	}
	
	
	public static int escopoLocalDois() {
		
		int escopoLocalVarDois = 1;
		return escopoLocalVarDois;
	
	}

}
