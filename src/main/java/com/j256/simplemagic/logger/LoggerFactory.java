package com.j256.simplemagic.logger;

import java.util.Arrays;
import com.j256.simplemagic.logger.backend.NullLogBackend.NullLogBackendFactory;

/**
 * Factory that creates {@link Logger} and {@link FluentLogger} instances. It uses reflection to see what logging
 * backends are available on the classpath and tries to find the most appropriate one.
 *
 * From SimpleLogging: https://github.com/j256/simplelogging
 *
 * <p>
 * To set the logger to a particular type, set the system property ("com.j256.simplelogger.backend") contained in to be
 * name of one of the enumerated types in {@link LogBackendType}. You can also call
 * {@link LoggerFactory#setLogBackendType(LogBackendType)} or
 * {@link LoggerFactory#setLogBackendFactory(LogBackendFactory)} if you want to set it to a particular class which can
 * be a custom backend.
 * </p>
 */
public class LoggerFactory {

    private static LogBackendFactory logBackendFactory;

    private LoggerFactory() {
        // only here for static usage
    }

    static {
        PropertyUtils.assignGlobalLevelFromProperty(LogBackendType.NULL);
        // system property overrides property setting
        maybeAssignGlobalLogLevelFromProperty();
    }

    /**
     * Return a logger associated with a particular class.
     */
    public static Logger getLogger(Class<?> clazz) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Return a logger associated with a particular class name.
     */
    public static Logger getLogger(String className) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Return a fluent logger associated with a particular class.
     */
    public static FluentLogger getFluentLogger(Class<?> clazz) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Return a fluent logger associated with a particular class name.
     */
    public static FluentLogger getFluentLogger(String className) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Get the currently assigned log factory or null if none.
     */
    public static LogBackendFactory getLogBackendFactory() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Set the log backend factory to be a specific instance. This allows you to easily redirect log messages to your
     * own {@link LogBackendFactory} implementation.
     */
    public static void setLogBackendFactory(LogBackendFactory LogBackendFactory) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Set the log backend type to be a specific enum type. This will throw an exception if the classes involved with
     * the type are not available from the classpath.
     *
     * @throws IllegalArgumentException
     *             If the logging type is not available, most likely because classes are missing from the classpath.
     */
    public static void setLogBackendType(LogBackendType type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Maybe assign the global log level based on the system property. Exposed for testing purposes.
     */
    static void maybeAssignGlobalLogLevelFromProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Return the most appropriate log backend factory. This should _never_ return null. Exposed for testing.
     */
    static LogBackendFactory findLogBackendFactory() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static LogBackendFactory constructFactoryFromProperty(LogBackendFactory defaultBackendFactory, String label, String value) {
        if (value == null) {
            return null;
        }
        try {
            // first we see if the log-type is an enum value
            return LogBackendType.valueOf(value);
        } catch (IllegalArgumentException iae) {
            // next we see if it is factory class
            LogBackendFactory factory = constructFactoryFromClassName(defaultBackendFactory, label, value);
            if (factory != null) {
                return factory;
            }
            LogBackend backend = defaultBackendFactory.createLogBackend(LoggerFactory.class.getName());
            backend.log(Level.WARNING, "Could not find valid log-type from " + label + ", value '" + value + "' not one of " + Arrays.toString(LogBackendType.values()) + " nor a class name that implements LogBackendFactory");
            return null;
        }
    }

    /**
     * See if the log-type-name is a class name of a factory. If so then construct it and return it.
     */
    private static LogBackendFactory constructFactoryFromClassName(LogBackendFactory defaultBackendFactory, String label, String logTypeString) {
        // next we see if it is factory class
        Class<?> clazz;
        try {
            clazz = Class.forName(logTypeString);
        } catch (ClassNotFoundException cnfe) {
            // probably not a class name so ignore the exception
            return null;
        }
        if (!LogBackendFactory.class.isAssignableFrom(clazz)) {
            LogBackend backend = defaultBackendFactory.createLogBackend(LoggerFactory.class.getName());
            backend.log(Level.WARNING, "Was expecting the name of a class that implements LogBackendFactory from " + label + ", value '" + logTypeString + "'");
            return null;
        }
        try {
            // construct the factory by calling the no-arg contructor
            Object instance = clazz.newInstance();
            return (LogBackendFactory) instance;
        } catch (Exception e) {
            LogBackend backend = defaultBackendFactory.createLogBackend(LoggerFactory.class.getName());
            backend.log(Level.WARNING, "Could not construct an instance of class from " + label + ", value '" + logTypeString + "'", e);
            return null;
        }
    }

    private static LogBackendFactory chooseDefaultBackendFactory(LogBackendFactory[] discoveryOrder) {
        for (LogBackendFactory logType : discoveryOrder) {
            if (logType.isAvailable()) {
                return logType;
            }
        }
        // fall back is always LOCAL
        return LogBackendType.LOCAL;
    }
}
