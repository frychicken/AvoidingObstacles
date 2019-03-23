import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Estima {
	
	Frychicken fry = new Frychicken();
	long est;
	long endTime = 0;

public void ass(long est) {
	this.est = est;
	
}
 public void getEst()  {
	  File file = new File(System.getProperty("user.dir")+"/temp.txt"); 
	  
	  BufferedReader br;
	try {
		br = new BufferedReader(new FileReader(file));
		  String st; 
		  while ((st = br.readLine()) != null) 
		    est = Long.valueOf(st);
	} catch (FileNotFoundException e) {
		fry.writeLog(e.toString());
		e.printStackTrace();
	} catch (NumberFormatException e) {
		fry.writeLog(e.toString());
		e.printStackTrace();
	} catch (IOException e) {
		fry.writeLog(e.toString());
		e.printStackTrace();
	} 
	  
	
	  
	    endTime = System.currentTimeMillis();
		long timenee =  ((endTime- est) /1000);
		System.out.println("Time executed: "+ timenee + " seconds");
		fry.writeLog("Time executed: " + timenee + " seconds");
 }
}
