package internet;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Tcpclient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1", 8080);
        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(outputStream);
        dos.writeUTF("你好");
        dos.flush();
        dos.close();
        socket.close();

    }
}
