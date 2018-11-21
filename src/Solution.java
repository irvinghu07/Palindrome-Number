/**
 * Development IDE: IntelliJ IDEA
 * Author: irving
 * Project Name: Palindrome Number
 * Date: 2018-11-20
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else {
            int[] digits = new int[31];
            int digit = 0;
            while (x != 0) {
                digits[digit++] = x % 10;
                x /= 10;
            }
            int max_digit = digit-- / 2;
            for (int i = 0; i < max_digit; i++) {
                if (digits[i] != digits[digit - i]) {
                    return false;
                }
            }
            return true;
        }
    }
}
