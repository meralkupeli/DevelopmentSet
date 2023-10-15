package DevelopmentSet;

import java.util.Scanner;

public class FibonacciWithStackOverFlow {

	public static void main(String[] args) {
		Scanner num = new Scanner (System.in);
		int num1=0, num2=1, num3;
		int number =num.nextInt();
		System.out.println(" "+num1+"\n "+num2);
for(int i=2; i<number;i++) {
	num3=num1+num2;
	System.out.println(" "+num3);
	num1=num2;
	num2=num3;	
}
System.out.println();
	}

}
