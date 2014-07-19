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
        do {
            for (int i = 999; i >= 100; i--) {
                int palin = factor1 * i;
                //System.out.println(factor1 + " * " + i + " = " + palin);
                int reversePalin = Integer.parseInt(new StringBuilder(palin + "").reverse().toString());
                if (palin == reversePalin && palin > max) {
                    max = palin;
                }
            }
            factor1 -= 1;
        } while (factor1 > 99);
        answer(max);
    }
}
