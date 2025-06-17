public class TestManagerStrings {

    /*
     * static void countDown() {
     * for (int index = 10; index > 0; index--) {
     * System.out.println(index);
     * }
     * }
     */

    static String removedFirstLast(String value) {
        String result = "";
        for (int index = 1; index < value.length() - 1; index++) {
            result = result + value.charAt(index);
        }
        return result;
    }

    static String reverseString(String value) {
        String result = "";
        for (int index = 0; index < value.length(); index++) {
            result = value.charAt(index) + result;
        }
        return result;
    }

    // OPTION 2
    static String reverseString2(String value) {
        String result = "";
        for (int index = value.length() - 1; index >= 0; index--) {
            result = result + value.charAt(index);
        }
        return result;
    }

    static String removedSpaces(String value) {
        String result = "";
        for (int index = 0; index < value.length(); index++) {
            if (value.charAt(index) == ' ') {
                continue;
            }
            result += value.charAt(index);
        }
        return result;
    }


    public static void main(String[] args) {
        String message = "Sentido común";
        /*
         * String reverse = reverseString(message);
         * System.out.println(reverse);
         */

        String reverse = reverseString2(message);
        System.out.println(reverse);

        // System.out.println(removedString(message));
        String noSpace = removedSpaces(message);
        System.out.println(noSpace);
       
    }
}
