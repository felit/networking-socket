package com.felit.tcp;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

/**
 * command to capture the tcp package:
 * sudo tcpdump -i lo host localhost and port 8000 -w build-connect.pcap
 */
public class SocketServer {
    public static void main(String args[]) throws InterruptedException, IOException {
        ServerSocket serverSocket = new ServerSocket();
        SocketAddress socketAddress = new InetSocketAddress("localhost", 8000);
        serverSocket.bind(socketAddress);
        Socket socket = serverSocket.accept();
        socket.close();
//        for (; ; ) {
//        }
    }
}
