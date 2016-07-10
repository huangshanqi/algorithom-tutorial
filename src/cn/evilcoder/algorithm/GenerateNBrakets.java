package cn.evilcoder.algorithm;

import java.util.ArrayList;

/**
 * Created by huangshanqi on 2016/7/10.
 */
public class GenerateNBrakets {

    /**
     * 生成N对括号的可用组合
     * @param count 括号的数目
     * @return A list of available brackets seq.
     */
    public static ArrayList<String> generateNBrackets(int count) {
        ArrayList<String> result = new ArrayList<>();
        if (count > 0) {
            char[] seq = new char[2 * count];
            addParentheses(result, count, count, seq, 0);
        }
        return result;
    }

    private static void addParentheses(ArrayList<String> result, int left, int right, char[] seq, int index) {
        // 可用的左括号比有括号多，那么之前添加的肯定是错了
        if (left > right || left < 0) {
            return;
        }
        if (left == 0 && right == 0) {
            // It's an available parentheses seq
            result.add(String.copyValueOf(seq));
        } else {
            if (left > 0) {
                seq[index] = '(';
                addParentheses(result, left - 1, right, seq, index + 1);
            }

            if (right > left) {
                seq[index] = ')';
                addParentheses(result, left, right - 1, seq, index + 1);
            }
        }
    }
}
