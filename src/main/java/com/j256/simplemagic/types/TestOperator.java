package com.j256.simplemagic.types;

/**
 * Operators for tests. If no operator character then equals is assumed.
 */
public enum TestOperator {

    EQUALS('=') {

        @Override
        public boolean doTest(boolean unsignedType, Number extractedValue, Number testValue, NumberType numberType) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    NOT_EQUALS('!') {

        @Override
        public boolean doTest(boolean unsignedType, Number extractedValue, Number testValue, NumberType numberType) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    GREATER_THAN('>') {

        @Override
        public boolean doTest(boolean unsignedType, Number extractedValue, Number testValue, NumberType numberType) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    LESS_THAN('<') {

        @Override
        public boolean doTest(boolean unsignedType, Number extractedValue, Number testValue, NumberType numberType) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    AND_ALL_SET('&') {

        @Override
        public boolean doTest(boolean unsignedType, Number extractedValue, Number testValue, NumberType numberType) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    AND_ALL_CLEARED('^') {

        @Override
        public boolean doTest(boolean unsignedType, Number extractedValue, Number testValue, NumberType numberType) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ,
    NEGATE('~') {

        @Override
        public boolean doTest(boolean unsignedType, Number extractedValue, Number testValue, NumberType numberType) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ;

    // end
    /**
     * Default operator which should be used if {@link #fromTest(String)} returns null;
     */
    public static final TestOperator DEFAULT_OPERATOR = EQUALS;

    private final char prefixChar;

    private TestOperator(char prefixChar) {
        this.prefixChar = prefixChar;
    }

    /**
     * Perform the test using the operator.
     */
    public abstract boolean doTest(boolean unsignedType, Number extractedValue, Number testValue, NumberType numberType);

    /**
     * Returns the operator if the first character is an operator. Otherwise this returns null and you should use the
     * {@link #DEFAULT_OPERATOR}.
     *
     * <p>
     * <b>NOTE:</b> We _don't_ return the default operator here because the caller needs to know if the prefix was
     * supplied or not.
     * </p>
     */
    public static TestOperator fromTest(String testStr) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
