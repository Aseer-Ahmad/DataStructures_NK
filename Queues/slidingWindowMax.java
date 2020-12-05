import helper.CircularQueue;

public class slidingWindowMax {
    
    public static void main(String[] args){

        int[] arr = {1, 2, 3, 4, 5, 5, 6, 7, 1, 2, 0, 1};
        int k = 3;
        int sum = 0;
        int max = 0;

        CircularQueue queue = new CircularQueue();
        for(int i = 0 ;i < k; i++){
            queue.enqueue(arr[i]);
            sum += arr[i];
           
        }
        
        max = sum;
        System.out.format("Queue  : Maxsum\n");
        queue.print();
        System.out.println(" : "+max);  
        for(int i = 3; i < arr.length; i++){                       

            queue.enqueue(arr[i]);
            sum = sum + arr[i] - queue.dequeue();
            if(sum > max)
                max = sum;
          
            queue.print();
            System.out.println(" : "+max);
        }

        System.out.println("\nmax sum : "+ max);

        /////////////////////////////////////
        // queue = new CircularQueue();;
        // int max_n = arr[0];
        // for(int i = 0 ;i < k; i++){
        //     if(arr[i] > max_n)
        //         max_n = arr[i];
        // }
        
        // max = sum;
        // System.out.format("Queue  : Maxsum\n");
        // queue.print();
        // System.out.println(" : "+max);  
        // for(int i = 3; i < arr.length; i++){                       

        //     queue.enqueue(arr[i]);
        //     sum = sum + arr[i] - queue.dequeue();
        //     if(sum > max)
        //         max = sum;
          
        //     queue.print();
        //     System.out.println(" : "+max);
        // }


    }
}
