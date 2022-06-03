package SeleniumGrid;

public class JavaPatternProgram {

	public static void main(String[] args) {

		System.out.println("Pattern Practice 1 : ");
		for(int i=0 ; i<=5 ; i++) {
			
			for(int j = 0; j<=i ; j++) {
						
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		
		System.out.println("----------------------------------------------------");
		
	
		
		for(int i=0 ; i<=5 ; i++ ) {
			for(int j = 5 ; j >=i ;j--) {
				System.out.print("*");
			}
			System.out.println(" ");
			
		}
		
		System.out.println("----------------------------------------------------------");
		
		for(int i = 0 ; i<=5 ; i++) {
			for(int j = 0 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		for(int k = 0 ; k<=4 ; k++) {
			for(int l = 4 ; l>=k ; l-- ) {
				
				System.out.print("*");
			}
			System.out.println(" ");
				
		}
		
		System.out.println("----------------------------------------------------------");
		
		
		
		for(int i = 1 ; i<= 4 ; i++) {
			for(int j= 3 ; j >=i ; j--) {
				System.out.print(" ");
			}
		
		for(int k = 1; k<= i ; k++) {
		  
			System.out.print("*");	
		
		}
		
		System.out.println(" ");
		 
		}
		
		System.out.println("-------------------------------------------------------");
		
	}
	
	

}
