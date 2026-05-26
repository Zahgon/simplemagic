package com.j256.simplemagic.logger.backend;

import com.j256.simplemagic.logger.Level;
import com.j256.simplemagic.logger.LogBackend;
import com.j256.simplemagic.logger.LogBackendFactory;

/**
 * Log backend that delegating to the Apache commons logging classes.
 *
 * From SimpleLogging: https://github.com/j256/simplelogging
 *
 * @author graywatson
 */
public class CommonsLoggingLogBackend implements LogBackend {

    private final org.apache.commons.logging.Log log;

    public CommonsLoggingLogBackend(String className) {
        this.log = org.apache.commons.logging.LogFactory.getLog(className);
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
     * Factory for generating CommonsLoggingLogBackend instances.
     */
    public static class CommonsLoggingLogBackendFactory implements LogBackendFactory {

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
