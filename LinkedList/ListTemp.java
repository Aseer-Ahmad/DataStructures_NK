import helper.LinkedList;

public class ListTemp {
    
    public static void main(String[] args){
        
        LinkedList l = new LinkedList();
        
        l.insertInLinkedList(1, 1);
        l.insertInLinkedList(2, 1);
        l.insertInLinkedList(3, 1);
        l.insertInLinkedList(4, 2);
        l.insertInLinkedList(5, 3);
        l.insertInLinkedList(6, 3);
        l.insertInLinkedList(4, 3);
        l.insertInLinkedList(9, 3);
       
        l.print();

        // System.out.println();
        // l.nFromEnd(7);
        // l.createListwithLoop();

        // l.findLoopinList();
        l.findLoopinListFloyd();
    }
}
