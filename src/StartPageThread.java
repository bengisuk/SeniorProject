import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;


public class StartPageThread implements Runnable{
	Voice voc = new Voice("kevin16");
	StartPageView startPageFrame;
	SizeView sizeViewFrame;
	Boolean isSpeaking;
	//SizeView panel;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		startPageFrame = new StartPageView();
		startPageFrame.setVisible(true);
		addGuideButtonListener();
		addBodyMeasurementButtonListener();
		startPageFrame.avatarLabel.setIcon(new ImageIcon("konusan.gif"));
		isSpeaking= true;
		voc.say("Welcome our Application. If you know your body sizes you can move with entering body measurement, if you dont know you can proceed with our guide. ");
		isSpeaking=false;
		startPageFrame.avatarLabel.setIcon(new ImageIcon("goz.gif"));
		startPageFrame.repaint();

		
	}
	public void addBodyMeasurementButtonListener(){
		System.out.println("geldi-1");
		startPageFrame.buttonBodyMeasurement.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e!= null){
					if(isSpeaking){
					voc.stop();
					startPageFrame.setVisible(false);
					sizeViewFrame = new SizeView();
					sizeViewFrame.setVisible(true);
					VoiceThread bs = new VoiceThread();
					Thread t1 = new Thread(bs);
					t1.start();
					}
					
				}
				
			}
		});
	}
	
	public void addGuideButtonListener(){
		System.out.println("geldi");
		/*startPageFrame.buttonGuide.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e!=null){
					System.out.println("geldi");
					if(isSpeaking){
						voc.stop();
						startPageFrame.setVisible(false);
						GuideView guideViewFrame = new GuideView();
						guideViewFrame.setVisible(true);
						//GuideThread guideThread = new GuideThread();
						//Thread t1 = new Thread(guideThread);
						//t1.start();
					}
				}
			}
		});*/
	}
}
