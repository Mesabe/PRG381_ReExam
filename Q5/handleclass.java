package Q5;

import java.io.*;
import java.net.*;

public class handleclass extends Thread{

    
    Socket client;
    int client_number;

    public handleclass(Socket client, int client_number) {
        this.client = client;
        this.client_number = client_number;
    }
    
    public void run() {
        DataInputStream inStream = null;
    try {
        inStream = new DataInputStream(client.getInputStream());
        DataOutputStream outStream = new DataOutputStream(client.getOutputStream());
        String clientMessage="", serverMessage="";
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(!clientMessage.equalsIgnoreCase("bye")){
            clientMessage=inStream.readUTF();
            System.out.println("Client " +client_number+ " said => "+clientMessage);
            System.out.print("Reply to "+client_number+":");
            clientMessage=br.readLine();
            outStream.writeUTF(clientMessage.toUpperCase());
            
            outStream.flush();
        } inStream.close();
        outStream.close();
        client.close();
    } catch (IOException ex) {
        System.out.println(ex);
    } finally {
        try {
            inStream.close();
        } catch (IOException ex) {
           System.out.println(ex);
        }
    }
    }

   
    
}
