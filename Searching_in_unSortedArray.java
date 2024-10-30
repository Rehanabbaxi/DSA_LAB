/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab03;

public class Searching_in_unusortedArray {

    static int findElement(int arr[] , int n , int key ){
        
        for (int i = 0 ; i < n; i ++){
            if(arr[i] == key){
                return i ;
            }        
        }
        return -1;
    }
    
    public static void main(String[] args) {
        
        int arr[] = new int[]{12,13,40,60};
        int n = arr.length;
        int key = 40;
        int position = findElement(arr, n , key);
        
        if (position == -1)
            System.out.println("Elemnet not found ");
        else 
            System.out.println("Elemnt found " + position );
    }
}
