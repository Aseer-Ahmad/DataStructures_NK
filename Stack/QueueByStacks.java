import helper.LinkedListStack;

public class QueueByStacks {

    LinkedListStack s1;
    LinkedListStack s2;

    public QueueByStacks(){
        s1 = new LinkedListStack();
        s2 = new LinkedListStack();
    }

    public void enqueue(int data){
        s1.push(data);
    }

    public int dequeue(){
        int data;
        if(s2.isEmpty() != 1){
            data = s2.pop();
        }else{
            if(s1.isEmpty() == 1){
                System.out.println("Queue Empty.");
                return -1;
            }else{
                while(s1.isEmpty() != 1){
                    s2.push(s1.pop());
                }
                data = s2.pop();
            }
        }

        return data;

    }

    public void print(){

        System.out.print("S1\n---\n");
        s1.print();

        System.out.print("S2\n---\n");
        s2.print();

    }
 
    public static  void main(String args[]){

        QueueByStacks queue = new QueueByStacks();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);

        queue.print();

        System.out.println( queue.dequeue());
        System.out.println( queue.dequeue());
        System.out.println( queue.dequeue());

        System.out.println();

        queue.print();  

        queue.enqueue(10);
        queue.enqueue(11);
        queue.enqueue(12);
        queue.enqueue(13);
        
        queue.print();
        
        System.out.println( queue.dequeue());
        System.out.println( queue.dequeue());

        System.out.println();
        queue.print();
    }

   
}
