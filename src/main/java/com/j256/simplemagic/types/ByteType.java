package com.j256.simplemagic.types;

import com.j256.simplemagic.endian.EndianType;

/**
 * A one-byte value.
 *
 * @author graywatson
 */
public class ByteType extends BaseLongType {

    public ByteType() {
        // we don't care about byte order since we only process 1 byte at a time
        super(EndianType.NATIVE);
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
