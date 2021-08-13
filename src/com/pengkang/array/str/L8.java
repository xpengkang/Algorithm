package str;

public class L8 {
}
class Solution8 {
    public int myAtoi(String s) {
        //这道题，一步步按照题目提示写逻辑

        s = s.trim();//remove all whitespaces
        if(s.length() == 0)//check if the string is empty
            return 0;

        boolean isPos = true;
        int start =0;// 用来遍历字符串的指针（下标）

        if(!isDigit(s.charAt(start))){
            if(isSign(s.charAt(start)))
                isPos = (s.charAt(start) == '+')?true:false;//判断+，-
            else       //if not '+' or '-' return 0
                return 0;
            start++;
        }

        while(start < s.length() && s.charAt(start) == '0')//skip the leading 0s.  //防止数组越界
            start++;

        long res =0;
//解析数字,做数字运算，做阈值判断
        while(start<s.length()){//防止数组越界

            if(isDigit(s.charAt(start))){
                res = res*10 + (s.charAt(start) - '0');
                if(res > Integer.MAX_VALUE){//check if there is an overflow
                    return (isPos)?Integer.MAX_VALUE:Integer.MIN_VALUE;
                }
            }

            else
                break;

            start++;
        }

        if(res ==0)//if no digits were read
            return 0;

        int ans = (int) res;
        return (isPos)?ans:-(ans);
    }

    //辅助方法
    private boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    private boolean isSign(char c) {
        return c == '+' || c == '-';
    }
}