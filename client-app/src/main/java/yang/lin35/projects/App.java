package yang.lin35.projects;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * Hello world!
 *
 */
public class App
{


    public static void main( String[] args )
    {
        System.out.println( "Welcome use IM" );
        MessageHandler messageHandler = new MessageHandler();
        messageHandler.sendMessage("hello world");
        messageHandler.messageReceive();

        messageHandler.close();
    }



}
