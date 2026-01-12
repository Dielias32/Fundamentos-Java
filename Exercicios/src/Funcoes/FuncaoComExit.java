package Funcoes;

public class FuncaoComExit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

		
		acesso("admin", "1234");
		acesso("adm", "123");
		

	}
	
	/** 
	 *@author Elias
	 *
	 *@param usuario Aonde o usuario ira digitar seu usuario de acesso!
	 * 
	 * 
	 * 
	 */
	
	public static void acesso(String usuario, String senha) {
		
		if(!usuario.equals("admin") && !senha.equals("1234")) {
			
			System.out.println("autenticacao falhou");
			System.exit(1);
		}
		
		System.out.println("Acessou!!!!");
		
		
		

	}

}
