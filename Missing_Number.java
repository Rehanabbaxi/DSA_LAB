/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab03;


public class Missing_Number {
    public int missingNumber(int[] nums) {
        int n = nums.length ;
        int full_sum =  n *(n+1)/2;
        int i ;
        int actual_sum = 0 ; 
        for(i = 0 ; i < n ; i++){
            actual_sum +=nums[i];
        }
        int missing_number = full_sum - actual_sum;
        return missing_number;    
    }
    
    public static void main(String[] args) {
        
        Missing_Number obj = new Missing_Number();
        int[] test_nums = new int[]{9,6,4,2,3,5,7,0,1};
        int result = obj.missingNumber(test_nums);
        System.out.println("Missing Number in given array is " + result);
    }
    
}
