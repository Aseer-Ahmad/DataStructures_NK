package helper;

public class LinkedListStack {
    int data;
    LinkedListStack next;

    LinkedListStack head;

    public LinkedListStack(){

    }

    public void print(){
        if(isEmpty() != 1){
            LinkedListStack temp = head; 
            while(temp.next!=null){
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }

    public void push(int data){
        LinkedListStack newNode = new LinkedListStack();
        newNode.data = data;

        newNode.next = head;
        head = newNode;
    }

    public int pop(){
        if(isEmpty() == 1){
            System.out.println("Stack empty");
            return -1;
        }else{
            int data = head.data;
            head = head.next;
            System.out.println(data);
            return data;
        }
    }

    public int isEmpty(){
        if(head == null)
            return 1;
        return 0;
    }

    
    // public int isFull(){
    // }

}
