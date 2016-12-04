import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;


public class BodyShapeThread implements Runnable{
	Voice voc = new Voice("kevin16");
	MainPageView1 frame;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		MainPageView1.panelLab.setIcon(new ImageIcon("konusan.gif"));
		MainPageView1.panel.repaint();
		Main.frame.repaint();
		frame.btnOk.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e!= null){
					System.out.println("wdfg");
					System.out.println(frame.kalcaTF.getName());
					float kalca=Float.parseFloat(frame.kalcaTF.getText());
					System.out.println(kalca);
					float bel = Float.parseFloat(frame.belTF.getText());
					float gogus = Float.parseFloat(frame.gogusTF.getText());
					BodyShape bs = new BodyShape(kalca,bel,gogus);

					if(bs.sayElma(gogus, bel, kalca)){
						System.out.println("elmasın");
						voc.say("you are apple. we analyze your clothes");
					}
					
				}
				
			}
		});
		
	}
}
