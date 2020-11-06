import java.util.*;

class factorial{

    public static int fact(int x){
        
        if(x == 1){
            return 1;
        }else{
          return x * fact(x-1);
        }
    
    
    }

    public static void main(String []ad){
        int temp = 8;
        System.out.println( fact(temp));
    }
}

