package log;

public enum SingletonLogger {
    INFO("\u001B[37m"),
    WARNING("\u001B[43m\u001B[30m"),
    ERROR("\u001B[41m");

    private String logColor;

    SingletonLogger(String logColor) {
        this.logColor = logColor;
    }

    public void log(String message){
        System.out.println(logColor + message + "\u001B[0m");
    }


}
