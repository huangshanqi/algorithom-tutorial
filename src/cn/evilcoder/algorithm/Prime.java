package cn.evilcoder.algorithm;

import java.util.Arrays;

/**
 * 素数
 * Created by huangshanqi on 2016/7/10.
 * See more at <a href = "http://www.evilcoder.cn">www.evilcoder.cn</a>
 */
public class Prime {

    /**
     * 判断num是否是素数
     * @param num
     * @return
     */
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 埃拉托斯特尼筛法数组法判断是否是素数
     * @param num
     * @return
     */
    public static boolean isPrimeWithSieveOfEratosthenes(int num) {
        boolean[] prime = sieveOfEratosthenes(num);
        return prime[num];
    }

    /**
     * 埃拉托斯特尼筛法
     * @param max
     * @return
     */
    private static boolean[] sieveOfEratosthenes(int max) {
        boolean[] prime = new boolean[max + 1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        int nextPrime = 2;
        while (nextPrime <= max) {
            setPrimeMutiple(prime, nextPrime);
            nextPrime = getNextPrime(prime, nextPrime);
            if (nextPrime > prime.length) {
                break;
            }
        }
        return prime;
    }

    private static int getNextPrime(boolean[] prime, int nextPrime) {
        nextPrime += 1;
        while (nextPrime < prime.length && !prime[nextPrime]) {
            nextPrime++;
        }
        return nextPrime;
    }

    /**
     * 将nextPrime 的倍数肯定 不是素数
     * @param prime
     * @param nextPrime
     */
    private static void setPrimeMutiple(boolean[] prime, int nextPrime) {
        for (int i = nextPrime * nextPrime; i < prime.length; i += nextPrime) {
            prime[i] = false;
        }
    }

}
