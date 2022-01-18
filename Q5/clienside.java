package Q5;

import java.io.*;
import java.net.*;


enum Menu{
    Pretoria,Kempton_Park,Port_Elizabeth,EXIT;
}
public class clienside {
    
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket cs = new Socket("127.0.0.1",8888);

    DataInputStream inStream=new DataInputStream(cs.getInputStream());
    DataOutputStream outStream=new DataOutputStream(cs.getOutputStream());
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String clientMessage="";
    String serverMessage="";
    while(!clientMessage.equalsIgnoreCase("EXIT")){
        System.out.println("Choose your option :");
        displayMenu();
        int choice = 0;
        
        while(Menu.values()[choice] != Menu.EXIT){
            choice = br.read();
            if(Menu.values()[choice] == Menu.EXIT){
                outStream.writeUTF(Menu.values()[choice].toString());
                cs.close();
                break;
            }
            outStream.writeUTF(Menu.values()[choice].toString());
        
            displayMenu();
            
        }
        clientMessage=br.readLine();
        outStream.writeUTF(clientMessage);
        outStream.flush();
        serverMessage=inStream.readUTF();
      }
      outStream.close();
      outStream.close();
      cs.close();
      }





    }

    public static void displayMenu(){
        System.out.println("\nMain Menu:");
        for(int i = 0;i<Menu.values().length;i++){
            System.out.println(i+") "+Menu.values()[i]);
        }
        System.out.print("Your choice: ");
    }

}
