package crashfreak.problems;

import crashfreak.EulerProblem;

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

 Find the largest palindrome made from the product of two 3-digit numbers.
 *
 * SOLVED
 * @author Michael Cuthbert on 7/18/14.
 */
public class Problem4 extends EulerProblem {
    @Override
    public void run() {
        int max = 0;
        int factor1 = 999;
        // This is just a pure brute force attempt, I am sure it could be optimized
        do {
            for (int i = 999; i >= 100; i--) {
                int palin = factor1 * i;
                String pStr = new StringBuilder(palin + "").reverse().toString();
                int reversePalin = Integer.parseInt(pStr);
                if (palin == reversePalin && palin > max && pStr.length() % 2 == 0) {
                    System.out.println(factor1 + " * " + i + " = " + palin);
                    max = palin;
                }
            }
            factor1 -= 1;
        } while (factor1 > 99);
        answer(max);
    }
}
