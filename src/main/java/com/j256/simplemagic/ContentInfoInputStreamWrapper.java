package com.j256.simplemagic;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/**
 * Class which wraps and delegates to another {@link InputStream}. This allows you to read from an input stream and then
 * after you are done, call {@link #findMatch()} to determine the content-type information of the bytes read.
 *
 * <p>
 * <b> NOTE: </b> This keeps a buffer of the first {@link ContentInfoUtil#DEFAULT_READ_SIZE} (maybe 10k) bytes read or
 * skipped to determine the content-type of the bytes read.
 * </p>
 *
 * @author graywatson
 */
public class ContentInfoInputStreamWrapper extends InputStream {

    private final InputStream delegate;

    private final ContentInfoUtil contentInfoUtil;

    private final byte[] firstBytes = new byte[ContentInfoUtil.DEFAULT_READ_SIZE];

    private int byteCount;

    private static ContentInfoUtil staticContentInfoUtil;

    /**
     * Create a stream wrapper while specifying your own ContentInfoUtil.
     */
    public ContentInfoInputStreamWrapper(InputStream delegate, ContentInfoUtil contentInfoUtil) {
        this.delegate = delegate;
        this.contentInfoUtil = contentInfoUtil;
    }

    /**
     * Create a stream wrapper while using the internal, static ContentInfoUtil.
     */
    public ContentInfoInputStreamWrapper(InputStream delegate) {
        this(delegate, getStaticContentInfoUtil());
    }

    /**
     * Find a match from the bytes that have been read from the stream using {@link ContentInfoUtil#findMatch(byte[])}.
     */
    public ContentInfo findMatch() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int available() throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int read() throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public long skip(long skipNum) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void close() throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void mark(int readlimit) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void reset() throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean markSupported() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static synchronized ContentInfoUtil getStaticContentInfoUtil() {
        if (staticContentInfoUtil == null) {
            staticContentInfoUtil = new ContentInfoUtil();
        }
        return staticContentInfoUtil;
    }
}
