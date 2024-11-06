/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab04;


class Node {
    int data  ;
    Node address ;
    
    public Node(int data){
        this.data = data;
        this.address = null ;
    }
}

public class LinkedList{
    
    Node head , tail ;
    int size ;   
 
    public LinkedList(){
        
        head  = tail = null ;
        size =0;
    }
    
    public void add(int d ){
        Node n = new Node(d);
        if (head == null){
            head = tail = n;
        }
        else {
            tail.address = n;
            tail = n ;
            
        }
        size++;
    }
    
    public void printList() {
        Node current = head;  // Start from the head node
        while (current != null) {
            System.out.print(current.data + " ");  // Print the data of each node
            current = current.address;  // Move to the next node
        }  // Print a newline at the end
    }
    
    public static void main(String[] args) {
        LinkedList  list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        
        list.printList();
        
        
        System.out.println("");
        System.out.println(list.size);
    }
    
}

