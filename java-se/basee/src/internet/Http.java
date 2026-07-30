package internet;

import java.net.InetAddress;

public class Http {
    public static void main(String[] args) throws Exception {
        InetAddress lo =  InetAddress.getLocalHost();
        System.out.println("localHOst = " + lo);
        System.out.println(lo.getHostName());
        System.out.println(lo.getHostAddress());
        InetAddress byName = InetAddress.getByName("www.baidu.com");
        System.out.println("byName = " + byName);
        System.out.println(byName.getHostName());
        System.out.println(byName.getHostAddress());
        System.out.println("lo.isReachable(1000) = " + lo.isReachable(1000));

    }
}
