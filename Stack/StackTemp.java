import helper.FixedStack;
import helper.DynamicStack;
import helper.LinkedListStack;

public class StackTemp {
    
    public static void main(String [] as){

        // FixedStack fixedStack = new FixedStack();
  
        // fixedStack.push(9);
        // fixedStack.push(8);
        // fixedStack.push(7);
        // fixedStack.push(6);
        // fixedStack.push(5);
        // fixedStack.push(4);
        
        // fixedStack.print();

        // DynamicStack dynamicStack = new DynamicStack();

        // dynamicStack.push(8);
        // dynamicStack.push(7);

        // dynamicStack.print();

        // dynamicStack.push(1);
        // dynamicStack.push(2);
        // dynamicStack.push(3);
        // dynamicStack.push(4);
        // dynamicStack.push(51);
        
        // dynamicStack.print();

        // System.out.println(  dynamicStack.pop());
        // System.out.println(  dynamicStack.pop());
        // System.out.println(  dynamicStack.pop());
        // System.out.println(  dynamicStack.pop());
        
        LinkedListStack linkedListStack = new LinkedListStack();
        linkedListStack.push(1);
        linkedListStack.push(2);
        linkedListStack.push(3);
        linkedListStack.push(4);
        linkedListStack.push(5);
        linkedListStack.push(6);
        
        linkedListStack.print();

        linkedListStack.pop();
        linkedListStack.pop();
        
  
    }
}
