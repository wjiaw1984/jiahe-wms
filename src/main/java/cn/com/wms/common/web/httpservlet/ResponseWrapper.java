package cn.com.wms.common.web.httpservlet;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.servlet.ServletOutputStream;
import javax.servlet.WriteListener;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;


public class ResponseWrapper
        extends HttpServletResponseWrapper {
    private ByteArrayOutputStream buffer;
    private ServletOutputStream out;

    public ResponseWrapper(HttpServletResponse httpServletResponse) {
        /* 20 */
        super(httpServletResponse);
        /* 21 */
        this.buffer = new ByteArrayOutputStream();
        /* 22 */
        this.out = new WrapperOutputStream(this.buffer);
    }


    public ServletOutputStream getOutputStream() throws IOException {
        /* 28 */
        return this.out;
    }


    public void flushBuffer() throws IOException {
        /* 34 */
        if (this.out != null) {
            /* 35 */
            this.out.flush();
        }
    }


    public byte[] getContent() throws IOException {
        /* 41 */
        flushBuffer();
        /* 42 */
        return this.buffer.toByteArray();
    }

    class WrapperOutputStream extends ServletOutputStream {
        private ByteArrayOutputStream bos;

        public WrapperOutputStream(ByteArrayOutputStream bos) {
            this.bos = bos;
        }

        @Override
        public void write(int b)
                throws IOException {
            bos.write(b);
        }

        @Override
        public boolean isReady() {

            // TODO Auto-generated method stub
            return false;

        }

        @Override
        public void setWriteListener(WriteListener arg0) {

            // TODO Auto-generated method stub

        }
    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\common\web\httpservlet\ResponseWrapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */