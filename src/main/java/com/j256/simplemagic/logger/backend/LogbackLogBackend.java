package com.j256.simplemagic.logger.backend;

import com.j256.simplemagic.logger.Level;
import com.j256.simplemagic.logger.LogBackend;
import com.j256.simplemagic.logger.LogBackendFactory;

/**
 * Log backend that delegates to logback directly. The org.slf4j classes are part of the slf4j-api but not the actual
 * logger.
 *
 * From SimpleLogging: https://github.com/j256/simplelogging
 *
 * @author graywatson
 */
public class LogbackLogBackend implements LogBackend {

    private final ch.qos.logback.classic.Logger logger;

    public LogbackLogBackend(ch.qos.logback.classic.Logger logger) {
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
     * Factory for generating LogbackLogBackend instances.
     */
    public static class LogbackLogBackendFactory implements LogBackendFactory {

        private final ch.qos.logback.classic.LoggerContext loggerContext;

        public LogbackLogBackendFactory() {
            this.loggerContext = new ch.qos.logback.classic.LoggerContext();
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
