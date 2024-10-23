/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

public class ArrayReversal {
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        
        System.out.println("Original Array:");
        printArray(array);

       
        reverseArray(array);

        System.out.println("Reversed Array:");
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
           
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
