package com.j256.simplemagic.types;

import com.j256.simplemagic.endian.EndianType;

/**
 * A four-byte integer value where the high bit of each byte is ignored.
 *
 * @author graywatson
 */
public class Id3LengthType extends IntegerType {

    public Id3LengthType(EndianType endianType) {
        super(endianType);
    }

    @Override
    public Object extractValueFromBytes(int offset, byte[] bytes, boolean required) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
