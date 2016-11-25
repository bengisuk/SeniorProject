import javax.swing.ImageIcon;


public class VoiceThread implements Runnable{
	 Voice voc = new Voice("kevin16");
	 static boolean isSpeaking;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		MainPageView1.panelLab.setIcon(new ImageIcon("konusan.gif"));
		voc.say("Hello welcome our application. please enter your information then OK!");
		MainPageView1.panelLab.setIcon(new ImageIcon("goz.gif"));
		MainPageView1.panel.repaint();
		Main.frame.repaint();
		
	}

}
