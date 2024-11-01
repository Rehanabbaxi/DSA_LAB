/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab03;
import java.util.Arrays;

public class Minimum_Number_In_Array {
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
        return array[0];
    }
    
    public static void main(String[] args) {
        
        // instantiating class 
        Minimum_Number_In_Array obj = new Minimum_Number_In_Array();
        
        // initializing array 
        int[] test_array = {1 , 2 , 5 , 6 , 8};
        
        // calling function 
        int min_Num = obj.Solution(test_array);
        
        System.out.println("Array :  "+Arrays.toString(test_array));
        System.out.println("Smallest  number in array is " + min_Num );
    }    
}
