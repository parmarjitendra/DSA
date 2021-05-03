/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StackUsingLL;

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String args[]){
        Stack obj = new Stack(6);
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.push(6);
        
        System.out.println(obj.isEmpty());
        System.out.println(obj.size());
       System.out.println(obj.top());
    }
    
}
