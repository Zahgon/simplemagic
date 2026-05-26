package com.j256.simplemagic.types;

/**
 * A Pascal-style string where the first byte is interpreted as the an unsigned length. The string is not '\0'
 * terminated.
 *
 * @author graywatson
 */
public class PStringType extends StringType {

    /**
     * Extracted value is the extracted string using the first byte as the length.
     */
    @Override
    public Object extractValueFromBytes(int offset, byte[] bytes, boolean required) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Object isMatch(Object testValue, Long andValue, boolean unsignedType, Object extractedValue, MutableOffset mutableOffset, byte[] bytes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
