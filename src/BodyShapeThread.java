import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;


public class BodyShapeThread implements Runnable{
	Voice voc = new Voice("kevin16");
	StartPageView frame;
	SizeView fr;
	//SizeView panel;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		frame = new StartPageView();
		frame.setVisible(true);
		frame.avatarLabel.setIcon(new ImageIcon("konusan.gif"));
		voc.say("Welcome our Application. If you know your body sizes you can move with entering body measurement, if you dont know you can proceed with our guide. ");
		frame.avatarLabel.setIcon(new ImageIcon("goz.gif"));
		frame.repaint();
		frame.buttonBodyMeasurement.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e!= null){
					frame.setVisible(false);
					fr = new SizeView();
					fr.setVisible(true);
					VoiceThread bs = new VoiceThread();
					Thread t1 = new Thread(bs);
					t1.start();
					
				}
				
			}
		});
		
	}
}
