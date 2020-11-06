class ReversePrint{

    public  static void reverse(int n){
        if(n == 0){
            System.out.println(0);
        }else{
            System.out.println( n);
            reverse(n-1);
        }
    }

    public static void main(String[] args){
        int n = 10;
        reverse(n);
    
    }
    
}