package helper;

import helper.LinkListNode;

public class LinkedListQueue {
    
    LinkListNode front;
    LinkListNode rear;

    public LinkedListQueue(){
        front = null;
        rear = null;
    }

    public boolean isEmpty() {
        if(front == null || rear== null)
            return true;
        return false;
    }

    // public boolean isFull(){}

    public void enqueue(int data){
        LinkListNode newNode = new LinkListNode(data); // next is null

        if(isEmpty()){
            front = newNode;
            rear = newNode;
        }else{  

            rear.next = newNode;
            rear = newNode;

        }
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue Empty");
            return -1;
        }else{
            int data = front.data;
            if(front ==  rear){
                front = null;
                rear = null;
            }else{
                front = front.next;
            }
            return data;
        }
    }

    public void print(){
        LinkListNode temp = front;

        while(temp.next != null){
            System.out.print(temp.data +"-");
            temp = temp.next;
        }
        System.out.print(temp.data);
        System.out.println();
    }


}
