package yang.lin35.projects;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;

public class MessageHandler {
    private static final String remote_host = "localhost";
    private static final int port = 9991;
    Socket socket;

    public MessageHandler()
    {
        socket = new Socket();
        try {
            socket.connect(new InetSocketAddress(remote_host,port));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendMessage(String msg){
        try {
            BufferedWriter w = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            w.write("hello world");
            w.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void messageReceive(){
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line = null;
            while((line = reader.readLine()) != null){
                System.out.println("Server:"+line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void close (){
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
