import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.println("enter a world!");
        String word2 = word.nextLine();
        wordBreak(word2);
    }
    static void wordBreak(String word2)
    { for(int i = 0; true; i++) {
        loop :
        {
            System.out.print(word2.charAt(i) + "*");
        }
    }
    }
}