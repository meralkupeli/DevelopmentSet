import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Count(3,5,8, 2);
    }
        static void Count(int a, int b, int c, int x)
        {
            System.out.println((int) (a*(Math.pow(x,2))+(b*x)+c));
    }
}