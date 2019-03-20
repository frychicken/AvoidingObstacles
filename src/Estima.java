
public class Estima {
	
	Frychicken fry = new Frychicken();
	long est;
	long endTime = 0;

public void ass(long est) {
	this.est = est;
	
}
 public void getEst() {
	    endTime = System.currentTimeMillis();
		long timenee =  ((endTime- est) /1000);
		System.out.println("Time executed: "+ timenee + " seconds");
		fry.writeLog("Time executed: " + timenee + " seconds");
 }
}
