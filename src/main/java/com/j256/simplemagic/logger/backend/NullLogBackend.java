package com.j256.simplemagic.logger.backend;

import com.j256.simplemagic.logger.Level;
import com.j256.simplemagic.logger.LogBackend;
import com.j256.simplemagic.logger.LogBackendFactory;

/**
 * Log backend that ignores all log requests.
 *
 * From SimpleLogging: https://github.com/j256/simplelogging
 *
 * @author graywatson
 */
public class NullLogBackend implements LogBackend {

    public NullLogBackend() {
        // no-op
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
     * Factory for generating NullLogBackend instances. This can be used with the
     * LoggerFactory.setLogBackendFactory(LogBackendFactory) method to completely disable all logging.
     */
    public static class NullLogBackendFactory implements LogBackendFactory {

        private static final NullLogBackendFactory singletonFactory = new NullLogBackendFactory();

        private static final NullLogBackend singletonBackend = new NullLogBackend();

        /**
         * Return singleton of our factory.
         */
        public static NullLogBackendFactory getSingleton() {
            throw new UnsupportedOperationException("STUB: not implemented");
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
