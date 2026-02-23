public class PalindromeCheckerApp {
    public static void main(String[]args){
        System.out.println("Welcome to Palindrome Checker Mangement System");
        System.out.println("Version : 1.0");
        System.out.println("System Initialized Successfully.");



        String input = "radar";
        char[] chars = input.toCharArray();
        int start = 0;

        int end = chars.length - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Print result
        if (isPalindrome)
            System.out.println(input + " is a Palindrome");
        else
            System.out.println(input + " is NOT a Palindrome");



    }
}