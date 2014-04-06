package com.felit.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *  sudo tcpdump -i lo udp port 8000 -w udp-helloworld.pcap
 */
public class UDPServer {


    public static void main(String args[]) throws IOException {
        DatagramSocket server = new DatagramSocket(Common.PORT);
        byte[] recfBuf = new byte[100];
        DatagramPacket recvPacket = new DatagramPacket(recfBuf, recfBuf.length);
        for (int i = 0; i < Common.POCKET_NUM; i++) {
            server.receive(recvPacket);
            System.out.println(new String(recvPacket.getData(), 0, recvPacket.getLength()));
        }
        server.close();
    }
}
