package com.felit.tcp.keepalive;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

public class SocketClient {
    public static void main(String args[]) throws IOException, InterruptedException {
        Socket socket = new Socket();
        SocketAddress socketAddress = new InetSocketAddress("localhost", 8000);
        socket.connect(socketAddress);
        OutputStream outputStream;
        byte[] outBuf;
        for (int i = 0; i < 1000; i++) {
            outputStream = socket.getOutputStream();
            outputStream.write(("Hello world" + i).getBytes());
//            Thread.sleep(200);
            System.out.println(i);
//            outputStream.flush();// TCP push flag
        }
//        socket.close();
    }
}
