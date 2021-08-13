package str;

public class L9 {
}
class Solution9 {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;

        int actual = x;//用于保存x;
        int res = 0;//反转整数
        while(x != 0){

            res = res * 10 + x % 10;//这里思路和反转整数一样，和上一题
            x = x/10;
        }

        return actual == res;
    }
}