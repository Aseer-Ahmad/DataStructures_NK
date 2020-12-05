package helper;

public class DynamicCircularQueue {

    int capacity = 1;
    int[] arr;
    int front,rear;
    int size = 0;

    public DynamicCircularQueue(){
        front = -1;
        rear = -1;
        arr = new int[capacity];
    }

    public void resizeQueue(){
        int[] temp = new int[capacity];
        int count = 0 ;
        
        capacity = capacity * 2;

        if(front <= rear){
            for(int i = front; i <= rear; i++){
                temp[count] = arr[i];
                count++;
            }
        }else{
            for(int i =front ; i < capacity/2; i++){
                temp[count] = arr[i];
                count++;
            }
            for(int i = 0 ; i <= rear; i++){
                temp[count] = arr[i];
                count++;
            }
        } 
        arr = new int[capacity];
        for(int i = 0; i < capacity/2; i++)
            arr[i] = temp[i];
            
    }

    public boolean isEmpty(){
        if(front == -1)
            return true;
        return false;
    }

    public boolean isFull(){
        if( (rear+1)%capacity == front  )
            return true;
        return false;
    }   

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue Empty");
            return -1;
        }else{
            int data = arr[front];
            if(front == rear){
                rear = -1;
                front = -1;
            }else{
                front = (front+1)%capacity;
            }
            //decrease size
            size--;
            return data;
        }
    }

    public int size(){ return size;}

    public void enqueue(int data){
        if(isFull()){
            resizeQueue();
            arr[++rear] = data;
        }else{
            rear = (rear+1)%capacity;
            arr[rear] = data;

            if(front == -1)
                front = 0;

        }
        //increase size
        size++;
    }

    
    public void print(){
        if(!isEmpty()){
            
            if(front <= rear){
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
