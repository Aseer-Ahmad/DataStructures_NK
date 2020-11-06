package helper;

import java.util.ArrayList;
import java.util.Hashtable;

public class LinkedList {
    
    private int data;
    private LinkedList next;

    private LinkedList head ;
    
    public LinkedList() {}

    public LinkedList(int data){
        head.data = data;
        head.next = null;
    }


    public int listLength() {
        LinkedList current = head;
        int count = 1;

        while(current.next != null){
            count++;
            current = current.next;
        }
        return count;
    }

    public void print(){ 
        LinkedList temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public void deleteInLinkedList(int position){
        if(position == 1){
            head = head.next;
        }else{
            LinkedList temp = head;
            while(position > 2 && temp.next!=null){
                position--;
                temp = temp.next;
            }
            if(temp.next != null){
                temp.next = temp.next.next;
            }else{
                System.out.println("invalid position");
            }

        }

    }

    public void createListwithLoop(){   

        insertInLinkedList(5, 1);
        insertInLinkedList(2, 1);
        insertInLinkedList(3, 1);
        insertInLinkedList(4, 1);
        insertInLinkedList(5, 1);
        insertInLinkedList(6, 1);
        
        LinkedList temp = head;
        while(temp.next!= null){temp = temp.next; }
        temp.next = head.next.next.next;
 
    }

    //find loop in list
    //O(n) both time and space
    public void findLoopinList(){
        LinkedList temp = head;
        int count = 0;
        Hashtable<LinkedList, Integer> ht = new Hashtable<>();

        while(temp.next!= null){
            if( ht.containsKey(temp)){
                System.out.println("loop found");
                break;
            }else{
                ht.put(temp,count);
                temp = temp.next;
                count++;
            }
        }
        
    }

    //floyd cycle finding algorithm : memoryless
    public void findLoopinListFloyd(){
        LinkedList tortoise = head;
        LinkedList turtle = head;

        while(tortoise!=null && turtle!=null && turtle.next!=null){
            tortoise = tortoise.next;
            turtle = turtle.next.next;

            if(turtle == tortoise){
                System.out.println("loop found: FLOYD");
                return;
            }
        }
        System.out.println("No loop exists: FLOYD");

    }

    public void nFromEnd(int position){

        LinkedList ptr = head;
        LinkedList ptr2 = head;

        while(position > 1){
            ptr = ptr.next;
            position--;
        }

        while(ptr.next != null){
            ptr = ptr.next;
            ptr2 = ptr2.next;
        }

        System.out.println(ptr2.data);

    }
    

    public void insertInLinkedList(int data, int position){

        LinkedList newNode = new LinkedList();
        newNode.data = data;
        
        if(head == null){
            head = new LinkedList();
            head.data = data;
            head.next = null;
        }else{ 
            
            if (position == 1){
                newNode.next = head;
                head = newNode;                        
            }else{
                LinkedList temp = head;
                while( position > 2 ){
                    position= position-1;
                    temp = temp.next;
                }
                newNode.next = temp.next;
                temp.next = newNode;
                                
            }
        }

    }



}
