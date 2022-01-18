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
        Socket cs = new Socket("127.0.0.1",8080);

        DataOutputStream outServer = new DataOutputStream(cs.getOutputStream());
        ObjectInputStream inServer = new ObjectInputStream(cs.getInputStream());

        Scanner sc = new Scanner(System.in);
        displayMenu();
        int choice = 0;
        while(Menu.values()[choice] != Menu.EXIT){
            choice = sc.nextInt();
            if (Menu.values()[choice] == Menu.DISPLAY_Condition) {
                displayConditions();
                outServer.writeUTF(Menu.values()[choice].toString());
                choice = sc.nextInt();
            }
            if(Menu.values()[choice] == Menu.EXIT){
                outServer.writeUTF(Menu.values()[choice].toString());
                cs.close();
                break;
            }
            outServer.writeUTF(Menu.values()[choice].toString());
            
            
        }
    }


    public static void displayMenu(){
        System.out.println("\nMain Menu:");
        for(int i = 0;i<Menu.values().length;i++){
            System.out.println(i+") "+Menu.values()[i]);
        }
        System.out.print("Your choice: ");
    }

    public static void displayConditions(){
        System.out.println("\nMain Menu:");
        for(int i = 0;i<Conditions.values().length;i++){
            System.out.println(i+") "+Conditions.values()[i]);
        }
        System.out.print("Your choice: ");
    }
}