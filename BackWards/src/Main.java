import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("pls. enter a number");
        int number = num.nextInt();
        backWards(number);

    }
    static void backWards(int number)
    {
while(number>0)
{
    System.out.print(number%10);
    //number /= 10; This line subtracts the last digit of
    // the number variable and divides the number by 10.
    // That is, it gets rid of its last digit and prepares
    // to obtain the previous digit in the next operation.
    number/=10;
}
    }
}