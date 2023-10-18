import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int num = scan.nextInt();
        int loops=0;
        for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    loops++;
            }
        }
        if (loops==0)
            System.out.println(num+" asal");
        else System.out.println(num+" asal değil");
    }
}