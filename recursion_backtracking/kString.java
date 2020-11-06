public class kString {
    
    
    public static void kstring(int n, int k){
        if(n < 1){
            print(arr);
            System.out.println();
        }else{
            for(int i = 0; i < k; i++){
                arr[n-1] = k;
                kstring(n-1, k);
            }
        }
    }

    public static void print(int []A){
        for(int i = 0; i < A.length; i++){
            System.out.print(A[i]+" ");
        }
    }


    public static int[] arr = new int[]{1, 2, 3, 4, 5};
        
    public static void main(String[] args){

        int n = 3;
        int k = 5;

        kstring(n, k);
        

    }
}
