package com.j256.simplemagic.logger.backend;

import com.j256.simplemagic.logger.Level;
import com.j256.simplemagic.logger.LogBackend;
import com.j256.simplemagic.logger.LogBackendFactory;

/**
 * Log backend that writes to the console.
 *
 * From SimpleLogging: https://github.com/j256/simplelogging
 *
 * @author graywatson
 */
public class ConsoleLogBackend implements LogBackend {

    private static final String LINE_SEPARATOR = System.lineSeparator();

    private static final Level SYSTEM_ERROR_LEVEL = Level.WARNING;

    private String className;

    public ConsoleLogBackend(String className) {
        this.className = className;
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
    public void log(Level level, String msg, Throwable throwable) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Factory for generating ConsoleLogBackend instances.
     */
    public static class ConsoleLogBackendFactory implements LogBackendFactory {

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
