import helper.CircularLinkedList;

public class CircularListTemp {
    
    public static void main(String[] args){
        CircularLinkedList cll = new CircularLinkedList();
        
        cll.insert(1, 1);
        cll.insert(2, 1);
        cll.insert(3, 1);
        cll.insert(4, 1);
        cll.insert(5, 5);
        cll.insert(4, 6);
        
        cll.print();
        
        cll.delete(7);
        cll.print();

    }
}
