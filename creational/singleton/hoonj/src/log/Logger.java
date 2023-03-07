package log;

public class Logger {

    private String logColor;
    private static String staticLogColor;

    public void log(String message) {
        System.out.println(logColor + message + "\u001B[0m");
    }

    public static void staticLog(String message) {
        System.out.println(staticLogColor + message);
    }

    public static void setStaticLogColor(String staticLogColor) {
        Logger.staticLogColor = staticLogColor;
    }

    public void setLogColor(String logColor) {
        this.logColor = logColor;
    }
}