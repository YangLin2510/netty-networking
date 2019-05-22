package yang.lin35.projects;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome" );
        EchoServer echoServer = new EchoServer();
        echoServer.start(9991);
    }
}
