package linkedList;

import java.util.Scanner;

public class DoublyLinkedList_GlobalDeclaration {
    
    private class Node
    {
        int data;
        Node previous, next;
    }
    
    private Node first = null;
    private Node last = null;
    
    
    public void create()
    {
        int i, n;
         Node newNode, p;
        
        
             newNode = new Node();
           //  newNode.data = data;
             
             if(first==null)
             {
                 newNode.previous = newNode.next = null;
                 first = last = newNode;
                 
             }
             else
             {
                 newNode.next = null;
                 newNode.previous = last;
                 last.next = newNode;
                 last = newNode;
             }
    }  
         
    
    
    void insertAfter(int input, int k)
    {
        Node pNode, p;
        
        pNode =new Node();
       
        p = first;
        
        while(p!=null)
        {
            if(p.data==k)
                break;
            p = p.next;
        }
        
        if(p==null)
            System.out.println("Required node not found");
        else
        {
            pNode.data = input;
            
            if(p==last)
            {
                pNode.next = null;
                pNode.previous = last;
                last.next = pNode;
                last = pNode;
            }
            else
            {
                pNode.next = p.next;
                pNode.previous = p;
                p.next.previous = pNode;
                p.next = pNode;
            }
        }
    }
    
    void insertBefore(int input, int k)
    {
        Node pNode, p;
        pNode = new Node();
        
        
        p = first;
        
       while(p!=null)
       {
           if(p.data==k)
               break;
           p = p.next;
       }
       
       if(p==null)
       {
           System.out.println("Required node not found");
           return;
       }
       
       else
       {
           pNode.data = input;
           
           if(p==first)
           {
               pNode.previous = null;
               p.previous = pNode;
               pNode.next = p;
               first = pNode;
           }
           else
           {
               pNode.previous = p.previous;
               pNode.next = p;
              
               p.previous.next = pNode;
               p.previous = pNode;
               
           }
       }
       
    }
    
    
    void traverseRight()
    {
        Node p;
        
        if(first==null)
        {
            System.out.println("Linked List Empty");
            
        }
        else
        {
            System.out.println("Linked List is shown");
            p=first;
            while(p!=null)
            {
                System.out.println(p.data);
                p = p.next;
            }
        }
    }
    
    void traverseLeft()
    {
        Node p;
        if(last==null)
        {
            System.out.println("Linked list Empty");
        }
        
        else
        {
            System.out.println("Linked list is shown");
            p = last;
            while(p!=null)
            {
                System.out.println(p.data);
                p = p.previous;
            }
        }
    }
    
    
    void search (int k)
    {
        Node p;
        p = first;
        while(p!=null)
        {
            if(p.data==k)
                break;
            p = p.next;
        }
        
        if(p==null)
        {
            System.out.println("Required node not found");
            
        }
        else
        {
            System.out.println("Required node is present at"+ p.data);
        }
    }
    
    void deleteNode (int k)
    {
        Node p;
        p = first;
        
        while(p!=null)
        {
            if(p.data==k)
                break;
            p = p.next;
        }
        
        if(p==null)
        {
            System.out.println("Required node not found");
            return;
        }
        else
        {
            if(p==first&&p==last)
            {
                first = last = null;
                
            }
            else if(p==first)
            {
                first= first.next;
                first.previous = null;
            }
            else if(p==last)
            {
                last = last.previous;
                last.next = null;
            }
            
            else
            {
                p.previous.next = p.next;
                p.next.previous = p.previous;
            }
        }
    }
    
    void destroyList()
    {
        first = last = null;
    }
    
    public static void main (String [] args)
    {
        
    }
}