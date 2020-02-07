package EappStepDefination;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;



public class BufferedReaderExample {

	 public static void main(String args[]) {
	     
	        //reading file line by line in Java using BufferedReader      
	        FileInputStream fis = null;
	        BufferedReader reader = null;
	     
	        try {
	            fis = new FileInputStream("C:\\pythonscript\\datacontent2.xml");
	            reader = new BufferedReader(new InputStreamReader(fis));
	         
	            System.out.println("Reading File line by line using BufferedReader");
	         
	            String line = reader.readLine();
	            while(line != null){
	                System.out.println(line);
	                line = reader.readLine();
	            }          
	         
	        } catch (FileNotFoundException ex) {
	            Logger.getLogger(BufferedReader.class.getName()).log(Level.SEVERE, null, ex);
	        } catch (IOException ex) {
	            Logger.getLogger(BufferedReader.class.getName()).log(Level.SEVERE, null, ex);
	         
	        } finally {
	            try {
	                reader.close();
	               fis.close();
	            } catch (IOException ex) {
	                Logger.getLogger(BufferedReaderExample.class.getName()).log(Level.SEVERE, null, ex);
	            }
       }
	  }
	
//	public static void main(String args[]) throws IOException {
//
//        final String FILE_NAME = "C:\\pythonscript\\datacontent2.xml";
//
//        // 1st way to read File in Java - Using Scanner
////        Scanner scnr = new Scanner(new FileInputStream(FILE_NAME));
////        while (scnr.hasNextLine()) {
////            System.out.println(scnr.nextLine());
////        }
////        scnr.close();
//
//        // 2nd way to read File in Java - Using BufferedReader
//        BufferedReader buffReader = new BufferedReader(new InputStreamReader(new FileInputStream(FILE_NAME)));
//       String line = buffReader.readLine();
//       while (line != null) {
//           System.out.println(line);
//          line = buffReader.readLine();
//        }
//}
}
