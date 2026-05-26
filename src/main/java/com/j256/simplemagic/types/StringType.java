package com.j256.simplemagic.types;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.j256.simplemagic.entries.MagicFormatter;
import com.j256.simplemagic.entries.MagicMatcher;

/**
 * From the magic(5) man page: A string of bytes. The string type specification can be optionally followed by /[Bbc]*.
 * The ``B'' flag compacts whitespace in the target, which must contain at least one whitespace character. If the magic
 * has n consecutive blanks, the target needs at least n consecutive blanks to match. The ``b'' flag treats every blank
 * in the target as an optional blank. Finally the ``c'' flag, specifies case insensitive matching: lower-case
 * characters in the magic match both lower and upper case characters in the target, whereas upper case characters in
 * the magic only match upper-case characters in the target.
 *
 * @author graywatson
 */
public class StringType implements MagicMatcher {

    private final static Pattern TYPE_PATTERN = Pattern.compile("[^/]+(/\\d+)?(/[BbcwWt]*)?");

    protected static final String EMPTY = "";

    @Override
    public Object convertTestString(String typeStr, String testStr) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Object extractValueFromBytes(int offset, byte[] bytes, boolean required) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Object isMatch(Object testValue, Long andValue, boolean unsignedType, Object extractedValue, MutableOffset mutableOffset, byte[] bytes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void renderValue(StringBuilder sb, Object extractedValue, MagicFormatter formatter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public byte[] getStartingBytes(Object testValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Find offset match either in an array of bytes or chars, which ever is not null.
     */
    protected String findOffsetMatch(TestInfo info, int startOffset, MutableOffset mutableOffset, final byte[] bytes, final char[] chars, final int maxPos) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private char charFromByte(byte[] bytes, int index) {
        return (char) (bytes[index] & 0xFF);
    }

    /**
     * Internal holder for test information about strings.
     */
    protected static class TestInfo {

        final StringOperator operator;

        final String pattern;

        final boolean compactWhiteSpace;

        final boolean optionalWhiteSpace;

        final boolean caseInsensitive;

        // ignored by the string type
        final int maxOffset;

        public TestInfo(StringOperator operator, String pattern, boolean compactWhiteSpace, boolean optionalWhiteSpace, boolean caseInsensitive, int maxOffset) {
            this.operator = operator;
            this.pattern = pattern;
            this.compactWhiteSpace = compactWhiteSpace;
            this.optionalWhiteSpace = optionalWhiteSpace;
            this.caseInsensitive = caseInsensitive;
            this.maxOffset = maxOffset;
        }

        /**
         * Get the bytes that start the pattern from an optimization standpoint.
         */
        public byte[] getStartingBytes() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public String toString() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
