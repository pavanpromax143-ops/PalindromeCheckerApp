import java.util.*;

public class PalindromeCheckerApp{
    public static void main(String[] args){
        System.out.println("Welcome to Palindrome Checker Mangement System");
        System.out.println("Version : 1.0");
        System.out.println("System Initialized Successfully.");


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert to lowercase and remove spaces for better checking
        String str = input.replaceAll("\\s+", "").toLowerCase();

        // Create Queue and Stack
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Step 1 & 2: Enqueue and Push characters
        for (int i = 0; i < str.length(); i++) {
            queue.add(str.charAt(i));   // enqueue
            stack.push(str.charAt(i));  // push
        }

        // Step 3: Compare dequeue vs pop
        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        // Result
        if (isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");

        sc.close();
    }
}