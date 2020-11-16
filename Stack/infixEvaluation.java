import java.util.HashMap;
import java.util.Map;

import helper.LinkedListStack;

public class infixEvaluation {
  
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

    public static void infixEval(String s){

        
    }


    public static void main(String[] args){

        String s = "4*(3+2)+3/1"; 
        infixEval(s);


    }
}
