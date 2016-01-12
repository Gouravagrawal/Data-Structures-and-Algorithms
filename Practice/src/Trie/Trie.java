package Trie;

import java.util.HashMap;
import java.util.Map;

/*Refer this in case of understanding
 * http://www.programcreek.com/2014/05/leetcode-implement-trie-prefix-tree-java/
 */

public class Trie {

	  private Node root;
	  
	    public Trie() {
	    	Node n=new Node();
	        root = n;
	    }
	
	private class Node{
		
		 char c;
		    HashMap<Character, Node> children = new HashMap<Character, Node>();
		    boolean isLeaf;
		 
		    public Node() {}
		 
		    public Node(char c){
		        this.c = c;
		    }
	}
	
	
	public void insert(String word){
		
		 HashMap<Character,Node> children = root.children;
		 
	        for(int i=0; i<word.length(); i++){
	            char c = word.charAt(i);
	 
	           Node t;
	            if(children.containsKey(c)){
	                    t = children.get(c);
	            }else{
	                t = new Node(c);
	                children.put(c, t);
	            }
	 
	            children = t.children;
	 
	            //set leaf node
	            if(i==word.length()-1)
	                t.isLeaf = true;    
	        }
	        
	        System.out.println("String is inserted successfuly");
	}
	
	
	public Node searchTrie(String str){
        Map<Character,Node> children = root.children; 
       Node t = null;
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(children.containsKey(c)){
                t = children.get(c);
                children = t.children;
            }else{
                return null;
            }
            
        }
 
        return t;
    }
	
	   public boolean search(String word) {
	       Node t = searchTrie(word);
	 
	        if(t != null && t.isLeaf) {
	        	
	        	System.out.println("The trie is travesred succefully");
	            return true;
	        }
	        else
	        	System.out.println("The trie does not have the string given");
	            return false;
	    }
	 
	public static void main (String args[]){
		
		Trie trie=new Trie();		
		trie.insert("Gourav");
		trie.search("Gourav");
		
	}
	
}
