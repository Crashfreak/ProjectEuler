package crashfreak.problems;

import crashfreak.EulerProblem;
import crashfreak.Utils;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

 What is the 10 001st prime number?
 *
 * SOLVED
 * @author Michael Cuthbert on 7/18/14.
 */
public class Problem7 extends EulerProblem {
    @Override
    public void run() {
        int primeNum = 6;
        int primeVal = 13;
        do {
            primeVal++;
            if (Utils.isPrime(primeVal)) {
                primeNum++;
            }
        } while (primeNum < 10001);
        answer(primeVal);
    }
}
