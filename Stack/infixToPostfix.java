import java.util.HashMap;
import java.util.Map;

import helper.DynamicStack;

public class infixToPostfix {

    private static DynamicStack dynamicStack = new DynamicStack();
       
    public static int getPrecedence(char op1, char op2){
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('(', 3);
        map.put(')', 3);
        
        map.put('*', 2);
        map.put('/', 2);
        map.put('%', 2);
        map.put('-', 1);
        map.put('+', 1);
        
        if(map.containsKey(op1) && map.containsKey(op2)){
            if( map.get(op1) >= map.get(op2) ){
                return 1;
            }
        }
        return 0;
    }

    public static boolean isOperator(char ch){
        String op = "+-*/()[]<>{}";
        return op.contains(Character.toString(ch));     
    }

    public static boolean isRightParenthesis(char ch){
        if(ch == '>' || ch == ']' || ch == '}' || ch == ')')
            return true;
        return false;
    }

    public static boolean isLeftParenthesis(char ch){
        if(ch == '(' || ch == '[' || ch == '{' || ch == '<')
            return true;
        return false;
    }

    public static void in2postfix(String s){
                   
        char temp;
        char arr[] = s.toCharArray();
        int length = arr.length;

        for(int i=0; i<length; i++){
            if( !isOperator(arr[i]) ){  //is a operand
                System.out.print(arr[i]);
            }else if( isRightParenthesis(arr[i])){  
                temp = dynamicStack.pop();
                while( !isLeftParenthesis(temp)){
                    System.out.print(temp);
                    temp = dynamicStack.pop();
                }
            }else{
                if(dynamicStack.isEmpty() == 0){
                    //check precedence
                    temp = dynamicStack.top();
                    // temp > arr[i]
                    while( getPrecedence( temp, arr[i]) == 1 &&
                            temp != '~' ){
                        if(!isLeftParenthesis(temp)){
                            dynamicStack.pop();
                            System.out.print(temp);
                            temp = dynamicStack.top();   
                        }else{
                            break;
                        }      
                    }
                }
                                
                //push
                dynamicStack.push( arr[i] );
            }
        }

        while(dynamicStack.isEmpty()!=1)
            System.out.print(dynamicStack.pop()); 

    }
    

    public static void main(String []asa){

        String s = "A*B-(C+D)+E";
        in2postfix(s);

    }
    
}
