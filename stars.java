public class stars {

	public static void main(String[] args) {
		stars star = new stars();
	//	star.first(10,5);
	//	star.second(10,5);
		star.third(10,5);
	//	star.fourthd(10,5);

	}
	
	/*void first(int row, int column) {
		for (int i=0; i<row; i++) {
		for (int j=0; j<column; j++){
			
		if (i==0 | i== row-1 ) {
			System.out.print("*"); 
			if  (j==column-1)
			System.out.println();
			}}}}
		
		void second(int row, int column) {
			for (int i=0; i<row; i++) {
			for (int j=0; j<column; j++){
				
			if (i==0 | i== row-1 ) {
				System.out.print("*"); 
				}
			else {
			 if (j==0| j==column-1)
				System.out.print("*"); 
			else
				System.out.print(" ");		
			}	
			}
				System.out.println();
			}	
	}
		*/
		void third(int row, int column) {
			for (int i=0; i<row; i++) {
			for (int j=0; j<column; j++){
				
			if (i==row-1 | i== 0 ) {
				System.out.print("*"); 
				}
			else {
			 if (j==0| j==column-1)
				System.out.print("*"); 
			else
				System.out.print(" ");		
			}	
			}
				System.out.println();
			}	
	}
		
	/*	void fourthd(int row, int column) {
			for (int i=0; i<row; i++) {
			for (int j=0; j<column; j++){
				
			if (i==0 | i== row-1 ) {
				System.out.print("*"); 
				System.out.println();
				}
			else {
			 if (j==0| j==column-1)
				System.out.print("*"); 
			else
				System.out.print(" ");		
			}	
			}
			//	System.out.println();
			}	
	}*/
}
