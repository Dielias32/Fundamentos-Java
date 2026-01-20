package Loops;

public class BreakLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i <=10; i++) {
			
			System.out.println("Valor de i é: " + i);
			
			if(i == 5) {
				
				System.out.println("Paramos no " + i);
				break; 
			}
		}

	}

}
