package internet;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Enumeration;

public class IP {
    public static void main(String[] args) {
        System.out.println("=== 电脑IP地址信息 ===");

        // 获取本地IP地址
        getLocalIP();

        // 获取公网IP地址
        getPublicIP();
    }

    // 获取本地IP地址
    public static void getLocalIP() {
        try {
            System.out.println("\n--- 本地IP地址 ---");

            // 获取主机名和IP地址
            InetAddress localhost = InetAddress.getLocalHost();
            System.out.println("主机名: " + localhost.getHostName());
            System.out.println("本地IP地址: " + localhost.getHostAddress());

            // 获取所有网络接口的IP地址
            System.out.println("\n--- 所有网络接口 ---");
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();

            while (interfaces.hasMoreElements()) {
                NetworkInterface iface = interfaces.nextElement();
                if (iface.isUp() && !iface.isLoopback()) {
                    Enumeration<InetAddress> addresses = iface.getInetAddresses();
                    while (addresses.hasMoreElements()) {
                        InetAddress addr = addresses.nextElement();
                        if (!addr.isLoopbackAddress() && addr.getHostAddress().indexOf(':') < 0) {
                            System.out.println("接口: " + iface.getDisplayName() + " - IP: " + addr.getHostAddress());
                        }
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("获取本地IP地址时出错: " + e.getMessage());
        }
    }

    // 获取公网IP地址
    public static void getPublicIP() {
        try {
            System.out.println("\n--- 公网IP地址 ---");

            // 使用多个服务来获取公网IP，提高成功率
            String[] services = {
                    "https://api.ipify.org",
                    "https://checkip.amazonaws.com",
                    "https://ifconfig.me"
            };

            String publicIP = null;
            for (String service : services) {
                try {
                    publicIP = getIPFromService(service);
                    if (publicIP != null && !publicIP.isEmpty()) {
                        break;
                    }
                } catch (Exception e) {
                    // 尝试下一个服务
                    continue;
                }
            }

            if (publicIP != null && !publicIP.isEmpty()) {
                System.out.println("公网IP地址: " + publicIP.trim());
            } else {
                System.out.println("无法获取公网IP地址，请检查网络连接");
            }

        } catch (Exception e) {
            System.out.println("获取公网IP地址时出错: " + e.getMessage());
        }
    }

    // 从指定服务获取IP地址
    private static String getIPFromService(String serviceUrl) throws Exception {
        URL url = new URL(serviceUrl);
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String ip = reader.readLine();
        reader.close();
        return ip;
    }
}