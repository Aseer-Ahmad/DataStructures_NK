import java.util.Stack;

import helper.DynamicCircularQueue;

public class StackbyQueues {
    
    DynamicCircularQueue q1;
    DynamicCircularQueue q2;


    StackbyQueues(){
        q1 = new DynamicCircularQueue();
        q2 = new DynamicCircularQueue();
    }

    public void push(int data){
        if(q1.isEmpty() && q2.isEmpty()){
            q1.enqueue(data);
        }else if(q1.isEmpty() && !q2.isEmpty()){
            q2.enqueue(data);
        }else if(q2.isEmpty() && !q1.isEmpty()){
            q1.enqueue(data);
        }
    }

    public int pop(){

        if(q1.isEmpty() && !q2.isEmpty()){
            int len = q2.size();
            while(!q2.isEmpty() && len > 1){
                q1.enqueue(q2.dequeue());
                len--;
            }
            return q2.dequeue();
        }else if(q2.isEmpty() && !q1.isEmpty()){
            int len = q1.size();
            while(!q1.isEmpty() && len > 1){
                q2.enqueue(q1.dequeue());
                len--;
            }
            return q1.dequeue();
        }else{
            System.out.println("Queue empty"); 
            return -1;
        }
    }

    public void print(){
        
        if(q1.isEmpty() && !q2.isEmpty()){
            System.out.println("size: " + q2.size());
            q2.print();
        }else if(q2.isEmpty() && !q1.isEmpty()){
            System.out.println("size: " + q1.size());
            q1.print();
        }
    }

    public static void main(String[] args){

        StackbyQueues stack = new StackbyQueues();

        stack.push(2);
        stack.push(21);
        stack.push(32);
        stack.push(42);
        stack.push(1);
        stack.push(6);

        stack.print();

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        
        stack.print();

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        
        stack.print();

        
    }


}
