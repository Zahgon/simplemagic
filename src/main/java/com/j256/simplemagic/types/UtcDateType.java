package com.j256.simplemagic.types;

import java.text.DateFormat;
import java.util.Date;
import java.util.TimeZone;
import com.j256.simplemagic.endian.EndianType;

/**
 * A 4-byte value interpreted as a UNIX date in UTC timezone.
 *
 * @author graywatson
 */
public class UtcDateType extends LocalDateType {

    private static final TimeZone UTC_TIME_ZONE = TimeZone.getTimeZone("UTC");

    public UtcDateType(EndianType endianType) {
        super(endianType);
    }

    @Override
    protected Date dateFromExtractedValue(long val) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    protected void assisgnTimeZone(DateFormat format) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
