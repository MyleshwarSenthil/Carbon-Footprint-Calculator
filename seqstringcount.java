import java.util.*;

class seqstringcount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(stack.isEmpty() || stack.peek() == ch){
                stack.push(ch);
            }
            else{
                System.out.print(stack.peek());
                int count =0;
                while(!stack.isEmpty()){
                    stack.pop();
                    count++;
                }
                System.out.print(count);
                stack.push(ch);
            }
        }

        int finalcount = 0;
        System.out.print(stack.peek());
        while(!stack.isEmpty()){
            stack.pop();
            finalcount++;
        }
        System.out.print(finalcount);
    }
}