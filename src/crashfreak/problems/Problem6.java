package crashfreak.problems;

import crashfreak.EulerProblem;

/**
 * The sum of the squares of the first ten natural numbers is,

 12 + 22 + ... + 102 = 385
 The square of the sum of the first ten natural numbers is,

 (1 + 2 + ... + 10)2 = 552 = 3025
 Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

 Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 *
 * SOLVED
 * @author Michael Cuthbert on 7/18/14.
 */
public class Problem6 extends EulerProblem {
    @Override
    public void run() {
        int sumOfSquares = 0;
        int squareOfSum = 0;
        for (int i = 1; i < 101; i++) {
            sumOfSquares += (i*i);
            squareOfSum += i;
        }
        squareOfSum *= squareOfSum;

        int ans = squareOfSum - sumOfSquares;
        answer(ans);
    }
}
