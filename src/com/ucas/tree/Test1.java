package com.ucas.tree;

public class Test1 {
    public static void main(String[] args) {
        String address="上海|上海市|闵行区|吴中路";
        String[] splitAddress=address.split("\\|");
        for (String i: splitAddress
             ) {
            System.out.println(i);
        }
//        System.out.println( );

    }


}
