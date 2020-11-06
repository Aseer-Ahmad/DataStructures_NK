package helper;

public class DoubleLinkedList {
    
    int data;
    DoubleLinkedList next;
    DoubleLinkedList prev;

    DoubleLinkedList head;

    public DoubleLinkedList(){}

    public DoubleLinkedList(int data){
        this.data = data;
        next = null;
        prev = null;
    }

    public void delete(int position){

        if(position == 1){
            //head
            head = head.next;
            head.prev = null;
        }else{
            DoubleLinkedList temp = head;
            while(position > 1 && temp.next!=null){
                position--;
                temp = temp.next;
            }
            if(temp.next == null && position == 1){
                temp.prev.next = null;
            }else if(position > 1){
                System.out.println("Invalid Position");
            }else{
                temp.prev.next = temp.next;
            }
        }

    }

    public void insert(int data, int position){
        DoubleLinkedList newNode = new DoubleLinkedList(data);

        if(head == null){
            head = newNode;
        }else{
            if(position == 1){
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }else{
                DoubleLinkedList temp = head;
                while(position > 2 && temp.next != null){
                    position--;
                    temp = temp.next;
                }

                if(temp.next == null && position == 2){
                    temp.next = newNode;
                    newNode.prev = temp;
                }else if(position > 2){
                    System.out.println("invalid position");
                }else{
                    newNode.prev = temp;
                    newNode.next = temp.next;

                    temp.next.prev = newNode;
                    temp.next = newNode;
                }

            }
        }

    }

    public void print(){
        DoubleLinkedList temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


}
