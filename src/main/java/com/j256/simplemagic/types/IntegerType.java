package com.j256.simplemagic.types;

import com.j256.simplemagic.endian.EndianType;

/**
 * A four-byte integer value which often handles the "long" types when the spec was written.
 *
 * @author graywatson
 */
public class IntegerType extends BaseLongType {

    private static final int BYTES_PER_INTEGER = 4;

    public IntegerType(EndianType endianType) {
        super(endianType);
    }

    @Override
    public int getBytesPerType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public long maskValue(long value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int compare(boolean unsignedType, Number extractedValue, Number testValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
