import java.awt.Color;
import java.io.FileOutputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Nani {
	boolean darkmode;
	public Nani(boolean darkmode) {
		this.darkmode= darkmode;
	}
	static Frychicken fry = new Frychicken();

	public void downloadCus() {
		Frychicken fry = new Frychicken();
		String cheee = System.getProperty("user.dir").toString();
		try {
			URL updaterD = new URL("https://raw.githubusercontent.com/frychicken/art-IF-icial-Intelligence/master/Customizer/AOWCus.jar");
			ReadableByteChannel ok = Channels.newChannel(updaterD.openStream());
			FileOutputStream okay = new FileOutputStream(cheee+"/AOWCus.jar");
			okay.getChannel().transferFrom(ok, 0, Long.MAX_VALUE);
			okay.close();
			ok.close();
			Runtime r= Runtime.getRuntime();
			r.exec("java -jar AOWCus.jar");
			System.exit(0);
		}catch(Exception e) {
			System.out.println("Cannot find customizer");
			fry.writeLog(e.toString());
			fry.writeLog("Cannot find customizer");

		}
	}
	public void Nihaoma() throws Exception {
		int b = 10; 
		Dog_ doge = new Dog_();
		doge.asss(darkmode);
		String reduc = doge.cat_();
		Color obstacle = new Color(Integer.valueOf(reduc.substring(reduc.indexOf("*")+1,reduc.indexOf("!"))),Integer.valueOf(reduc.substring(reduc.indexOf("!")+1,reduc.indexOf("@"))),Integer.valueOf(reduc.substring(reduc.indexOf("@")+1,reduc.indexOf("#"))));
		Color object = new Color(Integer.valueOf(reduc.substring(reduc.indexOf("#")+1,reduc.indexOf("$"))),Integer.valueOf(reduc.substring(reduc.indexOf("$")+1,reduc.indexOf("%"))),Integer.valueOf(reduc.substring(reduc.indexOf("%")+1, reduc.indexOf("^"))));
		int tess = reduc.indexOf(".");
		b = Integer.valueOf(reduc.substring(0,tess));
		System.out.println("Lab(s): "+b);
		int i = 1;
		int userin = Integer.valueOf(reduc.substring(tess+1, reduc.indexOf(",")));
		if (userin > 3 || userin<=0)
			while (userin >3 || userin <=0) { 
				if (userin >3 || userin <=0)
					fry.ChickenIsNotFood();
				userin = Integer.valueOf(doge.cat_().substring(tess+1, reduc.indexOf(",")));

			}
		boolean debugg = true;
		boolean sound = true;
		boolean gamem = false;
		boolean ca = false;
		int n = -1;
		int st = Integer.valueOf(reduc.substring(reduc.indexOf(",")+1,reduc.indexOf("*")));
		int stt = Integer.valueOf(reduc.substring(reduc.indexOf("^")+1, reduc.indexOf("&")));
		int sttt = Integer.valueOf(reduc.substring(reduc.indexOf("&")+1));
		boolean autopilot = true;
		System.out.println("Obstacle(s): "+ userin);
		
		if (Dog_.outofideasfornames == 1) {
			downloadCus();
			ca = true;
		}
		
		while (i <= b) {
			Execut exec = new Execut(userin, object, obstacle,i,b, darkmode, ca); 
			if (st != 1) {
				debugg = false;
				if (stt != 1) {
					sound = false;
				}
				else sound = true;
				if (sttt != 1) {
					autopilot = true;
				}
				else autopilot = false;
				if (Dog_.emaa != 1) {
					gamem = false;
				}
				else gamem = true;
				exec.assin(debugg, sound, autopilot, gamem);
			}
			else { 
				debugg = true; 
				if (stt != 1) {
					sound = false;
				}
				else sound = true;
				if (sttt != 1) {
					autopilot = true;
				}
				else autopilot = false;
				if (Dog_.emaa != 1) {
					gamem = false;
				}
				else gamem = true;
				exec.assin(debugg, sound, autopilot, gamem);
			}

			if (n == -1) {
				String str1 = "Debug mode: "+debugg;
				String str2 = "Sound: "+sound;
				String str3 = "Auto-pilot: "+autopilot;
				String str4 = "Game mode: "+gamem;
				String str5 = "Custom algorithm: "+ca;
				System.out.println("Debug mode = " +debugg);
				System.out.println("Sound: " +sound);
				System.out.println("Auto-pilot= "+autopilot);
				System.out.println("Game mode: "+gamem);
                System.out.println("Custom algorithm: "+ca);
				
				fry.writeLog(str1);
				fry.writeLog(str2);
				fry.writeLog(str3);
				fry.writeLog(str4);
				fry.writeLog(str5);

			}
			exec.run();
			int cpp = i++;
			System.out.println("lap: "+ cpp);
			fry.writeLog("lap: " +cpp);
			n++;
		}
		if (gamem) {
		fry.YouWin();
		fry.writeLog("Congrats, you win the game!");
		System.out.println("You Win, congrats!");
		}
		if (fry.ChickenNotFood() != 0) {  System.out.println("Ok, doing it"); Nihaoma(); }
		else return;
	}
}