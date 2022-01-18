package Q5;

import java.io.*;
import java.net.*;

/**
 * Serverside
 */
public class Serverside {

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
         System.out.println("Server is running..........");
         
         int counter=0;
        
       while(true)
       {
           counter++;
           Socket serverclient= ss.accept();
           System.out.println("Client " + counter +" is connected....." );
           handleclass hc= new handleclass(serverclient, counter);
           hc.start();
       
       }
     }
     
     
}