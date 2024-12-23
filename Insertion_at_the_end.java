/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab03;

/**
 *
 * @author Nasir
 */
public class Insertion_at_the_end {
    
    static int insertEnd(int arr[], int n, int key, int capacity)
    {
        if(n >= capacity)
        return n;
        arr[n] = key;
        return (n + 1);
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[20];
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;
        int capacity = 20;
        int n = 6;
        int i, key = 26;
        System.out.println("Before Insertion: ");
        for(i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        n = insertEnd(arr, n, key, capacity);
        System.out.print("\nAfter Insertion: ");
        for(i = 0; i < n; i++)
            System.out.print(arr[i]+ " ");
    }
}
