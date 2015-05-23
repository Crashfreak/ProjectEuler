package crashfreak;

/**
 * @author Michael Cuthbert on 7/18/14.
 */
public class RunProblems {

    private static int defaultStartingProblem = 15;
    private static int defaultNumberOfProblems = 1;

    public static void main(String[] args) {
        try {
            int startingProblem = defaultStartingProblem;
            int numProbs = defaultStartingProblem + defaultNumberOfProblems;
            if (args.length > 1) {
                startingProblem = Integer.parseInt(args[0]);
                numProbs = Integer.parseInt(args[1]);
            }

            for (int i = startingProblem; i < numProbs; i++) {
                String className = "crashfreak.problems.Problem" + i;
                try {
                    Class clazz = Class.forName(className);
                    EulerProblem ep = (EulerProblem) clazz.newInstance();
                    ep.timedRun();
                } catch (ClassNotFoundException cnfe) {
                    System.out.println("No Problem " + i + " Skipping...");
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
