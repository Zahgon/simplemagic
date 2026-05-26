package com.j256.simplemagic.logger;

import java.util.Arrays;

/**
 * Fluent-context implementation that records the message, throwable, and/or associated arguments and calls through to
 * {@link BaseLogger} to write out the message when the {@link #log()} method is called.
 *
 * From SimpleLogging: https://github.com/j256/simplelogging
 *
 * @author graywatson
 */
public class FluentContextImpl implements FluentContext {

    private final static int DEFAULT_NUM_ARGS = 4;

    final static String JUST_THROWABLE_MESSAGE = "throwable";

    private final FluentLogger logger;

    private final Level level;

    private String msg;

    /**
     * message builder only used if {@link #appendMsg(String)} is called
     */
    private StringBuilder msgBuilder;

    private Throwable throwable;

    private Object[] args;

    private int argCount;

    public FluentContextImpl(FluentLogger logger, Level level) {
        this.logger = logger;
        this.level = level;
    }

    @Override
    public FluentContext msg(String msg) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public FluentContext appendMsg(String msgSuffix) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public FluentContext throwable(Throwable throwable) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public FluentContext arg(Object arg) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public FluentContext arg(boolean arg) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public FluentContext arg(byte arg) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public FluentContext arg(char arg) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public FluentContext arg(short arg) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public FluentContext arg(int arg) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public FluentContext arg(long arg) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public FluentContext arg(float arg) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public FluentContext arg(double arg) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public FluentContext args(Object[] addArgs) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void log() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private void addArg(Object arg) {
        if (args == null) {
            args = new Object[DEFAULT_NUM_ARGS];
        } else {
            // whenever we grow the array we double it
            maybeGrowArgs(argCount + 1, args.length * 2);
        }
        args[argCount++] = arg;
    }

    /**
     * Maybe grow our args array if the new-length is more than the args.length.
     */
    private void maybeGrowArgs(int neededLength, int growToLength) {
        if (neededLength > args.length) {
            args = Arrays.copyOf(args, growToLength);
        }
    }
}
