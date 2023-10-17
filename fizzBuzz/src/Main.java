import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game(  "Fizz", "Buzz");
    }

     static void Game(String fizz, String buzz) {
         Scanner scan = new Scanner(System.in);
         System.out.println("enter the number of players:");
         int players =scan.nextInt();
             for(int number=1; number<=players; number++){
                boolean numBy3 = (number%3==0);
                boolean numBy5 = (number%5==0);
                if (numBy3&&numBy5)
                {
                    System.out.println(fizz+buzz);
                }
                else if(numBy3 ) {
                    System.out.println(fizz);
                } else if (numBy5) {
                    System.out.println(buzz);
                }
                else System.out.println(number);
             }

         }
         }

