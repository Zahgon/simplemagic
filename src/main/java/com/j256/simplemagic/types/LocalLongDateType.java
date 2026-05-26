package com.j256.simplemagic.types;

import java.util.Date;
import com.j256.simplemagic.endian.EndianType;

/**
 * An 8-byte value interpreted as a UNIX-style date, but interpreted as local time rather than UTC.
 *
 * @author graywatson
 */
public class LocalLongDateType extends LocalDateType {

    private static final int BYTES_PER_LOCAL_LONG_DATE = 8;

    public LocalLongDateType(EndianType endianType) {
        super(endianType);
    }

    @Override
    protected Date dateFromExtractedValue(long val) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int getBytesPerType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
