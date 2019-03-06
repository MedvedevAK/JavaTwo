package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        ServerSocket server = null;
        Socket socket = null;
        try {
            server = new ServerSocket(9000);
            System.out.println("Server on. Waiting connection.");
            while (true) {
                socket = server.accept();
                System.out.println("Client on");
                new Thread(new Server(socket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
                server.close();
                System.out.println("Server close");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
