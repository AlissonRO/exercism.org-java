public class LogLine {
    private final String logLevelCode;
    private final String logMsg;

    public LogLine(String logLine) {
        String[] parts = logLine.split("]:");
        this.logLevelCode = parts[0].replace("[", "").trim();
        this.logMsg = parts[1].trim();
    }

    public LogLevel getLogLevel() {
        return switch (logLevelCode){
            case "TRC" -> LogLevel.TRACE;
            case "DBG" -> LogLevel.DEBUG;
            case "INF" -> LogLevel.INFO;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL;
            default -> LogLevel.UNKNOWN;
        };
    }

    public String getOutputForShortLog() {
        return String.format("%d:%s", getLogLevel().getShortLog(), logMsg);
    }
}
