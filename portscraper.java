import java.io.*;
import java.net.*;

public class portscraper {
    public static void main(String[] args){
        int upperLimitPort = 1026;
        String hostname = "localhost";

        for (int i=0; i < upperLimitPort; i++){
            try {
                Socket s = new Socket(hostname, i);
                System.out.println("Server is listening on port "+ i +" of "+ hostname);
                s.close();
            } catch(UnknownHostException e){
                System.err.println("Host unknow for hostname: "+ hostname);
            } catch (IOException e){
                System.err.println("server not listening on port "+ i +" of "+ hostname);
            }
        }

        return;
    }
}