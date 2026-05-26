package com.j256.simplemagic.logger.backend;

import com.j256.simplemagic.logger.Level;
import com.j256.simplemagic.logger.LogBackend;
import com.j256.simplemagic.logger.LogBackendFactory;

/**
 * Log backend that delegates to slf4j.
 *
 * From SimpleLogging: https://github.com/j256/simplelogging
 *
 * @author graywatson
 */
public class Slf4jLoggingLogBackend implements LogBackend {

    private final org.slf4j.Logger logger;

    public Slf4jLoggingLogBackend(org.slf4j.Logger logger) {
        this.logger = logger;
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
     * Factory for generating Slf4jLoggingLogBackend instances.
     */
    public static class Slf4jLoggingLogBackendFactory implements LogBackendFactory {

        private final org.slf4j.ILoggerFactory factory;

        public Slf4jLoggingLogBackendFactory() {
            this.factory = org.slf4j.LoggerFactory.getILoggerFactory();
        }

        @Override
        public boolean isAvailable() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public LogBackend createLogBackend(String classLabel) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
