/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StackUsingLL;
public class Stack {
       private Node head;
        private int size;
    
    public Stack(int size){
        head = null;
        size = 0;
    }
    
    public int size(){
        return size;
    }
    
    public boolean isEmpty(){
        if(size() == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public int top(){
        if(size() == 0)
        {
            System.out.println("stack size is zero");
        }
        return head.data;
    }
    
    public void push(int ele){
        Node newNode = new Node(ele);
        newNode.next = head;
        head = newNode;
        size++;
    }
    
    public int pop(){
        if(size()==0){
            System.out.println("stack is empty");
        }
        
        int temp = head.data;
        head = head.next;
        size--;
       return temp; 
    }
    
}
