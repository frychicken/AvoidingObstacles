import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class CheckUpdate {
	private boolean stillqm = true;
 public void checkup(boolean darkmode) throws Exception {
	 Frychicken fry = new Frychicken();
	 Estima est = new Estima();
	 String todis = "Checking for updates";
		JFrame frame = new JFrame("Checking update"); 
		DrawCheck drc= new DrawCheck(frame,darkmode);
		if (darkmode) {
			frame.getContentPane().setBackground(Color.DARK_GRAY);  
		}
		frame.getContentPane().add(BorderLayout.CENTER, drc); 
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
		
		while (stillqm) {
		try {
			drc.changec(todis);
			drc.repaint();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	 int cheee = drc.getVersion(); 
			System.out.println("Checking for updates");
			fry.writeLog("Checking for updates");
			BufferedReader br = null;
			StringBuilder fromcom = new StringBuilder();
			try {
				URL url = new URL("https://raw.githubusercontent.com/frychicken/art-IF-icial-Intelligence/master/CurrentVersion.txt");
				br = new BufferedReader(new InputStreamReader(url.openStream()));
				String line;
				while ((line = br.readLine()) != null) {
					fromcom.append(line);
				}
			}catch (Exception e) {
				 todis = "Error: Cannot connect to server!";
				 fry.writeLog(todis);
					try {
						drc.changec(todis);
						drc.repaint();
						Thread.sleep(1000);
					} catch (Exception er) {
						er.printStackTrace();
						fry.writeLog(er.toString());
					}
				System.out.println("Error: Cannot connect to server!");
				frame.setVisible(false);  
				stillqm = false;
				return ;
			} finally {
				if (br != null) {
					br.close();
				}
			} 
			int c =Integer.valueOf(fromcom.toString());
			int d = cheee;
			if (c > d) {
				 todis = "New version is available";
					fry.writeLog(todis);

					try {
						drc.changec(todis);
						drc.repaint();
						Thread.sleep(1000);
					} catch (Exception er) {
						er.printStackTrace();
						fry.writeLog(er.toString());

					}
				if (JOptionPane.showConfirmDialog((Component) null, "New version is available Do you want to update?\n new version:" +c+" your version: "+d,
						"Confirm", JOptionPane.YES_NO_OPTION) ==0) {
					 todis = "Almost done! Updating...";
						fry.writeLog(todis);

						try {
							drc.changec(todis);
							drc.repaint();
							Thread.sleep(1000);
						} catch (Exception er) {
							er.printStackTrace();
							fry.writeLog(er.toString());

						}
					Runtime r= Runtime.getRuntime();
					r.exec("java -jar UpdaterAOW.jar");
	                Uaow uaow = new Uaow();
	                uaow.up();
	                frame.setVisible(false);  
	                stillqm = false;
				}
				else {
					frame.setVisible(false);  
					stillqm = false;
					return;
				}
				
			}
			else {System.out.println("No new updates");
			if (darkmode) {
				UIManager.put("OptionPane.background", Color.DARK_GRAY);
				 UIManager.put("Panel.background", Color.DARK_GRAY);
					UIManager.put("OptionPane.messageForeground", Color.WHITE);
			}
			JOptionPane.showMessageDialog((Component) null, "No new updates",
					"Update", JOptionPane.INFORMATION_MESSAGE);
					frame.setVisible(false);
			stillqm = false;
			fry.writeLog("No new updates");

			}
				
       }

 }
}
