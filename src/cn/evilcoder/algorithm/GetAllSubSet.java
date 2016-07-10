package cn.evilcoder.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Write the algorithm to generate all the subSet from specified set.
 * Created by huangshanqi on 2016/7/10.
 */
public class GetAllSubSet {

    /**
     * Generate all the subSet from a specified set using recursion.
     * @param set The original set which will be used to generate all the subSet.
     * @param index The index to generate setSub.
     * @return All the subSet.
     */
    public static ArrayList<ArrayList<Integer>> generateAllSubSetByRecursion(List<Integer> set, int index) {
        ArrayList<ArrayList<Integer>> allSubSet = new ArrayList<>();
        if (set.size() == index) {
            // add the empty set
            allSubSet.add(new ArrayList<Integer>());
        } else {
            ArrayList<ArrayList<Integer>> subSet = generateAllSubSetByRecursion(set, index +1);
            int temp = set.get(index);
            for (ArrayList<Integer> sub : subSet) {
                ArrayList<Integer> newsSet = new ArrayList<>();
                newsSet.addAll(sub);
                newsSet.add(temp);
                allSubSet.add(newsSet);
            }
            allSubSet.addAll(subSet);
        }
        return allSubSet;
    }

    public static ArrayList<ArrayList<Integer>> generateAllSubSetByCombinatorics(ArrayList<Integer> set) {
        ArrayList<ArrayList<Integer>> allSubSet = new ArrayList<>();
        int max = 1 << set.size();
        for (int i = 0; i < max; i++) {
            ArrayList<Integer> sub = new ArrayList<>();
            int index = 0;
            for (int k = i; k > 0; k >>= 1,index++) {
                if ((k & 1) == 1) {
                    sub.add(set.get(index));
                }
            }
            allSubSet.add(sub);
        }
        return allSubSet;
    }
}
