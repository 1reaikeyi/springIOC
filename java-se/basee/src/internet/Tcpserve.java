package internet;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Tcpserve {
    public static void main(String[] args) throws Exception {
        System.out.println("app");
        ServerSocket serverSocket = new ServerSocket(8080);
       Socket socket = serverSocket.accept();
        System.out.println("连接成功");
        InputStream inputStream = socket.getInputStream();
        DataInputStream dis = new DataInputStream(inputStream);
        String s = dis.readUTF();
        System.out.println(s);
        dis.close();
        socket.close();


    }
}
