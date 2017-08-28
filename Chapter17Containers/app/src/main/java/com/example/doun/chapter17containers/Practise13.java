package com.example.doun.chapter17containers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by power on 2017/8/28,028.
 */

public class Practise13 {

    private static void method(ArrayList<String> s) {
        //定义 一个容器
        AssociativeArray<String, Integer> tm = new AssociativeArray<>(500);

        //通过for循环逐一统计每个字符出现的次数
        for (int x = 0; x < s.size(); x++) {
            if (null == tm.get(s.get(x))) {
                tm.put(s.get(x), 1);
            } else {
                tm.put(s.get(x), tm.get(s.get(x)) + 1);
            }
        }
        //调用自定义方法在控制台上输出统计信息
        printMapDemo1(tm);

//        try{
//            savaXMLFile(tm);
//        }catch(Exception e){
//            e.printStackTrace();
//        }
    }

    private static void printMapDemo1(AssociativeArray<String, Integer> tm) {
//        Set<String> st = tm.keySet();
//        Iterator<String> ti = st.iterator();
//        for (; ti.hasNext(); ) {
//            String key = ti.next();
//            System.out.println(key + "(" + tm.get(key) + ")");
//
//        }
        System.out.println(tm.toString());
    }


    public static void main(String[] args) {
        TextFile textFile = new TextFile("Practise13.java", "\\W+");
        method(textFile);

    }


}
