package Q4;

import java.io.*;
import java.net.*;
import java.util.*;

enum Conditions{
    HighlyCritical, Severe, Mild;
}
public class Serverside {

    public static void main(String[] args) throws IOException, Exception {
        ServerSocket ss = new ServerSocket(8080);
        System.out.println("Server is running==================");
        Socket cs = ss.accept();
        DataInputStream inClient = new DataInputStream(cs.getInputStream());
        ObjectOutputStream outClient = new ObjectOutputStream(cs.getOutputStream());
        String input = "";

        while (!input.equalsIgnoreCase("EXIT")) 
        {
            input = inClient.readUTF();
            switch (input) {
                case "DISPLAY_ALL":
                    outClient.writeObject(getAllPatients());
                    break;
                case "DISPLAY_Condition":
                    displayConditions();
                    input = inClient.readUTF();
                    switch (input) {
                        case "HighlyCritical":
                            List<Patient> psHC = new ArrayList<>();
                            for (Patient ps : getAllPatients()) {
                                if (ps.getPcondition() == "Mild") {
                                    psHC.add(ps);
                                }
                            }
                            outClient.writeObject(psHC);
                            break;
                        case "Severe":
                            List<Patient> psS = new ArrayList<>();
                            for (Patient ps : getAllPatients()) {
                                if (ps.getPcondition() == "Mild") {
                                    psS.add(ps);
                                }
                            }
                            outClient.writeObject(psS);
                            break;
                        case "Mild":
                            List<Patient> psM = new ArrayList<>();
                            for (Patient ps : getAllPatients()) {
                                if (ps.getPcondition() == "Mild") {
                                    psM.add(ps);
                                }
                            }
                            outClient.writeObject(psM);
                            break;
                    
                        default:
                            break;
                    }
                    break;
                case "EXIT":
                    
                    break;
            }
        }


    }



    public static List<Patient> getAllPatients() throws FileNotFoundException 
    {
        List<Patient> ps = new ArrayList<>();
        File fs = new File("Patients.txt");
        if (fs.exists()) {
            Scanner sc = new Scanner(fs);
            String line = "";
            while (sc.hasNext()) {
                line = sc.nextLine();
                String[] values = line.split("@");
                ps.add(new Patient(values[0], values[1], values[2], values[3]));
                
            }
            sc.close();
        } else {
            System.err.println();
        }
        
        return ps;
    }


    public static void displayConditions(){
        System.out.println("\nMain Menu:");
        for(int i = 0;i<Conditions.values().length;i++){
            System.out.println(i+") "+Conditions.values()[i]);
        }
        System.out.print("Your choice: ");
    }
    
}
