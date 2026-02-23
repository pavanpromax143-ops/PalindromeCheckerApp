import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static boolean isPalindrome(String str) {
        // Optional: remove spaces and make lowercase
        str = str.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Add characters to both stack and queue
        for (char ch : str.toCharArray()) {
            stack.push(ch);
            queue.add(ch);
        }

        // Compare elements
        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.remove())) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "civic";

        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}