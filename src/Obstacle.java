//Main file
import javax.swing.*;
import java.awt.*;
public class Obstacle {
	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		Frychicken fry = new Frychicken();
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
			frame.getContentPane().setBackground(Color.DARK_GRAY);  
		}
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
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
		System.exit(0);
	}
	
	
}
