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
					BodyShape bodyShape = new BodyShape(gogus,bel,kalca);
					if(bodyShape.sayElma(gogus, bel, kalca)){
						System.out.println("elmasın");
						voc.say("you are apple. we analyze your clothes");
					}
					else if(bodyShape.sayKumsaati(gogus, bel, kalca)){
						System.out.println("kum saatisin");
						voc.say("you are hourglass. we analyze your clothes");
					}
					
					else if(bodyShape.sayArmut(gogus, bel, kalca)){
						System.out.println("armut");
						voc.say("you are pear. we analyze your clothes");
					}
					
					else if(bodyShape.sayDikdotgen(gogus, bel, kalca)){
						System.out.println("dikdörtgen");
						voc.say("you are straight. we analyze your clothes");
					}
					
					else if(bodyShape.sayHavuc(gogus, bel, kalca)){
						System.out.println("havuçsun");
						voc.say("you are carrot. we analyze your clothes");
					}
					
					
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
