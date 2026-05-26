package com.j256.simplemagic.endian;

/**
 * Converts values in "little" endian-ness where the high-order bytes come _after_ the low-order (DCBA). x86 processors.
 *
 * @author graywatson
 */
public class LittleEndianConverter implements EndianConverter {

    LittleEndianConverter() {
        // only EndiaType should construct this
    }

    @Override
    public Long convertNumber(int offset, byte[] bytes, int size) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Long convertId3(int offset, byte[] bytes, int size) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public byte[] convertToByteArray(long value, int size) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private Long convertNumber(int offset, byte[] bytes, int size, int shift, int mask) {
        if (offset < 0 || offset + size > bytes.length) {
            return null;
        }
        long value = 0;
        for (int i = offset + (size - 1); i >= offset; i--) {
            value = value << shift | (bytes[i] & mask);
        }
        return value;
    }
}
