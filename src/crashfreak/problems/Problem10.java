package crashfreak.problems;

import crashfreak.EulerProblem;
import crashfreak.Utils;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

 Find the sum of all the primes below two million.
 *
 * Created by mgcuthbert on 5/16/2015.
 */
public class Problem10 extends EulerProblem {
    @Override
    public void run() {
        long sum = 0;
        for (long i = 2; i < 2000000; i++) {
            if (Utils.isPrime(i)) {
                //System.out.println(sum + " + " + i + " = " + (sum + i));
                sum += i;
            }
        }
        answer(sum);
    }
}
