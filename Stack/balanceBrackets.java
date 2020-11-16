import helper.DynamicStack;

public class balanceBrackets {
    public static void main(String[] args){

        DynamicStack dynamicStack = new DynamicStack();
        String s = "((A+B)-[C+d])";  //}((A+B)-[C+d]) 
        boolean ERROR = false;

        char [] arr= s.toCharArray();
        int length = arr.length;

        for(int i=0; i<length; i++){

            if(arr[i] == '(' || arr[i] == '<' || arr[i] == '[' || arr[i] == '{' ){
                dynamicStack.push(arr[i]);
            }else if(arr[i] == ')' || arr[i] == '>' || arr[i] == ']' || arr[i] == '}' ) {
                char temp = dynamicStack.pop();
                if( (arr[i] == ')' && temp == '(') ||
                    (arr[i] == ']' && temp == '[') ||
                    (arr[i] == '}' && temp == '{') ||
                    (arr[i] == '>' && temp == '<')   ){
                    continue;        
                }else{
                    ERROR = true ; 
                    System.out.println("Incorrect brackets");
                    break;
                }
            }
        }
        
        if(dynamicStack.isEmpty() != 1 && ERROR  == false){
            System.out.println("Incorrect brackets.");
        }





    }
}
