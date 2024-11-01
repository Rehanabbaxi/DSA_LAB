/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab03;
import java.util.Arrays;

public class Second_Max_Value_In_An_Array {
   
    public int Solution(int[] array){
        int n = array.length;
        for(int i = 0 ; i < n ; i++){
            for(int j = i +1 ; j < n ; j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[i] = temp;
                }
            }
        }
        return array[n-2];
    }
    
    public static void main(String[] args) {
        
        // instantiating class 
        Second_Max_Value_In_An_Array obj = new Second_Max_Value_In_An_Array();
        
        // initializing array 
        int[] test_array = {1 , 2 , 5 , 6 , 8};
        
        // calling function 
        int second_Max = obj.Solution(test_array);
        
        System.out.println("Array :  "+Arrays.toString(test_array));
        System.out.println("Second Max number is " + second_Max );
    }
}


