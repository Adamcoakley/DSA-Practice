package TwoSum;

// Source: https://leetcode.com/problems/two-sum/
// Author: Adam Coakley
// Date: 8th of July, 2022

/* 
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example 1: 
            nums = [3,2,4], target = 6 
            returns [1,2]
*/

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = 1; j < nums.length; j++){
                if(nums[i]+nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
}