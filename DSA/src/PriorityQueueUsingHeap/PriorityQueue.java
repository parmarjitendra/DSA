
package PriorityQueueUsingHeap;

import java.util.ArrayList; 

// here I am working on MinHeap

public class PriorityQueue {
    private ArrayList<Integer> heap;
    
    public PriorityQueue(){
        heap = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        return heap.size()==0;
    }
    
    int size(){
        return heap.size();
    }
    
    int getMin(){
        if(isEmpty()){
            System.out.println("heap is empty can't get Min");
        }
        return heap.get(0);
    }
    
    void insert(int element){
        heap.add(element);
        int childindex = heap.size()-1;
        int parentindex = (childindex - 1)/2;
        
        while(childindex>0){
            if(heap.get(childindex) < heap.get(parentindex)){
                int temp = heap.get(childindex);
                heap.set(childindex, heap.get(parentindex));
                heap.set(parentindex,temp);
                parentindex = (childindex - 1)/2;
            }
            else{
                return;
            }
        }
    }
    int removeMin(){
        if(isEmpty()){
            System.out.println("heap is empty can't remove Min");
        }
        int temp = heap.get(0);
        heap.set(0,heap.get(heap.size()-1));
        heap.remove(heap.size()-1);
        int index = 0;
        int minIndex = index;
        int leftChildIndex = 1;
        int rightChildIndex =2;
        
        
        while(leftChildIndex <heap.size()){
            
        if(heap.get(leftChildIndex) < heap.get(minIndex)){
            minIndex = leftChildIndex;
        }
        
         if(heap.get(rightChildIndex) < heap.get(minIndex)){
            minIndex = rightChildIndex;
        }
         if(minIndex == index){
             break;
         }
         else{
             int temp1 = heap.get(index);
             heap.set(index, heap.get(minIndex));
             heap.set(minIndex,temp1);
             leftChildIndex = 2*index + 1;
             rightChildIndex = 2 * index +2;
         }
         
                
    }
        return temp;
    }
    
}
