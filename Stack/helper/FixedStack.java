package helper;

public class FixedStack {
    
    private int top = -1;
    private int capacity = 100;
    private int[] arr;

    public FixedStack(){
        arr = new int[capacity];
    }

    public FixedStack(int data){
        arr = new int[capacity];
        arr[++top] = data;
    }

    public void print(){
        for(int i = top ; i >= 0 ; i--)
            System.out.println(arr[i]);

    }

    public int isEmpty(){
        if(top == -1)
            return 1;
        return 0;
    }

    public int isFull(){
        if(top == capacity - 1)
            return 1;
        return 0;
    }

    public void push(int data){
        if( isFull() == 1){
           System.out.println("Stack overflow"); 
        }else{
            arr[++top] = data;
        }
    }

    public int pop(){
        int _data = -1;
        if(isEmpty() == 1){
            System.out.println("Stack underflow");
        }else{
            _data = arr[top--];
        }
        return _data;
    }




}
