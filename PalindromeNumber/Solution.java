package PalindromeNumber;

// Source: https://leetcode.com/problems/palindrome-number/
// Author: Adam Coakley
// Date: 8th of July, 2022

/* 
Given an integer x, return true if x is palindrome integer.
An integer is a palindrome when it reads the same backward as forward.

Example:
121 is a palindrome, while 123 is not
*/

public class Solution {
    public boolean isPalindrome(int num){
        int reversedNum = 0, remainder = 0, originalNum = num;

        while(num > 0){
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        if(reversedNum == originalNum){
            return true;
        }
        return false;
    }
}
