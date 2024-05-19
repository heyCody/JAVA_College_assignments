package String;
import java.util.Scanner;
public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Split the string into words
        String[] words = input.split(" ");
        
        // Reverse each word
        for (int i = 0; i < words.length; i++) {
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }
        
        // Join the reversed words back into a string
        String reversedString = String.join(" ", words);
        
        // Display the reversed string
        System.out.println("Reversed String: " + reversedString);
        
        scanner.close();
    }
}
