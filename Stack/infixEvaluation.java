import java.util.HashMap;
import java.util.Map;

import helper.DynamicStack;
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

        char [] arr = s.toCharArray();
        int l = arr.length;

        DynamicStack s1 = new DynamicStack();
        LinkedListStack s2 = new LinkedListStack();

        char temp, popped;
        int pop1, pop2, temp1=0;

        for(int i = 0;i < l;i++){            
            if(!isOperator(arr[i]) ){

                s2.push(Integer.parseInt(String.valueOf(arr[i])));
                
                if(s2.isEmpty()!=1){
                    System.out.println("O:Stack s2\n---------");
                    s2.print();
                }
            }else if( isRightParenthesis(arr[i]) ){

                temp = s1.top();

                while( !isLeftParenthesis(temp )){
                    
                    if(s1.isEmpty()!=1){
                    System.out.println("R:Stack s1 before popping\n---------");
                        s1.print();
                    }
                    popped = s1.pop();

                    if(s1.isEmpty()!=1){
                    System.out.println("R:Stack s1 after popping\n---------");
                        s1.print();
                    }
                    
                    if(s2.isEmpty()!=1){
                    System.out.println("R:Stack s2\n---------");
                        s2.print();
                    }

                    pop1 = s2.pop();
                    pop2 = s2.pop();

                    
                    switch(popped){
                        case '+': temp1 = pop1 + pop2;
                                s2.push( temp1); 
                                break;
                        case '-': temp1 = pop2 - pop1;
                                s2.push( temp1 ); 
                                break;
                        case '/': temp1 = pop2 / pop1;
                                s2.push( temp1 ); 
                                break;
                        case '*': temp1 = pop1 * pop2;
                                s2.push(temp1 ); 
                                break;
                    }
                    if(s2.isEmpty()!=1){
                    System.out.println("R:Stack s2\n---------");
                        s2.print();
                    }
                    if(s1.isEmpty()!=1)
                        temp = s1.top();
                }
                if(isLeftParenthesis(temp))
                    s1.pop();

            }else{
                //pop all higher priority till left parenthesis
                char op2 = arr[i];
                if(s1.isEmpty()!=1){
                    char op1 = s1.top();
                    

                    while(s1.isEmpty()!=1 && !isLeftParenthesis(op1) && getPrecedence(op1, op2) == 1 ){
                        if(s1.isEmpty()!=1){
                        System.out.println("N:Stack s1 before popping\n---------");
                            s1.print();
                        }
                        op1 = s1.pop();
                        if(s1.isEmpty()!=1){
                        System.out.println("N:Stack s1 after popping\n---------");
                            s1.print();
                        }
                        if(s2.isEmpty()!=1){
                        System.out.println("N:Stack s2\n---------");
                            s2.print();
                        }
                        pop1 = s2.pop();
                        pop2 = s2.pop();

                        switch(op1){
                            case '+': temp1 = pop1 + pop2;
                                    s2.push( temp1 ); 
                                    break;
                            case '-': temp1 = pop2 - pop1;
                                    s2.push( temp1 ); 
                                    break;
                            case '/': temp1 = pop2 / pop1;
                                    s2.push( temp1 ); 
                                    break;
                            case '*': temp1 = pop1 * pop2;
                                    s2.push(temp1 ); 
                                    break;
                        }
                        if(s2.isEmpty()!=1){
                        System.out.println("N:Stack s2\n---------");
                            s2.print();
                        }

                        if(s1.isEmpty()!=1)
                            op1 = s1.top();
                    }
                }

                s1.push(op2);
                if(s1.isEmpty()!=1){
                    System.out.println("N:Stack s1 after pushing\n---------");
                        s1.print();
                }
            }

        }

        while(s1.isEmpty() != 1 ){

            popped = s1.pop();
            
            pop1 = s2.pop();
            pop2 = s2.pop();
            
            switch(popped){
                case '*': s2.push( pop1 * pop2);
                        break;
                case '-':s2.push( -pop1 + pop2);
                        break;
                case '+':s2.push( pop1 + pop2);
                        break; 
                case '/':s2.push( pop2 / pop1);
                        break;     
            }
        }
        
        System.out.println(s2.pop());
        
    }


    public static void main(String[] args){

        String s = "4*5/5+2-1+9*2/2"; 
        infixEval(s);


    }
}
