import java.util.Scanner;  // Import the Scanner class
public class New {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter something: ");
        String word = scan.next();// scan one token (one word)
        System.out.print(word);
    }
}
