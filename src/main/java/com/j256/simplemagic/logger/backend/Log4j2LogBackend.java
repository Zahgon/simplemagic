package com.j256.simplemagic.logger.backend;

import com.j256.simplemagic.logger.Level;
import com.j256.simplemagic.logger.LogBackend;
import com.j256.simplemagic.logger.LogBackendFactory;

/**
 * Log backend that delegates to Apache Log4j2.
 *
 * From SimpleLogging: https://github.com/j256/simplelogging
 *
 * @author graywatson
 */
public class Log4j2LogBackend implements LogBackend {

    private final org.apache.logging.log4j.Logger logger;

    public Log4j2LogBackend(String className) {
        this.logger = org.apache.logging.log4j.LogManager.getLogger(className);
    }

    @Override
    public boolean isLevelEnabled(Level level) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void log(Level level, String msg) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void log(Level level, String msg, Throwable t) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Factory for generating Log4j2LogBackend instances.
     */
    public static class Log4j2LogBackendFactory implements LogBackendFactory {

        private final String loggerNamePrefix;

        public Log4j2LogBackendFactory() {
            this.loggerNamePrefix = null;
        }

        @Override
        public boolean isAvailable() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Log4j2LogBackendFactory(String loggerNamePrefix) {
            // this is used by the log4j reflection class to show if it is log4j or log4j2
            this.loggerNamePrefix = loggerNamePrefix;
        }

        @Override
        public LogBackend createLogBackend(String classLabel) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
