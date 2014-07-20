package crashfreak;

/**
 * @author Michael Cuthbert on 7/18/14.
 */
public abstract class EulerProblem {

    protected long start = 0;
    protected long timeTaken = 0;

    public void timedRun() {
        start = System.currentTimeMillis();
        run();
    }

    public abstract void run();

    public void answer(Object ans) {
        timeTaken = System.currentTimeMillis() - start;
        String className = this.getClass().getSimpleName();
        System.out.println(className + " Answer : " + ans.toString() + " in " + timeTaken + " ms");
    }
}
