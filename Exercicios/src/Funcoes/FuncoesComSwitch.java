package Funcoes;



public class FuncoesComSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		diaSemana(1);
		
		String dia = diaSemana(1);
		System.out.println(dia);
		
		
		System.out.println(diaSemana(10));

		
		
	}

	public static String diaSemana(int dia) {
			
		switch(dia){
			
			case 1:
			return "Domingo";
			case 2:
			return "segunda";
			case 3:
			return "terca";
			case 4:
			return "quarta";
			case 5:
			return "quinta";
			case 6:
			return "sexta";
			case 7:
			return "sabado";
			
			default:
				return "Invalido";
		}
		
	}

}
