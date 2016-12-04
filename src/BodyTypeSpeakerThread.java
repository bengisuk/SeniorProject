import javax.swing.ImageIcon;


public class BodyTypeSpeakerThread implements Runnable{
	public double gogus;
	public double kalca;
	public double bel;
	Voice voc = new Voice("kevin16");
	SizeView frame ;
	
	public BodyTypeSpeakerThread(double gogus, double bel, double kalca){
		this.gogus = gogus;
		this.kalca = kalca;
		this.bel=bel;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		BodyShape bodyShape = new BodyShape(gogus,bel,kalca);
		
		if(bodyShape.sayElma(gogus, bel, kalca)){
			System.out.println("elmasın");
			frame.panelLab.setIcon(new ImageIcon("konusan.gif"));
			voc.say("you are apple. we analyze your clothes");
			frame.panelLab.setIcon(new ImageIcon("goz.gif"));
			frame.repaint();
			
		}
		else if(bodyShape.sayKumsaati(gogus, bel, kalca)){
			System.out.println("kum saatisin");
			frame.panelLab.setIcon(new ImageIcon("konusan.gif"));
			voc.say("you are hourglass. we analyze your clothes");
			frame.panelLab.setIcon(new ImageIcon("goz.gif"));
			frame.repaint();
		}
		
		else if(bodyShape.sayArmut(gogus, bel, kalca)){
			System.out.println("armut");
			frame.panelLab.setIcon(new ImageIcon("konusan.gif"));
			voc.say("you are pear. we analyze your clothes");
			frame.panelLab.setIcon(new ImageIcon("goz.gif"));
			frame.repaint();
		}
		
		else if(bodyShape.sayDikdotgen(gogus, bel, kalca)){
			System.out.println("dikdörtgen");
			frame.panelLab.setIcon(new ImageIcon("konusan.gif"));
			voc.say("you are straight. we analyze your clothes");
			frame.panelLab.setIcon(new ImageIcon("goz.gif"));
			frame.repaint();
		}
		
		else if(bodyShape.sayHavuc(gogus, bel, kalca)){
			System.out.println("havuçsun");
			frame.panelLab.setIcon(new ImageIcon("konusan.gif"));
			voc.say("you are carrot. we analyze your clothes");
			frame.panelLab.setIcon(new ImageIcon("goz.gif"));
			frame.repaint();
		}
		
		
	}
		
	}

