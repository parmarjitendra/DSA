
package LinkedList;
import java.util.Scanner;
public class LinkedListUse {
   
        
    public static Node takeInput(){
        Node head = null;
        Node tail = null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        
        while(data != -1){
            Node newnode = new Node(data);
            if(head == null){
                head = newnode;
                tail = newnode;
            }
            else{
                tail.next = newnode;
                tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head;
    }
    
    
    public static Node insertNode(Node head,int data,int pos){
        Node newNode = new Node(data);
        if(pos == 0){
            newNode.next = head;
            return newNode;
        }
        int i = 0;
        Node tem = head;
        while(i < pos-1){
            tem = tem.next;
            i++;
        }
        newNode.next = tem.next;
        tem.next = newNode;
        return head;
    }
    public static Node delNode(Node head,int pos){
        if(pos == 0){
            Node tem = head;
            head = head.next;
            return tem;
        }
        else{
            int i = 0;
            Node tem = head;
            while(i < pos-1){
                tem = tem.next;
                i++;
            }
           tem.next = tem.next.next;
        }
        return head;
    }
   
    
 
    
    
    public static void display(Node head){
    while(head != null){
    System.out.print(head.data + " ");
    head = head.next;
    }
    }
        
        
        
       
    public static void main(String args[]){

//    Node node1 = new Node(10);
//    Node node2 = new Node(20);
//    Node node3 = new Node(30);
//    node1.next = node2;
//    node2.next = node3;
//    Node head = node1;
      Node head = takeInput();
      //head = insertNode(head,80,0);
      //display(head);
      //delNode(head,2);
    
      display(head);
      
    
    
    
}
}
