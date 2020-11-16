package helper;

public class DynamicStack {
    
    private int capacity = 1;
    private int top = -1;
    private char[] arr;

    public DynamicStack(){
        arr = new char[capacity];
    }

    public void doubleStackSize(){
        capacity = capacity * 2;
     
        char[] temp = arr;
        arr = new char[capacity];
        for(int i = 0; i < capacity/2; i++)
            arr[i] = temp[i];        
        
    }

    public void print(){
        for(int i = top; i >=0 ;i--)
            System.out.println(arr[i]);
        System.out.println();
    }

    public char top(){
        if( isEmpty()!=1 )
            return arr[top];
        return '~';

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

    public void push(char data){
        if( isFull() == 1){
            doubleStackSize();
            arr[++top] = data;
        }else{
            arr[++top] = data;
        }
    }

    public char pop(){
        if( isEmpty() == 1){
            System.out.println("Stack Empty");
            return '~';
        }else{
            return arr[top--];
        }
    }
    
}
