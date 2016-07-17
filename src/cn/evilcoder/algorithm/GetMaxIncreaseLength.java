package cn.evilcoder.algorithm;

import java.util.Arrays;

/**
 * 求数组的最大递增子序列长度
 * Created by huangshanqi on 2016/7/17.
 */
public class GetMaxIncreaseLength {

    public static int getMaxIncreaseLength(int[] array) {
        if (array.length == 1) {
            return array[0];
        }
        int[] increase = new int[array.length];
        Arrays.fill(increase, 1);
        int max = 1;
        for (int index = 1; index < array.length; index++) {
            for (int sub = index -1; sub >= 0; sub--) {
                if (array[index] > array[sub] && increase[sub] + 1 > increase[index]) {
                    increase[index] = increase[sub] + 1;
                }
            }
            max = Math.max(increase[index], max);
        }
        return max;
    }
}
