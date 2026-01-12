package Funcoes;

public class FuncoesComComdicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		verificarAcesso("admin", "1234", true);
		String acessoUm = verificarAcesso("admin", "1234", true);
		
		System.out.println(acessoUm);
		
		verificarAcesso("admin", "1234", true);
		String acessoDois = verificarAcesso("admin", "1234", false);
		
		System.out.println(acessoDois);
		
		verificarAcesso("admin", "1234", true);
		String acessoTres = verificarAcesso("admin", "4", true);
		
		System.out.println(acessoTres);
		
		

	}
	
	
	
	public static String verificarAcesso(String usuario, String senha, boolean ativo) {
		
		if(!ativo) {
			return "Usuario inativo";
		}
		
		if(usuario.equals("admin") && senha.equals("1234")) {
			
			return "Pode acessar";
		}else {
			return "Acesso negado";
		}
		
	}

}
