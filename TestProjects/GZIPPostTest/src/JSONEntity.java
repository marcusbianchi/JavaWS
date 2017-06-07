
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;

import org.apache.http.entity.AbstractHttpEntity;
import org.json.JSONObject;



public class JSONEntity extends AbstractHttpEntity implements Cloneable {
    protected final byte[] content;
    protected final int length;

    public JSONEntity(JSONObject jsonObject) {
        this(jsonObject, false);
    }

    public JSONEntity(JSONObject jsonObject, boolean deflate) {
        setContentType("application/json");
        

        final byte[] bytes = jsonObject.toString().getBytes();
        if (deflate) {
            ByteBufferOutputStream bbos =
                new ByteBufferOutputStream(Math.max(512, bytes.length / 2));
            DeflaterOutputStream deflater = new DeflaterOutputStream(bbos);
            try {
                deflater.write(bytes);
                deflater.close();
            } catch (IOException e) {
                content = bytes;
                length = bytes.length;
                return;
            }
            content = bbos.getBuffer();
            length = bbos.size();
            setContentEncoding("gzip");
        } else {
            content = bytes;
            length = bytes.length;
        }
    }

    @Override
    public boolean isRepeatable() {
        return true;
    }

    @Override
    public long getContentLength() {
        return length;
    }

    @Override
    public InputStream getContent() throws IOException, IllegalStateException {
        return new ByteArrayInputStream(content, 0, length);
    }

    @Override
    public void writeTo(OutputStream outstream) throws IOException {
        if (outstream == null) {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        outstream.write(content);
        outstream.flush();
    }

    @Override
    public boolean isStreaming() {
        return false;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    protected static class ByteBufferOutputStream extends ByteArrayOutputStream {
        public ByteBufferOutputStream(int size) {
            super(size);
        }
        public byte[] getBuffer() {
            return super.buf;
        }
    }
}