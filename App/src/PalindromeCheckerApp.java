
public class PalindromeCheckerApp {

    public static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            // Skip spaces on left
            if (str.charAt(left) == ' ') {
                left++;
                continue;
            }

            // Skip spaces on right
            if (str.charAt(right) == ' ') {
                right--;
                continue;
            }

            // Compare ignoring case
            if (Character.toLowerCase(str.charAt(left)) !=
                    Character.toLowerCase(str.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        if (isPalindrome(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
