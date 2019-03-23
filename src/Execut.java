//Logic stuff -- execut
import javax.swing.*; 
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.*;
public class Execut  extends Component {
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private Method_T contentt;
	String msg = "UP";
	private int x = 200;
	private int y = 600;
	Color object = Color.RED;
	Color obstacle = Color.GREEN;
	private boolean debugg = true;
	private boolean sound = true;
	private ArrayList<Integer> xOb = new ArrayList<Integer>();
	private  ArrayList<Integer> yOb = new ArrayList<Integer>();
	int userin = 1;
	int lalala;
	int alala;
	boolean autopilot = false;
	boolean dark;
	boolean game;
	boolean ca;
	Frychicken fry = new Frychicken();
	Estima est = new Estima();
	public Execut(int userin, Color object, Color obstacle, int i, int b, boolean darkmode, boolean ca) {
		this.object = object;
		this.obstacle = obstacle;
		lalala = i;
		alala = b;
		this.userin = userin;
		this.ca = ca;
		dark = darkmode;
	}
	public void assin(boolean debugg, boolean sound, boolean autopilot, boolean gamem) throws IOException {
		this.debugg = debugg;
		this.sound = sound;
		this.autopilot = autopilot;
		game = gamem;
		for (int i =0; i < userin; i++) {
			if (i ==0 || i ==2) {
				xOb.add(RanX());
			}else {
				double rand = Math.random();
				if (rand >= 0.5)
					xOb.add(xOb.get(0) + 237);
				else xOb.add(xOb.get(0)-237);
			}
			if (i==0||i==1)
				yOb.add(RanY());
			else {
				double rand = Math.random();
				if (rand >= 0.5)
					yOb.add(yOb.get(0) + 237);
				else yOb.add(yOb.get(0) - 237);
			}
		}
		Collections.sort(yOb);
		Collections.reverse(yOb);
		if (debugg) {
			for (int i= 0; i< userin; i++){
				System.out.println("x" + (i+1) + " " +xOb.get(i));
				fry.writeLog("x" + (i+1) + " " +xOb.get(i));
				System.out.println("y" + (i+1) +" " +yOb.get(i));
				fry.writeLog("y" + (i+1) +" " +yOb.get(i));

			}
		}
	}

	public int RanX() {
		Random randomness = new Random();
		int rand = randomness.nextInt(300)+30;
		return rand;
	}
	public int RanY() {
		Random randomness = new Random();
		int rand = randomness.nextInt(400)+30;
		return rand;
	}
	int owenn;
	int owenn2;
	class Method_T extends Component {
		private static final long serialVersionUID = 1L;
		int ccc = 0;
		public void paint(Graphics g){

			for (int i =0; i < userin; i++) {
				g.setColor(obstacle);
				g.fillRect(xOb.get(i),yOb.get(i),150,150);
				if ((y >= yOb.get(i) && y<= yOb.get(i) +150) && (x+123 >= xOb.get(i)  && x+123 <= xOb.get(i)+150) && debugg) {
					g.setColor(Color.gray);
					g.fillRect(xOb.get(i),yOb.get(i),150,150);
			owenn = y;
					owenn2 = x;
					if (ccc == 0) {
						System.out.println("Hit at x of object: "+owenn2);
						System.out.println("Hit at y of object: "+owenn);
						fry.writeLog("Hit at x of object: "+owenn2);
						fry.writeLog("Hit at y of object: "+owenn);
						ccc++;
					}
				}
				else if ((y >= yOb.get(i)  && y<= yOb.get(i) +150) && (x >= xOb.get(i)  && x <= xOb.get(i)+150) && debugg) {
					g.setColor(Color.gray);
					g.fillRect(xOb.get(i),yOb.get(i),150,150);
				owenn = y;
					owenn2 = x;
					if (ccc ==0) {
						System.out.println("Hit at x of object: "+owenn2);
						System.out.println("Hit at y of object: "+owenn);
						fry.writeLog("Hit at x of object: "+owenn2);
						fry.writeLog("Hit at y of object: "+owenn);
						ccc++;
					}
				}
			}
			if (debugg) {
				g.setColor(Color.black);
				g.fillOval(x, y, 10, 10);
				g.setColor(Color.black);
				g.fillOval(x+123, y, 10, 10);
				g.setColor(Color.red);
				g.drawString(msg, 300, 750);
				int c = 700;
				int cc = 700;

				for (int i =0; i<userin; i++) {
					g.drawString("Hit at y of object: "+owenn, 250, 660);	
					g.drawString("Hit at x of object :"+owenn2, 250, 675);
					g.drawString("y object: "+y, 150, 660);	
					g.drawString("x object: "+x, 150, 675);
					g.drawString("x"+(i+1)+": "+xOb.get(i), 500, c+=20);
					g.drawString("y"+(i+1)+": "+yOb.get(i), 430, cc+=20);
					g.drawString("lab(s) ran: "+lalala, 60, 720);
					g.drawString("Obstacle(s): "+userin, 60, 700);
					g.drawString("lab(s): "+alala, 60, 680);	
					g.drawString("auto-pilot: "+autopilot, 250, 690);	
					g.drawString("Game mode: "+game, 250, 705);	
					g.drawString("Custom Algorithm: "+ca, 250, 720);	


				}
			}
			g.setColor(object);
			g.fillRect(x + 40, y +40, 50, 50);
		}
	}
	public void run() {
		frame = new JFrame("AO Simulator" + " @Debug mode: "+debugg + ", sound: "+ sound); 
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
		contentt = new Method_T();
		if (dark) {
			frame.getContentPane().setBackground(Color.DARK_GRAY);  
		}
		frame.getContentPane().add(BorderLayout.CENTER, contentt);  
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("lollol.png")));
		frame.setResizable(false);
		frame.setSize(600, 800); 
		if (autopilot) {
			frame.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent event) {
					moveTheTHing(event);
				}
			});
		}
		frame.setFocusable(true); 
		frame.setLocationRelativeTo(null);
		frame.setVisible(true); 
		   int firstexe = 0;
			if (game&&firstexe==0) {
		   	 up = false;
		   	 firstexe++;
		    }
		runpls();
	}


	private boolean right = false;
	private boolean left = false;
	private boolean up = true;
	private boolean down = false;
	private boolean check = true;
 
	
	public void moveTheTHing(KeyEvent event) { 
         
	
		int key = event.getKeyCode(); 
		int key2 = event.getKeyChar();
		if (key == KeyEvent.VK_LEFT) {
			x-=10;
			check = false;
			msg = "LEFT";
		}
		else if (key == KeyEvent.VK_RIGHT) {
			x+=10;
			check = false;
			msg = "RIGHT";
		}
		else if (key == KeyEvent.VK_UP) {
			y-=20;
			check = false;
			msg = "UP";
		}
		else if (key == KeyEvent.VK_DOWN) {
			y+=20;
			check = false;
			msg = "DOWN";
		}
		if (key2 == 's') {
			up = false;
			msg = "Stop";
		}
		if (key2 == 'c') {
			up = true;
			msg = "Moving";
		}

	}

	public void gameover(){
	fry.writeLog("Game over");
	System.out.println("Game over");
	est.getEst();
    try {
		fry.YouLose();
	} catch (Exception e) {
		fry.writeLog(e.toString());
	}
	frame.setVisible(false);

	Nani nina = new Nani(dark);
	try {
		nina.Nihaoma();
	} catch (Exception e) {
        fry.writeLog(e.toString());
		e.printStackTrace();
	}
	System.exit(0);
	}
	
	public void runpls(){
		while(true) {

			for (int i =0; i < userin; i ++) {
				
				if(game) {
					
					if ((y+40 >= yOb.get(i) && y+40<= yOb.get(i) +150) && (x+40 >= xOb.get(i)  && x+40 <= xOb.get(i)+150) ) {

						gameover();
					}
					else if ((y+90 >= yOb.get(i)  && y+90<= yOb.get(i) +150) && (x+90 >= xOb.get(i)  && x+90 <= xOb.get(i)+150) ) {
						gameover();
						
					}
					
				}
				
				if ((y >= yOb.get(i) && y<= yOb.get(i) +150) && (x+123 >= xOb.get(i)  && x+123 <= xOb.get(i)+150) && check) {

					left = true;
					right = false;
				}
				else if ((y >= yOb.get(i)  && y<= yOb.get(i) +150) && (x >= xOb.get(i)  && x <= xOb.get(i)+150) && check) {
					left = false;
					right = true;
				}
				if (i==3){
					if (yOb.get(userin-2)-yOb.get(userin-1)-150<= 35 &&( (xOb.get(userin-2) < xOb.get(userin-1) && xOb.get(userin-3) > xOb.get(userin-1))||(xOb.get(userin-3) < xOb.get(userin-1) && xOb.get(userin -2) > xOb.get(userin-1)))){
						down= true;
					}
				}
				int fff = 0;
				if(down){
					y+=3;
					fff++;
					if (fff==50){
						right =!right;
						left =!left;
						fff=0;
						up=true;
					}
				}


				if (left) {
					msg = "LEFT";
					x-=3;
					if (y <= yOb.get(i) +150 && (x+123) < xOb.get(i)  ) { up = true; }
					else up = false;
					if (sound) {
						Soundfx soundfx = new Soundfx();
						soundfx.sound();
					}
				}
				if(right) {
					msg = "RIGHT";
					x+=3;
					if (y <= yOb.get(i) +150 && x > xOb.get(i)  ) { up = true; }
					else up = false;
					if (sound) {
						Soundfx soundfx = new Soundfx();
						soundfx.sound();
					}
				}
				if(up) {
					y--;
					left = false;
					right = false;
				}
				if (y+40+50 <= 0) {
					if (sound) {
						Soundfx soundfx = new Soundfx();
						soundfx.sound();
					}
					frame.setVisible(false); 
					return;
				}
				try {
					Thread.sleep(3); 
				}
				catch (Exception nothing) {
					nothing.printStackTrace();
					fry.writeLog(nothing.toString());

				} 
				frame.repaint(); 
				right = false;
				left = false;
			}
		}
	}
}

