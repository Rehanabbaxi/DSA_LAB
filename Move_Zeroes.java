/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab03;
import java.util.Arrays;

public class Move_Zeroes {
    
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        while(right < n){
            if(nums[right]!=0){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
            right++;
        }
    }
    
    public static void main(String[] args) {
        Move_Zeroes obj = new Move_Zeroes();
        int[] test_array = new int[]{0,1,0,3,12};
        obj.moveZeroes(test_array);
        System.out.println(Arrays.toString(test_array));
        
    }
}


