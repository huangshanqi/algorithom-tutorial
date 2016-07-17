package cn.evilcoder.algorithm;

/**
 * 获取子数组的最大和
 * Created by huangshanqi on 2016/1/1.
 */
public class GetMaxSubArraySum {

    public static int getMaxSubArraySum(int[] array) {
        if (array == null || array.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = array[0];
        int sum = array[0];
        for (int index = 1; index < array.length; index++) {
            sum = Math.max(sum + array[index], array[index]);
            max = Math.max(max, sum);
        }
        return max;
    }
}
