package crashfreak.problems;

import crashfreak.EulerProblem;

import java.util.Hashtable;
import java.util.Map;

/**
 * This recursive function is correct, but gets super slow with larger grids
 * 20x20 takes 1846103ms (half an hour) = 137846528820
 * 15x15 takes 2490ms (2 seconds)
 * So it is O(n2)
 *
 * Cleaned up the code, but leaving the original comment so as to show the difference
 * In the new version the 20x20, in now takes 6ms so big improvement by adding caching.
 * This updated solution was taken from http://stackoverflow.com/questions/2200236/project-euler-15
 *
 * A mathematical solution, which will give the immediate answer is simply 40 choose 20
 *
 * @author Michael Cuthbert on 5/22/15.
 */
public class Problem15 extends EulerProblem {

    public static int maxX = 20;
    public static int maxY = 20;

    static Map<String, Long> pathsByBlock = new Hashtable<String, Long>();

    class Point {
        public int x;
        public int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Point moveRight() {
            return new Point(x+1, y);
        }

        public Point moveDown() {
            return new Point(x, y+1);
        }

        public long surfaceArea() { return (maxX - x) * (maxY - y); }
    }

    @Override
    public void run() {
        answer(traverse(new Point(0, 0)));
    }

    public long traverse(Point point) {
        if (point.surfaceArea() == 0) {
            return 1;
        }
        long i = 0;

        String block = (maxX - point.x) + "x" + (maxY - point.y) + "y";
        if (!pathsByBlock.containsKey(block)) {
            if (point.x < maxX) {
                i += traverse(point.moveDown());
            }
            if (point.y < maxY) {
                i += traverse(point.moveRight());
            }
            pathsByBlock.put(block, i);
        }

        return pathsByBlock.get(block);
    }
}
