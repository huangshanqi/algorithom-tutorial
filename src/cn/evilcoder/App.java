package cn.evilcoder;

import cn.evilcoder.algorithm.GetAllSubSet;

import java.util.ArrayList;

/**
 * Created by huangshanqi on 2016/7/10.
 */
public class App {
    public static void main(String[] args) {
        ArrayList<Integer> set = new ArrayList<>();
        for (int i = 0; i < 7; i ++) {
            set.add(i);
        }
        System.out.println(GetAllSubSet.generateAllSubSetByRecursion(set, 0).size());
        System.out.println(GetAllSubSet.generateAllSubSetByCombinatorics(set).size());
    }
}
