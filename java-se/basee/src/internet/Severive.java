package internet;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Severive {
    public static void main(String[] args) throws Exception {
        while (true) {
            DatagramSocket socket = new DatagramSocket(6543);
            byte[] bytes = new byte[1024];
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
            socket.receive(packet);
            int length = packet.getLength();
            String receive = new String(bytes, 0, length);
            System.out.println("receive消息 = " + receive);
            if (receive.equals("exit")) {
                break;
            }

            System.out.println(packet.getAddress());
            System.out.println("--------------------下一条");
        }

    }
}
