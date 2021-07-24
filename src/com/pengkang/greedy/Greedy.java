package com.pengkang.greedy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Greedy {
    public static void main(String[] args) {
        //创建电台map,名字broadcasts
        HashMap<String, HashSet<String>> broadcasts = new HashMap<String, HashSet<String>>();

        //创建每个电台覆盖的地区，5个set,用add方法
        HashSet<String> hashset1 = new HashSet<String>();
        hashset1.add("北京");
        hashset1.add("上海");
        hashset1.add("天津");

        HashSet<String> hashset2 = new HashSet<String>();
        hashset2.add("北京");
        hashset2.add("广州");
        hashset2.add("深圳");

        HashSet<String> hashset3 = new HashSet<String>();
        hashset3.add("成都");
        hashset3.add("上海");
        hashset3.add("杭州");


        HashSet<String> hashset4 = new HashSet<String>();
        //hashset4.add("北京");
        hashset4.add("上海");
        hashset4.add("天津");

        HashSet<String> hashset5 = new HashSet<String>();
        //hashset5.add("北京");
        hashset5.add("杭州");
        hashset5.add("大连");


        //把hashset加入到map,用put
        broadcasts.put("k1",hashset1);
        broadcasts.put("k2",hashset2);
        broadcasts.put("k3",hashset3);
        broadcasts.put("k4",hashset4);
        broadcasts.put("k5",hashset5);

        //用这个存所有地区//
        HashSet<String> allAreas = new HashSet<String>();
        allAreas.addAll(hashset1);//addAll
        allAreas.addAll(hashset2);
        allAreas.addAll(hashset3);
        allAreas.addAll(hashset4);
        allAreas.addAll(hashset5);

        //System.out.println(allAreas);//[成都, 上海, 广州, 天津, 大连, 杭州, 北京, 深圳]


        //创建存放选则的电台集合，array list
        ArrayList<String> select = new ArrayList<String>();
        //临时的集合，存放遍历过程中的电台覆盖的地区，和all 的交集
        HashSet<String> tempSet = new HashSet<String>();

        //定义maxkey,
        String maxkey = null;
        while(allAreas.size() != 0){

            maxkey = null;
            //每次会从中去掉city
            for (String key: broadcasts.keySet()) {
                tempSet.clear();//每次要清空

                HashSet<String> areas = broadcasts.get(key);
                tempSet.addAll(areas);//一个一个取

                tempSet.retainAll(allAreas);//取交集，tempset和allareas
                //如果当前这个集合包含的未覆盖地区的数量比maxkey指向的多
                //这里体现贪婪，每次选最好的
                if(tempSet.size()>0 && (maxkey == null || tempSet.size()>broadcasts.get(maxkey).size())){
                    maxkey = key;
                }

                if(maxkey != null){
                    select.add(maxkey);
                    allAreas.removeAll(broadcasts.get(maxkey));
                }

            }

            //System.out.println("得到的选择结果"+ select);

        }
        System.out.println("得到的选择结果"+ select);






    }
}
