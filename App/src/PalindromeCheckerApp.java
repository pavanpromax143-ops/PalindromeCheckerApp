import java.util.*;

public class PalindromeCheckerApp{

    // Reverse Method
    public static boolean reverseMethod(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    // Stack Method
    public static boolean stackMethod(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : input.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // Two Pointer Method
    public static boolean twoPointerMethod(String input) {
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Reverse Method Timing
        long start1 = System.nanoTime();
        boolean result1 = reverseMethod(input);
        long time1 = System.nanoTime() - start1;

        // Stack Method Timing
        long start2 = System.nanoTime();
        boolean result2 = stackMethod(input);
        long time2 = System.nanoTime() - start2;

        // Two Pointer Method Timing
        long start3 = System.nanoTime();
        boolean result3 = twoPointerMethod(input);
        long time3 = System.nanoTime() - start3;

        // Final Palindrome Check (all should match)
        boolean finalResult = result1 && result2 && result3;

        System.out.println("\nIs Palindrome? : " + finalResult);

        System.out.println("\n--- Performance Comparison ---");
        System.out.println("Reverse Method      : " + time1 + " ns");
        System.out.println("Stack Method        : " + time2 + " ns");
        System.out.println("Two Pointer Method  : " + time3 + " ns");

        scanner.close();
    }
}



