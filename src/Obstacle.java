//Main file
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.PrintWriter;

public class Obstacle {
	public static void main(String[] args) throws Exception {
		   long startTime = System.currentTimeMillis();
		   Estima est = new Estima();
		   long endTime = 0;
		   long timenee;
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		Frychicken fry = new Frychicken();
		 est.ass(startTime);
		 PrintWriter writer = new PrintWriter(System.getProperty("user.dir")+"/temp.txt", "UTF-8");
		 writer.print(startTime);
		 writer.close();
		boolean darkmode = false;
		if (fry.Darkmode() !=1) {
			darkmode = true;
		}
		 
		CheckUpdate ccu= new CheckUpdate();
		ccu.checkup(darkmode);
		DrawCheck drc = new DrawCheck();
		JFrame frame = new JFrame("Version: "+drc.getVersion()); 
		
		Loading loadd = new Loading(frame, darkmode);
		
		frame.getContentPane().add(BorderLayout.CENTER, loadd); 
		if (darkmode) {
			UIManager.put("OptionPane.background", Color.DARK_GRAY);
			 UIManager.put("Panel.background", Color.DARK_GRAY);
				UIManager.put("OptionPane.messageForeground", Color.WHITE);

			frame.getContentPane().setBackground(Color.DARK_GRAY);  
		}
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.addWindowListener(new WindowAdapter() {
			   public void windowClosing(WindowEvent evt) {
				   System.out.println();
				   System.out.println("Program terminated by user");
			     fry.writeLog("Program terminated by user");
	
			     est.getEst();
			  System.exit(0);
			     
			   }
			  });
		frame.setResizable(false);
		frame.setSize(300, 300); 	
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);  
		String f = "Avoiding objects simulator by @frychicken";
		for (int i =0; i<f.length(); i++) {
			String c = f.substring(i, i+1);
			System.out.print(c);
			try {
				loadd.changec();
				loadd.repaint();
				Thread.sleep(90); 
			} catch (Exception e) {
				e.printStackTrace();
				fry.writeLog(e.toString());

			}
		} 
		frame.setVisible(false);
		System.out.println();
		Nani nina = new Nani(darkmode);
		nina.DownC();
		nina.Nihaoma();
		System.out.println("All Done!");
		fry.writeLog("All Done");
		endTime = System.currentTimeMillis();

		timenee =  ((endTime- startTime) /1000);
		System.out.println("Time executed: "+ timenee + " seconds");
		fry.writeLog("Time executed: " + timenee + " seconds");
		System.exit(0);
	}
	
	
}
