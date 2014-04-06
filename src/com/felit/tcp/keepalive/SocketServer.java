package com.felit.tcp.keepalive;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class SocketServer {
    public static void main(String args[]) throws IOException, InterruptedException {
        ServerSocket serverSocket = new ServerSocket();
        SocketAddress socketAddress = new InetSocketAddress("localhost", 8000);
        serverSocket.bind(socketAddress);
        Socket socket;
        for (int i = 0; i < 1000; i++) {
            socket = serverSocket.accept();
            byte[] inStr;
            while(true){
                socket.setKeepAlive(true);
                InputStream inputStream = socket.getInputStream();
                if (inputStream.available()>0) {
                    inStr = new byte[inputStream.available()];
                    inputStream.read(inStr);
                    System.out.println(new String(inStr));
                }
            }
//            socket.close();
        }
    }
}
