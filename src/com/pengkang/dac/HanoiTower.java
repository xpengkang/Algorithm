package com.pengkang.dac;

public class HanoiTower {
    public static void main(String[] args) {
        //test
        hanoiTower(6,'A','B','C');

    }

    //
    public static void hanoiTower(int num, char a , char b, char c){
        //如果只有一个盘
        if(num == 1){
            System.out.println("第一个盘从"+a+"->"+c);
        }else{
            hanoiTower(num-1,a,c,b);
            System.out.println("第"+num+ "个盘从"+a+"->"+c);
            hanoiTower(num-1,b,a,c);
            //count ++;

        }
    }
}
