
package Queue;

public class UsingLL {
    private Node front;
    private Node rear;
    int size;
    
    public UsingLL(){
        front = null;
        rear = null;
        size = 0;
    }
    
    public int size(){
        return size;
    }
    
    public boolean isEmpty(){
        if(size() == 0){
            return true;
        }
        return false;
    }
    
    public int front(){
        if(size()==0){
            System.out.println("queue is empty");
        }
        return front.data;
    }
    
    public void enqueue(int ele){
        Node newNode = new Node(ele);
        if(rear == null){
            front = newNode;
            rear = newNode;
        }else{
        rear.next = newNode;
        rear = newNode;
        }
        size++;
        
    }
    
    public int dequeue(){
        if(size() == 0){
            System.out.println("queue is empty");
        }
        int temp = front.data;
        front = front.next;
        if(size == 1){
            rear = null;
        }
        size--;
        return temp;
    }
    
    
    public static void main(String args[]){
        UsingLL obj = new UsingLL();
        for(int i=1;i<8;i++){
            obj.enqueue(i);
        }
        System.out.println(obj.size());
        System.out.println(obj.isEmpty());
        System.out.println(obj.dequeue());
        System.out.println(obj.front());
    }
}
