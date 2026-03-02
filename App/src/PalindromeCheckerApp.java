
import java.util.*;

// Step 1: Define Strategy Interface
interface PalindromeStrategy {
    boolean isPalindrome(String input);
}

// Step 2: Stack Strategy Implementation
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        // Compare by popping
        for (char ch : input.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Step 2: Deque Strategy Implementation
class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : input.toCharArray()) {
            deque.add(ch);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}

// Context Class
class PalindromeChecker {

    private PalindromeStrategy strategy;

    public PalindromeChecker(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean checkPalindrome(String input) {
        return strategy.isPalindrome(input);
    }
}

// Main Class
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        System.out.println("Choose Strategy:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");

        int choice = scanner.nextInt();

        PalindromeStrategy strategy;

        if (choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        PalindromeChecker checker = new PalindromeChecker(strategy);

        if (checker.checkPalindrome(input)) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}


