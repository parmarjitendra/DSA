package StackUsingArray;
public class UsingArray {
    private int data[];
    private int top;
    
    
public UsingArray(){
    data = new int[10];
    top = -1;
    
}

public void isEmpty(){
    if(top == -1){
        System.out.println("Empty");
    }
    else{
        System.out.println("Not Empty");
    }
}

public int size(){
    return top+1;
}

public int top(){
    if(size() == 0){
        System.out.println("top can't find bcz stack is empty");
    }
    return data[top];
}
public void push(int elem){
    if(size()==data.length){
        System.out.println("top can't push");
    }
    top++;
    data[top] = elem;
}
public int pop(){
    if(size()== 0){
        System.out.println("top can't pop");
    }
    int tem = data[top];
    top--;
    return tem;
}
}

