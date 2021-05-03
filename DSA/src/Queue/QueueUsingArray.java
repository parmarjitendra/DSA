
package Queue;

public class QueueUsingArray {
    int data[];
    int front;
    int rear;
    int size;
    
    public QueueUsingArray(){
        data = new int[10];
        front = -1;
        rear = -1;
        size=0;
}
    
    public QueueUsingArray(int capacity){
        data = new int[capacity];
        front = -1;
        rear=-1;
        size=0;
    }
    
    public int size(){
        return size;
    }
    
    public boolean isEmpty(){
        if(size()==0){
            return true;
        }
        return false;
    }
    
    public int front(){
        if(size()==0)
            System.out.println("we can't find front because queue size is zero");
    
        return data[front];
    }
    
    public void enqueue(int ele){
        if(size() == data.length){
            System.out.println("Queue is full can't enqueue");
        }
        if(size()==0){
            front = 0;
        }
        size++;
        rear++;
        if(rear == data.length){
            rear = 0;
        }
        data[rear] = ele;
    }
    public int dequeue(){
        if(size()==0){
            System.out.println("Can't dequeue because size is 0");
        }
        int temp = data[front];
        front++;
        if(front == data.length){
            front = 0;
        }
        size--;
        if(size() == 0){
            front = -1;
            rear = -1;
        }
        return temp;
    }
    
    
    public static void main(String args[]){
        QueueUsingArray obj = new QueueUsingArray();
        for(int i=1;i<=10;i++){
               obj.enqueue(i);
        }
        System.out.println(obj.size);
        System.out.println(obj.dequeue());
        System.out.println(obj.isEmpty());
    }
}
