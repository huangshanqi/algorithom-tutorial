package cn.evilcoder.algorithm;

import java.util.ArrayList;

/**
 * 组合
 * Created by huangshanqi on 2016/7/10.
 * See more at <a href = "http://www.evilcoder.cn">www.evilcoder.cn</a>
 */
public class Permutations {

    public static ArrayList<String> genereateStringAllPermutations(String str) {
        ArrayList<String> result = new ArrayList<>();
        if (null == str) {
            return null;
        }
        if (str.length() == 0) {
            result.add("");
            return result;
        }
        char cha = str.charAt(0);
        String subString = str.substring(1);
        ArrayList<String> subList = genereateStringAllPermutations(subString);
        for (String string : subList) {
            for (int i = 0; i <= string.length(); i++) {
                result.add(string.substring(0,i) + cha + string.substring(i));
            }
        }
        return result;
    }
}
