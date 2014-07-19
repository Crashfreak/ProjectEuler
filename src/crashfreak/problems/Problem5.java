package crashfreak.problems;

import crashfreak.EulerProblem;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

 What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 *
 * SOLVED
 * @author Michael Cuthbert on 7/18/14.
 */
public class Problem5 extends EulerProblem {
    @Override
    public void run() {
        int smallest = 21;
        do {
            int i = 1;
            for (; i < 21; i++) {
                if (smallest % i != 0) break;
            }
            if (i == 21) {
                answer(smallest);
                return;
            }
            smallest++;
        } while (true);
    }
}
