package com.j256.simplemagic.types;

import com.j256.simplemagic.endian.EndianType;

/**
 * A 64-bit double precision IEEE floating point number in this machine's native byte order.
 *
 * @author graywatson
 */
public class DoubleType extends NumberType {

    private static final int BYTES_PER_DOUBLE = 8;

    public DoubleType(EndianType endianType) {
        super(endianType);
    }

    @Override
    public Number decodeValueString(String valueStr) throws NumberFormatException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Object extractValueFromBytes(int offset, byte[] bytes, boolean required) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int compare(boolean unsignedType, Number extractedValue, Number testValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public byte[] getStartingBytes(Object testValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Convert a long to the type.
     */
    protected Object longToObject(Long value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public long maskValue(long value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Return the number of bytes in this type.
     */
    @Override
    public int getBytesPerType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
