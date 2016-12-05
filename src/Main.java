import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.lang.Math;

public class Main extends JFrame{
	static SizeView frame;
	static StartPageView fr;
	public static Thread tr;

	public static void main(String[] args){
		new Main();
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {

						/*frame = new SizeView();
						frame.setVisible(true);*/
						//ImageIcon icon = new ImageIcon("konusan.gif");
						//System.out.println(icon.getIconHeight());
						//JLabel lab = new JLabel(icon);
						//MainPageView1.panel.add(lab);
						//MainPageView1.panel.repaint();
						//frame.repaint();
						tr = new Thread(new StartPageThread());
						tr.start();
						/*tr = new Thread(new VoiceThread());
						tr.start();
						//Thread tr2 = new Thread( )*/
						/*while(true){
							if(VoiceThread.isSpeaking == false){
								lab.setIcon(new ImageIcon("goz.gif"));
								MainPageView1.panel.repaint();
								frame.repaint();
							}
						}/*
						/*MainPageView1.btnOk.addActionListener(new ActionListener(){

							@Override
							public void actionPerformed(ActionEvent e) {
								
								
							}
							
						});*/
						
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
	}
	
}
