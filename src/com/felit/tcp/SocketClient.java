package com.felit.tcp;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

public class SocketClient {
    public static void main(String args[]) throws IOException {
        Socket socket = new Socket();
        SocketAddress socketAddress = new InetSocketAddress("localhost", 8000);
        socket.connect(socketAddress);
        socket.close();
    }
}
