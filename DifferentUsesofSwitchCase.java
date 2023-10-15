package DevelopmentSet;

import java.util.Scanner;

public class DifferentUsesofSwitchCase {

	public static void main(String[] args) {
		DifferentUsesofSwitchCase demo = new DifferentUsesofSwitchCase();
    	
    	System.out.println("A number :");
		Scanner stdin = new Scanner(System.in);
		int month = stdin.nextInt();
		
		demo.switchDemo1(month);
		demo.switchDemo2(month);
		demo.switchDemo3(month);
	}
	 public void switchDemo1(int month) {

//		  final int i = 4;
//		  final int i = returnConstant(); // That does'nt work because it is not a constant expression
		 final int i = returnConstant();
       switch (month) {
          /* case 1:  System.out.println("January"); break;
           case 2:  System.out.println("February"); break;
           case 3:  System.out.println("March"); break;
           case 4:  System.out.println("April"); break;
           case 5:  System.out.println("May"); break;
           case 6:  System.out.println("June"); break;
           case 7:  System.out.println("July"); break;
           case 8:  System.out.println("August"); break;
           case 9:  System.out.println("September"); break;
           case 10: System.out.println("October"); break;
           case 11: System.out.println("November"); break;
           case 12: System.out.println("December"); break;
           default: System.out.println("Error! Please enter the month number between 1 and 12"); break;
       */
       
       //we used "->" instead of "break;"
           case 1 -> System.out.println("January");
           case 2 -> System.out.println("February"); 
           case 3 -> System.out.println("March"); 
           case 4 -> System.out.println("April"); 
           case 5 -> System.out.println("May");
           case 6 -> System.out.println("June");
           case 7 ->  System.out.println("July");
           case 8 ->  System.out.println("August");
           case 9 ->  System.out.println("September");
           case 10 -> System.out.println("October");
           case 11 -> System.out.println("November");
           case 12 -> System.out.println("December"); 
           default -> System.out.println("Error! Please enter the month number between 1 and 12");
       }
   }
      
   public void switchDemo2(int month) {
       switch (month) {
       case 12: 
       case 1:  
       case 2:  System.out.println("Winter"); break;
       
       case 3:  
       case 4:  
       case 5:  System.out.println("Spring"); break;
       
       case 6:  
       case 7:  
       case 8:  System.out.println("Summer"); break;
       
       case 9: 
       case 10:
       case 11: System.out.println("Fall"); break;
       
       default: System.out.println("Error! Please enter the month number between 1 and 12"); break;
       }
   }
       
       /**
        * Valid after Java 14
        * @param month
        */
       public void switchDemo3(int month) {
          switch (month) {
           case 12, 1, 2: System.out.println("Winter"); break;
           case 3, 4, 5:  System.out.println("Spring"); break;
           case 6, 7, 8:  System.out.println("Summer"); break;
           case 9, 10, 11: System.out.println("Fall"); break;
           default: System.out.println("Error! Please enter the month number between 1 and 12"); break;
       
       // we used "yield" to "break;"
       // important!! u must use to java 14 and after
    	  /* switch (month) {
           case 12, 1, 2 : yield System.out.println("Winter");
           case 3, 4, 5: yield System.out.println("Spring");
           case 6, 7, 8: yield  System.out.println("Summer");
           case 9, 10, 11: yield  System.out.println("Fall");
           default: yield  System.out.println("Error! Please enter the month number between 1 and 12");
           */
       }
  }
   
   static void f() {
   	f();
   }
   
   private static int returnConstant() {
   	return 5;
   }
}
