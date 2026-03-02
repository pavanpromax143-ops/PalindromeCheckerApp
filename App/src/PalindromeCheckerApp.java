
import java.util.Scanner;
import java.util.Stack;

// PalindromeChecker class encapsulates palindrome logic
class PalindromeChecker {

    // Public method to check palindrome
    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }

        // Normalize string: remove non-alphanumeric & convert to lowercase
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (int i = 0; i < cleaned.length(); i++) {
            stack.push(cleaned.charAt(i));
        }

        // Compare original and reversed (using stack)
        for (int i = 0; i < cleaned.length(); i++) {
            if (cleaned.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Main Application Class
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PalindromeChecker checker = new PalindromeChecker();

        System.out.println("=== Palindrome Checker App (UC11 - OOPS) ===");
        System.out.print("Enter a string to check: ");

        String input = scanner.nextLine();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("Result: The given string IS a palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a palindrome.");
        }

        scanner.close();
    }
}

