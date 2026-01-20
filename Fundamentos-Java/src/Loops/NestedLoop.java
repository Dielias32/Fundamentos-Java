package Loops;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i = 1; i <= 3; i++) {
			
			System.out.println("Loop Externo");
			
			for(int j = 1; j <=3; j++ ) {
				
				System.out.println(i + "x" + j + " é " + (i*j) );
			}
		}
		
		
		for(int l = 1; l <= 5; l++) {
			
			System.out.println("fora");
			
			for(int n = 1; n <= l; n++) {
				System.out.print("*");
			}
			
			
			System.out.println();
		}
	}

}
