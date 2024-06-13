package netpro2024.mid_exam.q5;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyGetPCIPv4 {

    public static void main(String[] args) {
        try {
            InetAddress address=InetAddress.getLocalHost();
            System.out.println("このPCのIPアドレスは: "+ address.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("Error");
        }
    }
}