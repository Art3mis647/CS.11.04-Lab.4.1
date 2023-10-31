import java.util.Stack;
public class Main {

    public static boolean parenthesesCheck(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                if (count == 0) {
                    return false;
                }
                count--;
            }
        }
        return count == 0;
    }


    public static String reverseInteger(int n){
        String str = Integer.toString(n);
        StringBuilder reversed = new StringBuilder(str);
        reversed.reverse();
        return reversed.toString();
    }


    public static String encryptThis(String str) {
        String[] words = str.split(" ");
        String returnString = "";
        for (String word : words) {
            int first = word.charAt(0);
            char[] chars = word.toCharArray();
            if (chars.length > 1) {
                char temp = chars[1];
                chars[1] = chars[chars.length - 1];
                chars[chars.length - 1] = temp;
            }
            String charsbutString = new String(chars).substring(1);
            String encryptedWord = first + charsbutString;
            returnString += (encryptedWord)+" ";
        }
        return returnString.trim();
    }



    public static String decipherThis(String str) {
        String[] words = str.split(" ");
        String returnString = "";
        for (String word : words) {
            int temp = 0;
            for (int i = 0; i < word.length(); i++) {
                if (!Character.isDigit(word.charAt(i))) {
                    temp = i;
                    break;
                }
            }
            int firstCharCode = Integer.parseInt(word.substring(0,temp));
            char[] charArray = word.substring(temp).toCharArray();
            if (charArray.length > 1) {
                char temp2 = charArray[0];
                charArray[0] = charArray[charArray.length - 1];
                charArray[charArray.length - 1] = temp2;
            }

            String decipheredWord = (char) firstCharCode + new String(charArray);
            returnString += decipheredWord + " ";
        }
        return returnString.trim();
    }


}