package cn.evilcoder;

import cn.evilcoder.algorithm.Permutations;
import cn.evilcoder.algorithm.SubSet;

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
        System.out.println(SubSet.generateAllSubSetByRecursion(set, 0).size());
        System.out.println(SubSet.generateAllSubSetByCombinatorics(set).size());
        System.out.println(Permutations.genereateStringAllPermutations("abcd"));
    }
}
