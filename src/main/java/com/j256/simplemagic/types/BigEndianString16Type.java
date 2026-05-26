package com.j256.simplemagic.types;

/**
 * A two-byte unicode (UCS16) string in big-endian byte order.
 *
 * @author graywatson
 */
public class BigEndianString16Type extends StringType {

    @Override
    public Object extractValueFromBytes(int offset, byte[] bytes, boolean required) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Object isMatch(Object testValue, Long andValue, boolean unsignedType, Object extractedValue, MutableOffset mutableOffset, byte[] bytes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Convert 2 bytes into a character.
     */
    protected char bytesToChar(int firstByte, int secondByte) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
