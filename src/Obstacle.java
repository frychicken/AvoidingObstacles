//Main file
import javax.swing.*;
import java.awt.*;
public class Obstacle {
	public static void main(String[] args) throws Exception {
		CheckUpdate ccu= new CheckUpdate();
		ccu.checkup();
		JFrame frame = new JFrame("Wait"); 
		Loading loadd = new Loading(frame);
		frame.getContentPane().add(BorderLayout.CENTER, loadd); 
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
			}
		} 
		frame.setVisible(false);
		System.out.println();
		Nani nina = new Nani();
		nina.Nihaoma();
		System.out.println("All Done!");
		System.exit(0);
	}
}

