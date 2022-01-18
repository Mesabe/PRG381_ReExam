package Q4;

import java.io.*;
import java.net.*;
import java.util.*;

public class Serverside {

    public static void main(String[] args) throws IOException, Exception {
        ServerSocket ss = new ServerSocket(8080);
        System.out.println("Server is running==================");
        Socket cs = ss.accept();
        DataInputStream inFromClient = new DataInputStream(cs.getInputStream());
        ObjectOutputStream outToClient = new ObjectOutputStream(cs.getOutputStream());
        String input = "";

        while (!input.equalsIgnoreCase("EXIT")) 
        {
            input = inFromClient.readUTF();
            switch (input) {
                case "DISPLAY_ALL":
                    
                    break;
                case "DISPLAY_Condition":
                    
                    break;
                case "EXIT":
                    
                    break;
            }
        }


    }



    public static List<Patient> getAllPatients() 
    {
        List<Patient> ps = new ArrayList<>();
        

        return ps;
    }
    
}
