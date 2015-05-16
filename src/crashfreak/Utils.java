package crashfreak;

/**
 * @author Michael Cuthbert on 7/18/14.
 */
public class Utils {

    public static boolean isPrime(double value) {
        if (value == 2) {
            return true;
        }
        Double midway = Math.sqrt(value);
        for (double i = 2; i <= midway; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
}
