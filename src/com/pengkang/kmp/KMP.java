package com.pengkang.kmp;

import java.util.Arrays;

public class KMP {
    public static void main(String[] args) {
        String str1 = "bbc abcdad abcdabcdabde";
        String str2 = "dabc";//可更改，测试。

        int[] next = kmpNext("AAADDC");//【0，1，2】
        System.out.println(Arrays.toString(next));

        int index = kmpSearch(str1,str2,next);//把结果放在index
        System.out.println("index = "+ index);


    }
    //kmp搜索算法

    /**
     * 
     * @param str1 原串
     * @param str2 子串
     * @param next 部分匹配表
     * @return -1，没有匹配到，否则第一个匹配的位置
     */
    public static int kmpSearch(String str1, String str2, int[] next){
        //遍历str1,i j从0开始，第一个字符开始，如果相等，i++,之后，j也加
        for (int i = 0 , j=0; i < str1.length() ; i++) {

            //如果不相等，怎么处理
            while(j>0 && str1.charAt(i)!=str2.charAt(j)){
                //j>0
                j = next[j-1];//这个是关键，不等的时候用去更新这个表。
            }


            if(str1.charAt(i)==str2.charAt(j)){
                j++;
            }
            //j每次后移了，判断是不是子串的长度
            if(j==str2.length()){
                return i-j+1;
            }
        }
        return -1;//否则-1

    }


    //核心：获取子串的部分匹配表.返回数组
    public static int[] kmpNext(String dest){
        //创建next数组保匹配值，数组大小就是传入的子串的长度
        int[] next = new int[dest.length()];
        next[0] = 0;//子串长度为1，匹配表为0

        for (int i = 1, j =0; i< dest.length(); i++) {
            //dest.charAt(i) != dest.charAt(j)
            //next[j-1]处获取j,
            while(j>0 && dest.charAt(i) != dest.charAt(j)){
                //next[j-1]处获取j,)
                j = next[j-1];
            }


            if(dest.charAt(i) == dest.charAt(j)){
                //i=1 开始，这个满足的话，部分匹配值+1
                j++;
            }

            next[i]=j;

        }

        return next;
    }
}
