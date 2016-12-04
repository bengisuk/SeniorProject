import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;


public class VoiceThread implements Runnable{
	 Voice voc = new Voice("kevin16");
	 SizeView frame ;
	@Override
	public void run() {
		// TODO Auto-generated method stub	
		frame = new SizeView();
		frame.setVisible(true);
		frame.panelLab.setIcon(new ImageIcon("konusan.gif"));
		voc.say("Here , Please enter the infortmation that we need.");
		frame.panelLab.setIcon(new ImageIcon("goz.gif"));
		frame.repaint();
		addOkButtonListener();
		addBackButtonListener();
		
		
	}
	
	public void addOkButtonListener(){
		frame.btnOk.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(e!= null){
					double kalca=Double.parseDouble(frame.kalcaTF.getText());
					double bel = Double.parseDouble(frame.belTF.getText());
					double gogus = Double.parseDouble(frame.gogusTF.getText());
					BodyTypeSpeakerThread bodyType = new BodyTypeSpeakerThread(gogus,bel,kalca);
					Thread tr = new Thread(bodyType);
					tr.start();
				}
				}
			});
		}

	public void addBackButtonListener(){
		frame.buttonBack.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e!= null){
					BodyShapeThread bsthread = new BodyShapeThread();
					frame.setVisible(false);
					Thread tr = new Thread(bsthread);
					tr.start();
					

					
				}
				
			}
		});
		
	}

}
