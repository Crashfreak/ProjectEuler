package crashfreak.problems;

import crashfreak.EulerProblem;
import crashfreak.Utils;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.

 What is the largest prime factor of the number 600851475143 ?
 *
 * SOLVED
 * @author Michael Cuthbert on 7/18/14.
 */
public class Problem3 extends EulerProblem {
    @Override
    public void run() {
        double maxFactor = 0;
        for (double i = Math.ceil(Math.sqrt(600851475142L)); i > 29; i--) {
            if (600851475143L % i == 0 && Utils.isPrime(i)) {
                maxFactor = i;
                break;
            }
        }
        answer(maxFactor);
    }
}
