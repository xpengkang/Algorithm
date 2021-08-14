import java.util.Stack;

public class L20 {
}
class Solution20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();


        // 遇到，左括号，入栈
        // 遇到右括号，和栈顶元素比较，如果不是一对，就false ,否则清除栈顶元素

        //思路优化： 遇到左括号，加入对应的右括号、
        //遇到右括号，比较是不是和栈顶一样，一样就是true.

        for(int i = 0; i< s.length(); i++){
            char c = s.charAt(i);
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;


        }

        return stack.isEmpty();


    }


}