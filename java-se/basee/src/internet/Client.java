package internet;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("【Client】");


        while (true) {
            DatagramSocket socket = new DatagramSocket();
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入要发送的内容：");
            String str = scanner.next();
            byte[] send = str.getBytes();
            if (str.equals("exit")) {
                break;
            }
            DatagramPacket packet = new DatagramPacket(send, send.length, InetAddress.getLocalHost(),6543);
            socket.send(packet);
            System.out.println("发送成功");
            // 只关闭一次
            socket.close();
        }

    }
}
