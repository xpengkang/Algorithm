package pengkang.sort;

import java.util.Arrays;


/**
 * O(n2), space,O(1)
 */
public class Insertion {
    //核心插入
    public static void sort(Comparable[] a){
        //待排序的元素从，（1 第二个元素开始），2，3，4，开始，到length -1
        for(int i = 1; i<a.length; i++){
            //内循环，倒叙遍历
            for(int j = i; j> 0; j--){
                //比较j,j-1,
                if(greater(a[j-1],a[j])){
                    swap(a, j-1,j);
                }else{
                    break;
                }
            }
        }
    }



    private static boolean greater(Comparable a, Comparable b){
        return a.compareTo(b) > 0 ;//true = a>b
    }

    private static void swap(Comparable[] a, int i, int j){
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
//test;
    public static void main(String[] args) {
        Integer[] a = {3,5,1,2,0,9};
        Insertion.sort(a);
        System.out.println(Arrays.toString(a));
    }


}
