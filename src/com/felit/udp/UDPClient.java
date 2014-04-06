package com.felit.udp;

import java.io.IOException;
import java.net.*;

public class UDPClient {
    public static void main(String args[]) throws IOException {
        DatagramSocket client = new DatagramSocket();
        InetAddress address = InetAddress.getByName("localhost");
        for (int i = 0; i < Common.POCKET_NUM; i++) {
            byte[] sendBuf = new String("I'm a udp package" + i).getBytes();
            DatagramPacket packet = new DatagramPacket(sendBuf, sendBuf.length, address, Common.PORT);
            client.send(packet);
        }
        client.close();
    }
}
