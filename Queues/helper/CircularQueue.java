package helper;

public class CircularQueue {

    int capacity = 100;
    int front, rear;
    int[] arr;

    public CircularQueue(){
        arr = new int[capacity];
        front = -1;
        rear = -1;
    }

    public boolean isFull(){

        if( (rear+1 == front) || ( (rear == capacity - 1) && (front == 0) )){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(front == -1){
            return true;
        }
        return false;
    }

    public void enqueue(int data){
        
        if(isFull()){
            System.out.println("Queue Full. ");
        }else{
            if(rear == capacity - 1){ // or ... (rear+1)%capacity
                rear = 0;
                arr[rear] = data;
            }else{
                arr[++rear] = data;
            }

            if(front == -1) // when queue is empty
                front = 0;
        }

    }

    public int dequeue(){
        int data ;

        if(isEmpty()){
            System.out.println("Queue is Empty. ");
            return -1;
        }else{
            if(front == capacity - 1){
                data = arr[front];
                front = 0;
            }if(front == rear){
                data = arr[front];
                front = -1;
                rear = -1;
            }
            else{
                data = arr[front];
                front++;
            }
        }

        return data;

    }

    public void print(){
        if(!isEmpty()){
            
            if(front < rear){
                for(int i = front; i <= rear; i++)
                    System.out.print(arr[i] + "-");
                System.out.println();
            }else{
                for(int i = front; i < capacity ; i++)
                    System.out.print(arr[i] + "-");
                for(int i = 0; i <= rear; i++)
                    System.out.print(arr[i] + "-");
                System.out.println();
            }
        }
    }

    
}
