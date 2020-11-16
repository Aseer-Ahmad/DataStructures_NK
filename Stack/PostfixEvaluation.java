import helper.LinkedListStack;

public class PostfixEvaluation {
    

    public static boolean isOperator(char ch){
        String op = "*-/%+";
        return op.contains(Character.toString(ch));
    }

    public static void postfixEval(String s){
        LinkedListStack dynamicStack = new LinkedListStack();
        char [] arr = s.toCharArray();

        for(int i = 0; i < arr.length; i++){

            int temp, temp1 ;
            if( !isOperator(arr[i])){
                dynamicStack.push( arr[i] - '0' );
            }else{
                temp = dynamicStack.pop();
                temp1 = dynamicStack.pop();
                switch(arr[i]){
                    case '*':dynamicStack.push(temp * temp1);
                             break;
                    case '+':dynamicStack.push(temp + temp1);
                             break;
                    case '-':dynamicStack.push(-temp + temp1);
                             break;
                    case '/':dynamicStack.push(temp1 / temp);
                             break;                    
                }
                // dynamicStack.push(temp);

            }
        }
        System.out.println("answer: "+dynamicStack.pop());
    }

    public static void main(String[] args){

        String s = "45*32+-6+";
        postfixEval(s);


    }
}
