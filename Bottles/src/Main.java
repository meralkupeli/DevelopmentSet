public class Main {
    public static void main(String[] args) {
        printSong("slime",3);
    }
       static void printSong(Object stuff, int n){
    String plural = (n==1)? "" : "s";
    loop: while(true) {
    System.out.println(n + " bootle" + plural + " of " + stuff + " on the wall,");
    System.out.println(n + " bootle" + plural + " of " + stuff + " ;");
    System.out.println("You take one down" + " and pass it around:");
    --n;
    plural = (n == 1) ? "" : "s";
    if (n == 0) break loop;
}
    System.out.println(" No bootles of"+plural+" of "+stuff+" on the wall!");
       }
        }

