package server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Server implements Runnable {
    private Socket socket;
    private PrintWriter out;
    private Scanner in;
    private String name;

    public Server (Socket socket) {
        try {
            this.socket = socket;
            out = new PrintWriter(socket.getOutputStream());
            in = new Scanner(socket.getInputStream());
            name = "Client";
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true) {
            if (in.hasNext()) {
                String w = in.nextLine();
                System.out.println(name + ": " + w);
                out.println("Server replied: " + w);
                out.flush();
                if (w.equalsIgnoreCase("End")) break;
            }
        }
        try{
            System.out.println("Client disconnected");
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
