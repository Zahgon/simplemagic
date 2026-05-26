package com.j256.simplemagic.types;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.j256.simplemagic.entries.MagicFormatter;
import com.j256.simplemagic.entries.MagicMatcher;

/**
 * From the magic(5) man page: A regular expression match in extended POSIX regular expression syntax (like egrep).
 * Regular expressions can take exponential time to process, and their performance is hard to predict, so their use is
 * discouraged. When used in production environments, their performance should be carefully checked. The type
 * specification can be optionally followed by /[c][s]. The 'c' flag makes the match case insensitive, while the 's'
 * flag update the offset to the start offset of the match, rather than the end. The regular expression is tested
 * against line N + 1 onwards, where N is the given offset. Line endings are assumed to be in the machine's native
 * format. ^ and $ match the beginning and end of individual lines, respectively, not beginning and end of file.
 *
 * @author graywatson
 */
public class RegexType implements MagicMatcher {

    private final static Pattern TYPE_PATTERN = Pattern.compile("[^/]+(/[cs]*)?");

    private static final String EMPTY = "";

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

    private static class PatternInfo {

        int patternFlags;

        @SuppressWarnings("unused")
        boolean updateOffsetStart;

        Pattern pattern;
    }
}
