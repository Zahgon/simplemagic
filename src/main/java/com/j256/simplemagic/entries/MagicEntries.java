package com.j256.simplemagic.entries;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.j256.simplemagic.ContentInfo;
import com.j256.simplemagic.ContentInfoUtil.ErrorCallBack;
import com.j256.simplemagic.logger.Logger;
import com.j256.simplemagic.logger.LoggerFactory;

/**
 * Class which encompasses a set of entries and allows us to optimize their use.
 *
 * @author graywatson
 */
public class MagicEntries {

    private static final int MAX_LEVELS = 20;

    private static final int FIRST_BYTE_LIST_SIZE = 256;

    private static Logger logger = LoggerFactory.getLogger(MagicEntries.class);

    private final List<MagicEntry> entryList = new ArrayList<MagicEntry>();

    @SuppressWarnings("unchecked")
    private final List<MagicEntry>[] firstByteEntryLists = new ArrayList[FIRST_BYTE_LIST_SIZE];

    /**
     * Read the entries so later we can find matches with them.
     */
    public void readEntries(BufferedReader lineReader, ErrorCallBack errorCallBack) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Optimize the magic entries by removing the first-bytes information into their own lists
     */
    public void optimizeFirstBytes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Find and return a match for the associated bytes.
     */
    public ContentInfo findMatch(byte[] bytes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private ContentInfo findMatch(byte[] bytes, List<MagicEntry> entryList) {
        ContentInfo partialMatchInfo = null;
        for (MagicEntry entry : entryList) {
            ContentInfo info = entry.matchBytes(bytes);
            if (info == null) {
                continue;
            }
            if (!info.isPartial()) {
                // first non-partial wins
                logger.trace("found full match {}", entry);
                logger.trace("returning full match {}", info);
                return info;
            } else if (partialMatchInfo == null) {
                // first partial match may win
                logger.trace("found partial match {}", entry);
                partialMatchInfo = info;
                // continue to look for non-partial
            } else {
                // already have a partial match
            }
        }
        if (partialMatchInfo == null) {
            logger.trace("returning no match");
            return null;
        } else {
            // returning first partial match
            logger.trace("returning partial match {}", partialMatchInfo);
            return partialMatchInfo;
        }
    }
}
