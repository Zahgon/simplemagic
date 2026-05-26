package com.j256.simplemagic.logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Utility class for dealing with the optional simplelogging properties file.
 *
 * From SimpleLogging: https://github.com/j256/simplelogging
 *
 * @author graywatson
 */
public class PropertyUtils {

    // properties that can be set
    static final String BACKEND_TYPE_CLASS_PROPERTY = "backend";

    static final String DISCOVERY_ORDER_PROPERTY = "dicovery.order";

    static final String GLOBAL_LEVEL_PROPERTY = "global.level";

    static final String LOCAL_LOG_PROPERTY_PREFIX = "locallog.";

    // other constants
    static final String GLOBAL_LEVEL_NULL_VALUE = "NULL";

    private static volatile List<String[]> propertyEntries;

    /**
     * properties path that we will read from, exposed for testing purposes
     */
    private static InputStream propertiesInputStream;

    /**
     * Read the backend property from the properties file returning the backend type or null if none.
     */
    public static String readBackendTypeClassProperty(LogBackendFactory defaultBackendFactory) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Read the backend type order property from the properties file. Returns null if none.
     */
    public static LogBackendType[] readDiscoveryOrderProperty(LogBackendFactory defaultBackendFactory) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Process a list of the discovery order backend types (enum names) and return them as an array.
     *
     * @return null if none configured.
     */
    static LogBackendType[] processDiscoveryOrderValue(String value, LogBackendFactory defaultBackendFactory) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Read the global level property from the properties file if available and call
     * {@link Logger#setGlobalLogLevel(Level)} if available.
     */
    public static void assignGlobalLevelFromProperty(LogBackendFactory defaultBackendFactory) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Read the local log level patterns for the loggers or null if none.
     */
    public static List<PatternLevel> readLocalLogPatterns(LogBackendFactory defaultBackendFactory) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * For testing purposes.
     */
    public static void setPropertiesInputStream(InputStream propertiesInputStream) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static List<String[]> getProperties(LogBackendFactory defaultBackend) {
        if (propertyEntries == null) {
            propertyEntries = readPropertiesFile(defaultBackend);
        }
        return propertyEntries;
    }

    /**
     * Clear the loaded properties. Here for testing purposes.
     */
    static void clearProperties() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Read in the properties.
     */
    static List<String[]> readPropertiesFile(LogBackendFactory defaultBackendFactory) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static String trimString(String str) {
        if (str == null || str.isEmpty()) {
            // may not get here but let's be careful out there
            return str;
        } else {
            return str.trim();
        }
    }

    private static void logWarning(LogBackendFactory defaultBackendFactory, String msg, Throwable th) {
        LogBackend backend = defaultBackendFactory.createLogBackend(PropertyUtils.class.getName());
        if (th == null) {
            backend.log(Level.WARNING, msg);
        } else {
            backend.log(Level.WARNING, msg, th);
        }
    }

    /**
     * Holder for the regex pattern and the associated level.
     */
    public static class PatternLevel {

        private final Pattern pattern;

        private final Level level;

        public PatternLevel(Pattern pattern, Level level) {
            this.pattern = pattern;
            this.level = level;
        }

        public Pattern getPattern() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Level getLevel() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
