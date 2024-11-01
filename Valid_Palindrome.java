///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */


package com.mycompany.lab03;

public class Valid_Palindrome {

    public boolean Solution(String s) {
        int start = 0; 
        int end = s.length() - 1; 
        
        while (start <= end) {
            char start_char = s.charAt(start);
            char end_char = s.charAt(end);
            
           
            if (!Character.isLetterOrDigit(start_char)) {
                start++;
            } 
         
            else if (!Character.isLetterOrDigit(end_char)) {
                end--;
            } 
           
            else {
                if (Character.toLowerCase(start_char) != Character.toLowerCase(end_char)) {
                    return false; 
                }
                start++;
                end--;
            }
        }
        return true;     
    }

    public static void main(String[] args) {
        Valid_Palindrome obj = new Valid_Palindrome();
        String test_str = "A man, a plan, a canal: Panama";
        boolean answer = obj.Solution(test_str);
        System.out.println("Given string is palindrome: " + answer);
    }
}
