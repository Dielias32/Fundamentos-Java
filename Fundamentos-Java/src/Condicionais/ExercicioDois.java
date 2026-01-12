package Condicionais;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o Usuario!");
		String usuario = input.next();
		
		System.out.println("Digite a Senha!");
		String senha = input.next();
		
		
		
		if(usuario.equals("admin") && senha.equals("1234")) {
			
			System.out.println("Acesso consedido!!");
		} else {
			
			System.out.println("Acesso Negado!!!!!!!!!");
		}
		
		
		input.close();
		
	}

}
