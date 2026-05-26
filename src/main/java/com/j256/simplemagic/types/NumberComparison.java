package com.j256.simplemagic.types;

/**
 * Internal class that compares a number from the bytes with the value from the magic rule.
 */
public class NumberComparison {

    private final NumberType numberType;

    private final TestOperator operator;

    private final Number value;

    /**
     * Pre-process the test string into an operator and a value.
     */
    public NumberComparison(NumberType numberType, String testStr) {
        this.numberType = numberType;
        TestOperator op = TestOperator.fromTest(testStr);
        String valueStr;
        if (op == null) {
            op = TestOperator.DEFAULT_OPERATOR;
            valueStr = testStr;
        } else {
            valueStr = testStr.substring(1).trim();
        }
        this.operator = op;
        try {
            this.value = numberType.decodeValueString(valueStr);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Could not parse number from: '" + valueStr + "'");
        }
    }

    public boolean isMatch(Long andValue, boolean unsignedType, Number extractedValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Number getValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
