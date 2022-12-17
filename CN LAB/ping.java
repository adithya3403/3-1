import java.io.*;
import java.net.*;
import java.util.*;
public class ping {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the domain name: ");
        String domain = sc.nextLine();
        InetAddress ip = InetAddress.getByName(domain);
        System.out.println("IP address: " + ip.getHostAddress());
        System.out.println("Pinging " + ip.getHostAddress() + "...");
        Process p = Runtime.getRuntime().exec("ping " + ip.getHostAddress());
        BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }
        in.close();
        sc.close();
    }
}

/*
Output:
Enter the domain name: www.google.com
IP address: 216.58.196.164
Pinging 216.58.196.164...

Pinging 216.58.196.164 with 32 bytes of data:
Reply from 216.58.196.164: bytes=32 time=80ms TTL=115
Reply from 216.58.196.164: bytes=32 time=95ms TTL=115
Reply from 216.58.196.164: bytes=32 time=57ms TTL=115
Reply from 216.58.196.164: bytes=32 time=44ms TTL=115

Ping statistics for 216.58.196.164:
    Packets: Sent = 4, Received = 4, Lost = 0 (0% loss),
Approximate round trip times in milli-seconds:
    Minimum = 44ms, Maximum = 95ms, Average = 69ms 
*/