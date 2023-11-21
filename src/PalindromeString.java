import java.util.Locale;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "ashish";
        boolean isPalindrome = isPalindrome(str);
        System.out.println(str+" is palindrome ? "+isPalindrome);
    }

    private static boolean isPalindrome(String str) {
        String word = str.toLowerCase();
        char[] wordArr = word.toCharArray();
        int start = 0;
        int end = word.length() -1;
        while (start < end){
            if(wordArr[start] != wordArr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
