public class PalindromeCheckerApp {
    public static void main(String[]args){
        // Hardcoded string
        String str = "madam";

        // Reverse string
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        // Check palindrome
        if (str.equals(rev)) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is not a Palindrome");
        }


    }
}