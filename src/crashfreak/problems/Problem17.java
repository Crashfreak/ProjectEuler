package crashfreak.problems;

import crashfreak.EulerProblem;

import java.util.HashMap;
import java.util.Map;

/**
 * Not sure why this isn't working, will look into it later
 *
 *
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

 If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?


 NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
 *
 * @author Michael Cuthbert on 5/22/15.
 */
public class Problem17 extends EulerProblem {
    private static Map<Integer, Integer> numbers = new HashMap<Integer, Integer>();
    static {
        numbers.put(0, 0);
        numbers.put(1, "one".length()); //one
        numbers.put(2, "two".length()); //two
        numbers.put(3, "three".length()); //three
        numbers.put(4, "four".length());
        numbers.put(5, "five".length());
        numbers.put(6, "six".length());
        numbers.put(7, "seven".length());
        numbers.put(8, "eight".length());
        numbers.put(9, "nine".length());
        numbers.put(10, "ten".length());
        numbers.put(11, "eleven".length());
        numbers.put(12, "twelve".length());
        numbers.put(13, "thirteen".length());
        numbers.put(14, "fourteen".length());
        numbers.put(15, "fifteen".length());
        numbers.put(20, "twen".length());
        numbers.put(30, "thir".length());
        numbers.put(40, "for".length());
        numbers.put(50, "fif".length());
        numbers.put(60, "six".length());
        numbers.put(70, "seven".length());
        numbers.put(80, "eigh".length());
        numbers.put(90, "nine".length());
    }

    public static int getNumberValue(int i) {
        StringBuffer debug = new StringBuffer("|Number:"+i);
        int currentVal = 0;
        if (i >= 100) {
            currentVal += 7;
            int hundreds = i / 100;
            debug.append("|Hundreds:"+hundreds);
            currentVal += numbers.get(hundreds);
            i = i % 100;
            if (i > 0) currentVal += 3;
            debug.append("|Less:"+i);
        }
        if (i < 16) {
            currentVal += numbers.get(i);
        } else if (i >= 16 && i < 20) {
            currentVal += 4 + numbers.get(i % 10); // 4 for teen
        } else {
            int modVal = i % 10;
            debug.append("|Mod:" + modVal);
            currentVal += 2 + numbers.get(modVal); // 2 for ty
            currentVal += numbers.get(i - (modVal));
        }
        System.out.println(debug.toString() + "|CurrentVal:"+currentVal);
        return currentVal;
    }

    @Override
    public void run() {
        int total = 0;
        for (int i = 1; i < 1000; i++) {
            total += getNumberValue(i);
        }
        total += 11; // for "one thousand"
        answer(total);
    }
}
