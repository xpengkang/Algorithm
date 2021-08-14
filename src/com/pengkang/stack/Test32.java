import java.util.Scanner;
import java.util.Stack;

public class Test32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        String s = sc.nextLine();
        Solution1 solution = new Solution1();
        int res  = solution.longestValidParentheses(s);
        System.out.println(res);

    }
}


class Solution1 {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<Integer>();

        int max=0;
        int left = -1;
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)=='(') stack.push(j);//存入的是下标
            else {
                if (stack.isEmpty()) left=j;//更新下标
                else{
                    stack.pop();//右阔号了，直接pop出去。
                    if(stack.isEmpty()) max=Math.max(max,j-left);//空栈，
                    else max=Math.max(max,j-stack.peek());
                }
            }
        }
        return max;
    }
}