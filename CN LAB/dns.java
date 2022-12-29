// DNS implementation 

import java.net.*;
import java.util.*;
public class dns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the domain name: ");
        String domain = sc.nextLine();
        try {
            InetAddress ip = InetAddress.getByName(domain);
            System.out.println("IP address: " + ip.getHostAddress());
        } catch (Exception e) { System.out.println(e); }
        System.out.print("Enter the IP address: ");
        String ip = sc.nextLine();
        try {
            InetAddress domainName = InetAddress.getByName(ip);
            System.out.println("Domain name: " + domainName.getHostName());
        } catch (Exception e) {
            System.out.println(e);
        }
        sc.close();
    }
}

/*
Output:
Enter the domain name: www.google.com
IP address: 216.58.196.164
Enter the IP address: 20.207.73.82
Domain name: maa05s18-in-f4.1e100.net
*/