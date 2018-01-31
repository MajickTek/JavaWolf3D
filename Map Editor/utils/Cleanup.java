//Cleans up CSV files exported from Tiled
//Simply choose the CSV file as the first argument.

import java.io.*;

public class Cleanup
    {
     public static void main(String args[])
         {
         try
             {
             File file = new File(args[1]);
             BufferedReader reader = new BufferedReader(new FileReader(file));
             String line = "", oldtext = "";
             while((line = reader.readLine()) != null)
                 {
                 oldtext += line + "\r\n";
             }
             reader.close();
             // replace a word in a file
             String newtext = oldtext.replaceAll("-1", "0"); // replace -1 with 0
            
             //To replace a line in a file
             //String newtext = oldtext.replaceAll("This is test string 20000", "blah blah blah");
            
             FileWriter writer = new FileWriter(args[1]);
             writer.write(newtext);writer.close();
         }
         catch (IOException ioe)
             {
             ioe.printStackTrace();
         }
     }
}
