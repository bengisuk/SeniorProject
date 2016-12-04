import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;


public class VoiceThread implements Runnable{
	 Voice voc = new Voice("kevin16");
	 //gerek yok isSpeaking e
	 //	 static boolean isSpeaking;
	 MainPageView1 frame ;
	@Override
	public void run() {
		// TODO Auto-generated method stub		
		MainPageView1.panelLab.setIcon(new ImageIcon("konusan.gif"));
		voc.say("hello welcome out application. Please enter the infortmation that we need.");
		MainPageView1.panelLab.setIcon(new ImageIcon("goz.gif"));
		MainPageView1.panel.repaint();
		Main.frame.repaint();
		frame.btnOk.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				//Thread t1 = new Thread(new BodyShapeThread());
				//t1.start();
				// TODO Auto-generated method stub
				/*Thread t1 = new Thread(new BodyShapeThread());
				t1.run();*/

				if(e!= null){
					System.out.println("wdfg");
					System.out.println(frame.kalcaTF.getName());
					double kalca=Double.parseDouble(frame.kalcaTF.getText());
					double bel = Double.parseDouble(frame.belTF.getText());
					double gogus = Double.parseDouble(frame.gogusTF.getText());
					BodyShape bs = new BodyShape(gogus,bel,kalca);

					if(bs.sayElma(gogus, bel, kalca)){
						System.out.println("elmasın");
						voc.say("you are apple. we analyze your clothes");
					}
					else if(bs.sayKumsaati(gogus, bel, kalca)){
						System.out.println("kum saatisin");
						voc.say("you are hourglass. we analyze your clothes");
					}
					
					else if(bs.sayArmut(gogus, bel, kalca)){
						System.out.println("armut");
						voc.say("you are pear. we analyze your clothes");
					}
					
					else if(bs.sayDikdotgen(gogus, bel, kalca)){
						System.out.println("dikdörtgen");
						voc.say("you are straight. we analyze your clothes");
					}
					
					else if(bs.sayHavuc(gogus, bel, kalca)){
						System.out.println("havuçsun");
						voc.say("you are carrot. we analyze your clothes");
					}
					
					
				}
				
			}
		});
		
		
		
	}

}
