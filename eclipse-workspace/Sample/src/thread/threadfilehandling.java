package thread;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class threadfilehandling extends Thread {
	
    public static int x = 0;                                   
    public static String line;
    public static int j = 0;

    public threadfilehandling(String threadName) {
        super(threadName);      
    }

    public void run() {

        while (x != -1)
        {
            if (Thread.currentThread().getName().contains("Reader")) {
                if (x != -1&&j==0)
                {
               j=1;
                String fileName = "D:/Gaurav.txt";


                try {
               
                    FileReader fileReader = new FileReader(fileName);

                  BufferedReader bufferedReader = new BufferedReader(fileReader);

                    for (int check = 0; check <= x; check++) {

                        line = bufferedReader.readLine();
                    }
                    if (line == null) {
                        x = -1;
                    } else {
                        System.out.println(line);

                        x++;
                    }
                    	bufferedReader.close();
                } catch (FileNotFoundException ex) {
                    System.out.println( "Unable to open file '" + fileName + "'");
                } catch (IOException ex) {
                   System.out.println("Error reading file '" + fileName + "'");
                }
                
                }

               Thread.yield();
                
            } 
            else if (Thread.currentThread().getName().contains("writer")) {
            	if (x != -1 && line != null&&j==1)
{
                j=0;

                String fileName = "D:/Gaurav.txt";

                try {
                   
                    FileWriter fileWriter = new FileWriter(fileName, true);

                  
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                    System.out.println("y");
                 
                    bufferedWriter.close();
                } catch (IOException ex) {
                    System.out.println( "Error writing to file '" + fileName + "'");
              
                }
}     
                Thread.yield();
            }
           
        }
    }

    public static void main(String[] args) {

    	threadfilehandling p = new threadfilehandling("Reader");
    	threadfilehandling c = new threadfilehandling("writer");

        p.start();
        c.start();

    }	
	
}