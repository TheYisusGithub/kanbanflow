package core.util;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * This class is used to generate logs.
 *
 * @author Jesus Menacho
 * @version 1.0
 */
public final class Log {
    private static final String LOG4J_PROPERTIES = "log4j.properties";
    private static Log instance;
    private static Logger log = Logger.getLogger(Log.class);

    /**
     * Private constructor for the Singleton pattern.
     */
    private Log() {
        initialize();
    }

    /**
     * This method initializes the logger characteristics.
     */
    public void initialize() {
        PropertyConfigurator.configure(LOG4J_PROPERTIES);
        log.setLevel(Level.ALL);
    }

    /**
     * This method ensures that only one instance is created according
     * to the builder pattern and returns a log instance.
     *
     * @return an 'instance' of Log.
     */
    public static Log getInstance() {
        if (instance == null) {
            instance = new Log();
        }
        return instance;
    }

    /**
     * This method returns a 'log' with which more loggers can be added.
     *
     * @return a 'log'.
     */
    public Logger getLog() {
        return log;
    }
}
