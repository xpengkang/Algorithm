package com.pengkang.heap;


import java.lang.*;

//public class MaxHeap<Item extends Comparable> {
//    //不想外界直接更改
//    private Item[] data;
//    private int count;
//    private int capacity;
//
//
//    public MaxHeap(int capacity){
//        data = (Item[]) new Object[capacity + 1];
//        count = 0;
//        this.capacity = capacity;
//    }
//
//    public int size(){
//        return count;
//    }
//
//    public boolean isEmpty(){
//        return count == 0;
//    }
//
//    public static void main(String[] args) {
//        MaxHeap<Integer> maxHeap = new MaxHeap<>(100);
//        System.out.println(maxHeap.size());
//    }
//
//    public void insert(Item item){
//        assert count + 1 <= capacity;
//        data[count + 1] = item;
//        count++;
//        shiftUp(count);
//    }
//
//    public Item extracMax(){
//
//    }
//    private void shiftUp(int k){
//        while(k > 1 && 0 > data[k / 2].compareTo(data[k])){
//            swap(k, k/2);// 交换堆中索引为k和k/2的两个元素
//            k /= 2;
//        }
//    }
//
//    //
//    private void swap(int i, int j){
//        Item t = data[i];
//        data[i] = data[j];
//        data[j] = t;
//    }
//
////    private void shiftDown(){
////        while(2*k <= count){
////            int j = 2*k;
////
////        }
////    }
//
//
//}
