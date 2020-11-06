package helper;

public class DynamicStack {
    
    private int capacity = 1;
    private int top = -1;
    private int[] arr;

    public DynamicStack(){
        arr = new int[capacity];
    }

    public void doubleStackSize(){
        capacity = capacity * 2;
     
        int[] temp = arr;
        arr = new int[capacity];
        for(int i = 0; i < capacity/2; i++)
            arr[i] = temp[i];        
        
    }

    public void print(){
        for(int i = top; i >=0 ;i--)
            System.out.println(arr[i]);
        System.out.println();
    }


    public int isFull(){
        if(top == capacity - 1)
            return 1;
        return 0;
    }

    public int isEmpty(){
        if(top == -1)
            return 1;
        return 0;
    }

    public void push(int data){
        if( isFull() == 1){
            doubleStackSize();
            arr[++top] = data;
        }else{
            arr[++top] = data;
        }
    }

    public int pop(){
        if( isEmpty() == 1){
            System.out.println("Stack Empty");
            return -1;
        }else{
            return arr[top--];
        }
    }
    
}
