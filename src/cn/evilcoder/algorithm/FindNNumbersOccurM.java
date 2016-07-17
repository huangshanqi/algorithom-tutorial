package cn.evilcoder.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 数组中有N个数组出现超过了数组长度的1/M,找出这N个数.
 * 每次删除M个不同的数即可。
 * Created by huangshanqi on 2016/7/17.
 */
public class FindNNumbersOccurM {

    /**
     *
     * @param array The original number list.
     * @param n The number to return.
     * @param m 1/M
     * @return List of Number who occur more than 1/M times.
     */
    public static ArrayList<Integer> find(int[] array, int n, int m) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> occurs = new HashMap<>();
        for (int candidate : array) {
            if (occurs.containsKey(candidate)) {
                occurs.put(candidate, occurs.get(candidate) + 1);
            } else {
                occurs.put(candidate ,1);
            }
            if (occurs.size() >= m) {
                Iterator<Integer> iterator = occurs.keySet().iterator();
               while (iterator.hasNext()) {
                   int key = iterator.next();
                   if (occurs.get(key) == 1) {
                       iterator.remove();
                   }
               }
            }
        }
        for (Map.Entry<Integer, Integer> entry : occurs.entrySet()) {
            if (entry.getValue() > 0) {
                result.add(entry.getKey());
            }
        }
        return result;
    }
}
