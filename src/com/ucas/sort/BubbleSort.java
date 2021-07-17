package com.ucas.sort;

public class BubbleSort {

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

    //sort 方法里面调用前两个方法，每个冒泡会少一个元素
    //On2,
    public static void sort(Comparable[] a){
        for(int i = a.length -1; i >0; i--){
            for (int j = 0; j < i; j++) {
                //比较交换
                if(greater(a[j],a[j+1])){
                    swap(a, j,j+1);
                }
            }
        }
    }




}
