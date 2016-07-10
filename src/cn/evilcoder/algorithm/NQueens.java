package cn.evilcoder.algorithm;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * N 皇后问题
 * Created by huangshanqi on 2016/7/10.
 */
public class NQueens {

    public static ArrayList<Integer[]> generateNQueens(int n) {
        Integer[] columns = new Integer[n];
        ArrayList<Integer[]> result = new ArrayList<>();
        placeQueens(0, columns, result);
        return result;
    }

    private static void placeQueens(int row, Integer[] columns, ArrayList<Integer[]> result) {
        if (row == columns.length) {
            Integer[] temp = new Integer[columns.length];
            System.arraycopy(columns, 0, temp, 0, columns.length);
            result.add(temp);
        } else {
            for (int col = 0; col < columns.length ;col++) {
                if (check(columns, row, col)) {
                    columns[row] = col;
                    placeQueens(row + 1, columns, result);
                }
            }
        }
    }

    private static boolean check(Integer[] columns, int row, int col) {
        for (int row2 = 0; row2 < row; row2++) {
            int column2 = columns[row2];
            if (col == column2) {
                return false;
            }
            if (row - row2 == Math.abs(col - column2)) {
                return false;
            }
        }
        return true;
    }


}
