package crashfreak.problems;

import crashfreak.EulerProblem;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

 a2 + b2 = c2
 For example, 32 + 42 = 9 + 16 = 25 = 52.

 There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 Find the product abc.
 *
 * @author Michael Cuthbert on 7/18/14.
 */
public class Problem9 extends EulerProblem {
    @Override
    public void run() {
        int a = 1;
        int b = 2;
        int c = 3;

        answer(Math.sqrt(1000));
    }
}
