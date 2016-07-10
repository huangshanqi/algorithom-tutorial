package cn.evilcoder;

import cn.evilcoder.algorithm.GenerateNBrakets;
import cn.evilcoder.algorithm.NQueens;
import cn.evilcoder.algorithm.Permutations;
import cn.evilcoder.algorithm.Prime;
import cn.evilcoder.algorithm.SubSet;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by huangshanqi on 2016/7/10.
 * See more at <a href = "http://www.evilcoder.cn">www.evilcoder.cn</a>
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
        System.out.println(GenerateNBrakets.generateNBrackets(4));

        System.out.println(Prime.isPrime(10));
        System.out.println(NQueens.generateNQueens(8).size());
        for (Integer[] integers : NQueens.generateNQueens(8)) {
            System.out.println(Arrays.toString(integers));
        }
        System.out.println(Math.pow(8,8));


    }
}
