public class TowerHanoi {
    
    public static void main(String[] args) {

        int n  = 4;
        TOH(n, 'A', 'B', 'C');

    }

    private static void TOH(int n, char from, char to, char aux) {

        if(n == 1)
            System.out.format("Move 1 from %c to %c\n", from, to);
        else{
            TOH(n-1, from, aux, to );
            System.out.format("Move %d from %c to %c\n", n, from, to);
            TOH( n-1, aux, to , from);
        }

    }


}
