public class Palindrome {

    static boolean isPalindrome(String value) {
        String textInitial = value.toLowerCase();
        String textRemovedSpace = TestManagerStrings.removedSpaces(textInitial);
        String reverseText = TestManagerStrings.reverseString(textRemovedSpace);
        return textRemovedSpace.equals(reverseText);
    }

    static void showPalindromeInfo(String text) {
        String message = isPalindrome(text)
                ? " es Palíndromo"
                : " NO es Palíndromo";
        message = "\"" + text + "\"" + message;
        System.out.println(message);
    }


    public static void main(String[] args) {
        String text = "Oso baboso";
        String textBad = "Atar al raton";
        showPalindromeInfo(text);
        showPalindromeInfo(textBad);
    }
}
