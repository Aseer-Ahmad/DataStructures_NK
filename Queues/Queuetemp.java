import helper.CircularQueue;
import helper.LinkedListQueue;

public class Queuetemp {

    public static void main(String args[]) {

        LinkedListQueue circularQueue = new LinkedListQueue();

        circularQueue.enqueue(1);
        circularQueue.enqueue(2);
        circularQueue.enqueue(3);
        circularQueue.enqueue(4);
        circularQueue.enqueue(5);
        circularQueue.enqueue(6);
        
        circularQueue.print();

        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue.dequeue());
        
        circularQueue.print();

        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue.dequeue());
        
    }
    

}

