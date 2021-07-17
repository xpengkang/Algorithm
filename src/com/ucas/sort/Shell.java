package com.ucas.sort;

import java.util.Arrays;

public class Shell {

    public static void main(String[] args) {
        Integer[] a = {2,4,5,1,8,3,0,9};
        Shell.sort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void sort(Comparable [] a){
        /*
        固定模板
         */
        int h = 1;
        //确定h
        while(h< 5){
            h= 2*h +1;
        }
        //h=7


        while(h>=1){
            //待插入的位置h,
            for(int i = h; i< a.length;i++){
                for(int j = i; j>=h;j-=h){
                    if(greater(a[j-h], a[j])){
                        //交换
                        swap(a, j-h, j);
                    }else{
                        break;
                    }
                }
            }



            h= h/2;
        }


    }






    //比较方法
    private static boolean greater(Comparable v, Comparable w){
        return v.compareTo(w) > 0;
        //int res = v.compareTo(w); res>0 ,true;
    }

    // 交换值；
    private static void swap(Comparable[] a, int i, int j){
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }



}
