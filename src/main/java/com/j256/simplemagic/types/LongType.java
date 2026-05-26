package com.j256.simplemagic.types;

import com.j256.simplemagic.endian.EndianType;

/**
 * An eight-byte value constituted "quad" when the magic file spec was written.
 *
 * @author graywatson
 */
public class LongType extends BaseLongType {

    static final int BYTES_PER_LONG = 8;

    public LongType(EndianType endianType) {
        super(endianType);
    }

    /**
     * Return the number of bytes in this type.
     */
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

    /**
     * Static compare of longs which are unsigned or signed.
     */
    public static int staticCompare(Number extractedValue, Number testValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
