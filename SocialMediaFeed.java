/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.socialmediafeed;

import  java.time.LocalDateTime ;
import  java.util.UUID ;
import java.util.*;

class Post{
    String user_text ;
    String Id;
    LocalDateTime  time_stampt;
    
//    Constructor for Post class
    public Post(String Text){
      user_text =   Text;
      Id = generate_Unique_Id();
      time_stampt = LocalDateTime.now();
    }
   
    private  String generate_Unique_Id() {
        return UUID.randomUUID().toString().replace("-", "").substring(0, 10);
    }
//    getter for user_text
    public String getuser_text(){
        return user_text;
    }
    
    public String getId(){
        return Id;
    }
    public LocalDateTime get_time_stampt(){
        return time_stampt;
    }
}

class feed{
        
   Node head , tail ;
   int size;
   
    class Node{
        Post data ;
        Node next ;
        Node Prev;

    //    constructor for Node

        public Node(Post Data){
            data = Data;
        }
    }
    
//    Method to check linkedlist (feed) is empty 
    public boolean isEmpty(){
        if(head == null && tail ==null){
            return true ;
        }
        return false ;
    }
    
    public void AddPost(String text_data){
        Post new_post = new Post(text_data);
        Node new_node = new Node(new_post);
        if(isEmpty()){
            head = tail = new_node;
            return;
        }
        new_node.Prev = tail;
        tail.next = new_node;
        tail = new_node;
    }
    
    public void deletePost(String Unique_Id){
        if(isEmpty()){
            System.out.println("Feed is already empty");
            return ;
        }
        Node current = head ;
        Node previous  = null;
        while (current != null){
            if(current.data.getId().equals(Unique_Id)){
                
                if(current == head){
                    head = head.next;
                    return;
                }
                else if(current == tail){
                    tail = previous;
                    tail.next = null;
                    return ;
                }
                else{
                previous.next = current.next;
                return ;
                }
            }
            else{
                previous = current ;
                current = current.next;
            }
        }        
    }
    
//    Method to search post 
    
    public void Searchpost(String User_text_to_find){
        if(isEmpty()){
            System.out.println("Your feed is empty");
            return;
        }
        
        Node current = head ;
        while(current != null){
            if(current.data.getuser_text().equals(User_text_to_find)){
                System.out.println("Here is your post "+current.data.user_text);
                return ;
            }
            current = current.next;    
        }
        System.out.println("couldnot found any post with text "+User_text_to_find);
    }
    
    public void displayAllPost(){
        if(isEmpty()){
            System.out.println("Feed is empty");
            return;
        }
        Node current = tail;
        do{
            System.out.println(current.data.getuser_text());
            current= current.Prev;
                    
        }
        while (current != null);
    }
    
    
    public void editPost(String Unique_Id , String User_Text ){
        if(isEmpty()){
            System.out.println("Feed is empty");
            return ;
        }
        Node current = head;
        while(current != null){
            if(current.data.getId().equals(Unique_Id)){
                current.data.user_text = User_Text;
                current.data.time_stampt  = LocalDateTime.now();
                return ; 
            }
            current = current.next;
        }
        
    }
}




public class SocialMediaFeed {

    public static void main(String[] args) {
        // Initialize the Feed
        feed feed_obj = new feed();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            
            System.out.println(" Social Media Feed Menu : ") ;
            System.out.println(" 1. Add Post") ;
            System.out.println(" 2. Edit Post ");
            System.out.println(" 3. Display All Posts (Latest First) ") ;
            System.out.println(" 4. Search Post by Text") ;
            System.out.println(" 5. Delete Post ") ;
            System.out.println("6. Exit") ;
            System.out.print("Choose an option: ");
            
            int Choice = scanner.nextInt(); 
            
            scanner.nextLine() ; 
            
            switch (Choice) {
                case 1:
                    
                    System.out.print("Enter the text for the new post: ") ;
                    String postText  =  scanner.nextLine() ;
                    feed_obj.AddPost(postText);
                    System.out.println("Post added successfully!\n") ;
                    break;
                
                case 2:
                    System.out.print("Enter the Post ID to edit: ") ;
                    String postIdToEdit = scanner.nextLine();
                    System.out.print("Enter the new text for the post: ");
                    String newPostText = scanner.nextLine();
                    feed_obj.editPost(postIdToEdit, newPostText);
                    break;
                
                case 3:
                    
                    feed_obj.displayAllPost();
                    break;
                
                case 4:
                    
                    System.out.print("Enter the text to search for: ") ;
                    String searchText = scanner.nextLine();
                    feed_obj.Searchpost(searchText);
                    break;
                
                case 5:
                    
                    System.out.print("Enter the Post ID to delete: ") ;
                    String postIdToDelete = scanner.nextLine() ;
                    feed_obj.deletePost(postIdToDelete);
                    break;
                
                case 6:
                    
                    System.out.println("Exiting the program...") ;
                    scanner.close() ;
                    System.exit(0) ;
                    break;
                
                default:
                    System.out.println("Invalid choice. Please try again.\n");
            }
        }
    }
}

