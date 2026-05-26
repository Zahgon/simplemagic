package com.j256.simplemagic.types;

import com.j256.simplemagic.endian.EndianType;

/**
 * A two-byte value.
 *
 * @author graywatson
 */
public class ShortType extends BaseLongType {

    private static final int BYTES_PER_SHORT = 2;

    public ShortType(EndianType endianType) {
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
