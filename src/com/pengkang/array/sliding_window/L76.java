package sliding_window;

public class L76 {
}

//步骤一
//        不断增加j使滑动窗口增大，直到窗口包含了T的所有元素
//
//步骤二
//不断增加i使滑动窗口缩小，因为是要求最小字串，所以将不必要的元素排除在外，使长度减小，直到碰到一个必须包含的元素，这个时候不能再扔了，再扔就不满足条件了，记录此时滑动窗口的长度，并保存最小值
//
//步骤三
//让i再增加一个位置，这个时候滑动窗口肯定不满足条件了，那么继续从步骤一开始执行，寻找新的满足条件的滑动窗口，如此反复，直到j超出了字符串S范围。
//
//记住一点：freq始终记录着当前滑动窗口下，我们还需要的元素数量，我们在改变i,j时，需同步维护freq。
class Solution76 {
    public String minWindow(String s, String t) {
        if(t.length()==0 || s.length()==0)return "";


        int freq[] = new int[256];

        //记录需要的字符的个数
        for(int i = 0 ;i< t.length(); i++){
            freq[t.charAt(i)]++; //不是1，因为有重复的，用ascii

        }

        int l =0, r = 0 , size = Integer.MAX_VALUE, count = t.length(), start = 0;

        //遍历所有字符,
        while(r < s.length()){
            char c = s.charAt(r);
            if(freq[c]>0){
                count--;//包含了一个t的字符，
            }
            freq[c]--;
            if (count == 0) {//窗口中已经包含所有字符
                //左指针右移，缩小窗口
                while (l < r && freq[s.charAt(l)] < 0) {
                    freq[s.charAt(l)]++;//释放左边移动出窗口的字符
                    l++;//左指针右移，缩小窗口
                }
                if (r - l + 1 < size) {//不能右移时候挑战最小窗口大小，更新最小窗口开始的start
                    size = r - l + 1;
                    start = l;//记录下最小值时候的开始位置，最后返回覆盖串时候会用到
                }

                //l向右移动后窗口肯定不能满足了 重新开始循环
                freq[s.charAt(l)]++;
                l++;
                count++;
            }

            r++; //增加窗口


        }

        return size == Integer.MAX_VALUE ? "" : s.substring(start, start + size);

    }
}