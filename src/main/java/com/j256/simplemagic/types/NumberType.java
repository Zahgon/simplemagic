package com.j256.simplemagic.types;

import com.j256.simplemagic.endian.EndianConverter;
import com.j256.simplemagic.endian.EndianType;
import com.j256.simplemagic.entries.MagicFormatter;
import com.j256.simplemagic.entries.MagicMatcher;

/**
 * Base class for our numbers so we can do generic operations on them.
 *
 * @author graywatson
 */
public abstract class NumberType implements MagicMatcher {

    protected final EndianConverter endianConverter;

    public NumberType(EndianType endianType) {
        this.endianConverter = endianType.getConverter();
    }

    /**
     * Decode the test string value.
     */
    public abstract Number decodeValueString(String valueStr) throws NumberFormatException;

    /**
     * Return the number of bytes in this type.
     */
    public abstract int getBytesPerType();

    /**
     * Return -1 if extractedValue is &lt; testValue, 1 if it is &gt;, 0 if it is equals.
     */
    public abstract int compare(boolean unsignedType, Number extractedValue, Number testValue);

    /**
     * Return the value with the appropriate bytes masked off corresponding to the bytes in the type.
     */
    public abstract long maskValue(long value);

    @Override
    public Object convertTestString(String typeStr, String testStr) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Object extractValueFromBytes(int offset, byte[] bytes, boolean required) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Object isMatch(Object testValue, Long andValue, boolean unsignedType, Object extractedValue, MutableOffset mutableOffset, byte[] bytes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void renderValue(StringBuilder sb, Object extractedValue, MagicFormatter formatter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
