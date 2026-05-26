package com.j256.simplemagic.types;

/**
 * Some common pattern utilities used by multiple types.
 *
 * @author graywatson
 */
public class PatternUtils {

    /**
     * Pre-processes the pattern by handling backslash escapes such as \b and \007.
     */
    public static String preProcessPattern(String pattern) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static int radixCharsToChar(StringBuilder sb, String pattern, int pos, int maxLen, int radix) {
        int val = 0;
        int i = 0;
        for (; i < maxLen; i++) {
            if (pos + i >= pattern.length()) {
                break;
            }
            int digit = Character.digit(pattern.charAt(pos + i), radix);
            if (digit < 0) {
                break;
            }
            val = val * radix + digit;
        }
        if (i > 0) {
            sb.append((char) val);
        }
        return i;
    }
}
