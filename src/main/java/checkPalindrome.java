/**
 * Created by anilkulkarni on 9/19/2017.
 */
public class checkPalindrome {
    public static void main(String[] args) {
        String s = "tattarrattat";
        int n = s.length();
        String flag = "Palindrome";
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != s.charAt(n - (i + 1))) {
                flag = "Not a Palindrome";
            }
        }
        System.out.println(flag);
    }
}
