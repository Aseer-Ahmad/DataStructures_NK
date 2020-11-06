package helper;

public class CircularLinkedList {
    int data;
    CircularLinkedList next;
    
    CircularLinkedList head;

    public CircularLinkedList(){

    }

    public CircularLinkedList(int data){
        this.data = data;
        next = null;
    }

    public int length(){
        int count = 0;
        CircularLinkedList temp = head;
        
        if(head == null){
            return count;
        }else{
            do{
                temp = temp.next;
                count++;
            }while(temp!=head);
        }
        return count;
    }

    public void delete(int position){
        CircularLinkedList temp = head;
        if(position == 1){
            
            while(temp.next != head){
                temp = temp.next;
            }
            head = head.next;
            temp.next = head;

        }else{
            while(position > 2 && temp.next!=head){
                position--;
                temp = temp.next;
            }

            if(temp.next.next == head && position == 2){
                //last
                temp.next = temp.next.next;
            }else if(temp.next == head){
                System.out.println("Invalid position");
            }else{
                temp.next = temp.next.next;
            }

        }
    }

    public void insert(int data, int position){
        CircularLinkedList newNode = new CircularLinkedList(data);
        CircularLinkedList temp = head; 

        if(head == null){
            head = newNode;
            head.next = newNode;
        }else{
            if(position == 1){
                newNode.next = head;
                
                //traverse to tail
                while(temp.next!=head){
                    temp = temp.next;
                }
                temp.next = newNode;

                head = newNode;    
            }else{
                while(position > 2 && temp.next!=head){
                    position--;
                    temp = temp.next;
                }
                if(temp.next == head && position == 2){
                    //last
                    temp.next = newNode;
                    newNode.next = head;
                }else if(position > 2){
                    System.out.println("Invalid position");
                }else{
                    newNode.next = temp.next;
                    temp.next = newNode;
                }

            }
        }

    }

    public void print(){
        CircularLinkedList temp = head;
        
        if(head == null){
            return ;
        }else{
            do{
                System.out.print(temp.data + " ");
                temp = temp.next;
            }while(temp!=head);
        }
        System.out.println();
    }

    
}
