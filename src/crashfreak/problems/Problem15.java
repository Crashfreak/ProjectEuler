package crashfreak.problems;

import crashfreak.EulerProblem;

/**
 * This recursive function is correct, but gets super slow with larger grids
 * 20x20 takes 1846103ms (half an hour) = 137846528820
 * 15x15 takes 2490ms (2 seconds)
 * So it is O(n2)
 *
 * A mathematical solution, which will give the immediate answer is simply 40 choose 20
 *
 * @author Michael Cuthbert on 5/22/15.
 */
public class Problem15 extends EulerProblem {

    public static int maxX = 15;
    public static int maxY = 15;

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
    }

    @Override
    public void run() {
        answer(traverse(new Point(0, 0)));
    }

    public long traverse(Point point) {
        if (point.x == maxX && point.y == maxY) {
            return 1;
        } else if (point.x == maxX) {
            return traverse(point.moveDown());
        } else if (point.y == maxY) {
            return traverse(point.moveRight());
        } else {
            long right = traverse(point.moveRight());
            long left = traverse(point.moveDown());
            return right + left;
        }
    }
}
