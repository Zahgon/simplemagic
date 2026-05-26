package com.j256.simplemagic.types;

import com.j256.simplemagic.endian.EndianType;

/**
 * A 32-bit single precision IEEE floating point number in this machine's native byte order.
 *
 * @author graywatson
 */
public class FloatType extends DoubleType {

    private static final int BYTES_PER_FLOAT = 4;

    public FloatType(EndianType endianType) {
        super(endianType);
    }

    @Override
    public Number decodeValueString(String valueStr) throws NumberFormatException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int compare(boolean unsignedType, Number extractedValue, Number testValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    protected Object longToObject(Long value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int getBytesPerType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
