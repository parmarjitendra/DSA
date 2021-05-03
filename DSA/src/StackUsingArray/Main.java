
package StackUsingArray;

public class Main {
    public static void main(String args[]){
        UsingArray obj = new UsingArray();
       obj.push(10);
       obj.push(15);
       obj.push(19);
       obj.push(17);
        obj.isEmpty();
        System.out.println(obj.size());
        System.out.println(obj.top());
    }
}
