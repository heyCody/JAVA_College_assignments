package String;
import java.util.Scanner;

public class AbbreviateName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();
        
        String[] parts = fullName.split(" ");
        
        if (parts.length >= 2) {
           
            StringBuilder abbreviation = new StringBuilder();
            abbreviation.append(parts[0].charAt(0)).append(".");
            
            
            for (int i = 1; i < parts.length - 1; i++) {
                abbreviation.append(parts[i].charAt(0)).append(".");
            }
            
            abbreviation.append(parts[parts.length - 1]);
            
            System.out.println("Abbreviated name: " + abbreviation.toString());
        } else {
            System.out.println("Please enter a valid full name with at least two parts.");
        }
        
        scanner.close();
    }
}
