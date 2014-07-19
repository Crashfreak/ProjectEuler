package crashfreak;

/**
 * @author Michael Cuthbert on 7/18/14.
 */
public abstract class EulerProblem {

    public abstract void run();

    public void answer(Object ans) {
        String className = this.getClass().getSimpleName();
        System.out.println(className + " Answer : " + ans.toString());
    }
}
