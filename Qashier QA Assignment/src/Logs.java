public class Logs {
    public static void logs(String action, long startTime, boolean success) {
        long endTime = System.currentTimeMillis();
        double executionTime = (endTime - startTime) / 1000.0;
        String status = success ? "PASS" : "FAIL";
        System.out.println(action + " - " + status + " - Execution time: " + executionTime + " seconds");
    }
}
