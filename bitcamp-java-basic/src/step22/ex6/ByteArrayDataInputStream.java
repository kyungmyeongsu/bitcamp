package step22.ex6;

import java.io.ByteArrayInputStream;

public class ByteArrayDataInputStream extends ByteArrayInputStream {

    public ByteArrayDataInputStream(byte[] buf) {
        super(buf);
    }
    
    
    public String readUTF() throws Exception{
        byte[] buf = new byte[100];
        int size = this.read(); // 이름이 저장된 바이트 배열의 수
        this.read(buf, 0, size); // 이름 배열 개수 만큼 바잍를 읽어 배열에 저장한다.
        return new String(buf, 0, size, "UTF-8");
    }
    
    public int readInt() throws Exception{
        int value = 0;
        value = this.read() << 24;
        value += this.read() << 16;
        value += this.read() << 8;
        value += this.read();
        return value;
    }
    
    public long readLong() throws Exception{
        long value = 0;
        value = this.read() << 56;
        value += this.read() << 48;
        value += this.read() << 40;
        value += this.read() << 32;
        value += this.read() << 24;
        value += this.read() << 16;
        value += this.read() << 8;
        value += this.read();
        return value;
    }
    
    public boolean readBoolean() throws Exception{
        if (this.read() == 1)
            return true;
        else
            return false;
    }
}
