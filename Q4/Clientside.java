package Q4;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * Clientside
 */


enum Menu{
    DISPLAY_ALL, DISPLAY_Condition, EXIT;
}
public class Clientside {


    public static void main(String[] args) throws Exception, IOException, UnknownHostException {
        Scanner sc = new Scanner(System.in);
        Socket cs = new Socket("127.0.0.1",8080);

        DataOutputStream outServer = new DataOutputStream(cs.getOutputStream());
        ObjectInputStream in = new ObjectInputStream(cs.getInputStream());

        
    }


    public static void displayMenu(){
        System.out.println("\nMain Menu:");
        for(int i = 0;i<Menu.values().length;i++){
            System.out.println(i+") "+Menu.values()[i]);
        }
        System.out.print("Your choice: ");
    }
}