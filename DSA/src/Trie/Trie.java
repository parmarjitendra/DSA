/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Trie;

class TrieNode{
    char data;
    boolean isTerminating;
    TrieNode children[];
    
    public TrieNode(char data){
        this.data = data;
        isTerminating = false;
        children = new TrieNode[26];
    }
}
public class Trie {
    
    private TrieNode root;
    
    public Trie(){
        root = new TrieNode('\0');
    }
    
    
    public void add(TrieNode root , String word){

    if(word.length() ==0 ){
        root. isTerminating = true;
        return;
    }

    int childIndex = word.charAt(0) - 'a' ;
    TrieNode child = root.children[childIndex];
    if(child == null) {
    child = new TrieNode(word.charAt(0));
    root.children[childIndex] = child;
    }
    add(child,word.substring(1));
    }
    public void add(String word){
            add(root, word); 
    }
}
