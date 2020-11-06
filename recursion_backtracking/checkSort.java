public class checkSort {

public static void main(String[] args){

    int [] n = new int[]{1, 2, 3, 4, 5, 6};

    System.out.println( arrayCheck(n, n.length - 1));

}

private static int arrayCheck(int[] arr, int i) {
    
    if( i == 0){
        return 1;
    }else{
        if(arr[i] < arr[i-1])
            return  0;
        else   
            return arrayCheck(arr, i-1);
    }

    }
}
