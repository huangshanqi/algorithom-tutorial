package cn.evilcoder.algorithm;

/**
 * 最大公约数
 * Created by huangshanqi on 2016/1/1.
 */
public class Gcd {

    /**
     * 辗转相除法.
     * x = ky + b.
     * f(x, y) = f(y, b) = f(y, x%y)
     * @param x
     * @param y
     * @return
     */
    public static int gcdByMod(int x, int y) {
        return y == 0 ? x : gcdByMod(y, x % y);
    }

    public static int gcdByPrimeOf2(int x, int y) {
        if (y > x) {
            return gcdByPrimeOf2(y, x);
        }
        if (y == 0) {
            return x;
        }
        boolean xEven = (x & 1) == 0;
        boolean yEven = (y & 1) == 0;
        if (xEven && yEven) {
            return 2 * gcdByPrimeOf2(x >> 1, y >> 1);
        } else if (xEven) {
            return gcdByPrimeOf2(x >> 1, y);
        } else if (yEven) {
            return gcdByPrimeOf2(x, y >> 1);
        } else {
            return gcdByPrimeOf2(y, x -y);
        }
    }
}
