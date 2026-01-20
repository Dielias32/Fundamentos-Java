package Loops;

public class ContinueLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		for(int i = 10; i > 0; i--) {
			
			System.out.println("teste");
			
			if(i % 2 == 0) {
				
				System.out.println(i + " é Par!");
				continue;
			}
		System.out.println("Contador: " + i);
		}

	}

}
