package str;

public class L7 {
}
class Solution7 {
    public int reverse(int x) {
        //use stack

        // 技巧，用取余和取模运算
//             123 % 10 = 3
//             3 * 10 + 12% 10 = 32
//             32 * 10 + 1 = 321

//             123 / 10 = 12
//             12/10 = 1
//             1/10 = 0
        int res = 0;

        while(x != 0){
            int newHead = x % 10;
            int newRes = res * 10 + newHead;
            if ((newRes - newHead) / 10 != res){ ////判断是否溢出
                return 0;
            }
            res = newRes; //更新结果

            x = x / 10; //更新下一次循环

        }
        return res;

    }
}