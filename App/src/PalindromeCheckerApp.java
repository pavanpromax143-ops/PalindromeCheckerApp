
public  class PalindromeCheckerApp{

    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
        }
    }

    static Node left; // Pointer to move from start

    public static boolean isPalindrome(Node head) {
        left = head;
        return checkPalindrome(head);
    }

    private static boolean checkPalindrome(Node right) {
        if (right == null) {
            return true;
        }

        // Recursively go to end
        boolean isPal = checkPalindrome(right.next);
        if (!isPal) {
            return false;
        }

        // Compare left and right
        if (left.data != right.data) {
            return false;
        }

        // Move left pointer forward
        left = left.next;

        return true;
    }

    // Helper method to append nodes
    public static Node append(Node head, char data) {
        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        Node head = null;
        String input = "madam";

        for (char ch : input.toCharArray()) {
            head = append(head, ch);
        }

        if (isPalindrome(head)) {
            System.out.println("madam is a palindrome.");
        } else {
            System.out.println("madam List is not a palindrome.");
        }
    }
}
