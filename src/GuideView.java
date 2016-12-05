import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.JLabel;

import java.awt.FlowLayout;
import java.awt.BorderLayout;

import javax.swing.JButton;


public class GuideView extends JFrame{
	public static JPanel contentPane;
	JButton buttonElma;
	JButton buttonArmut;
	JButton buttonDikdortgen;
	JButton buttonKumsaati;
	JButton buttonHavuc;
	public GuideView() {
		contentPane = new JPanel();
		setBounds(100, 100, 450, 350);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton buttonElma = new JButton("New button");
		buttonElma.setBounds(31, 22, 110, 140);
		buttonElma.setIcon(new ImageIcon("elma.png"));
		contentPane.add(buttonElma);
		
		JButton buttonArmut = new JButton("New button");
		buttonArmut.setBounds(170, 22, 110, 140);
		buttonArmut.setIcon(new ImageIcon("armut.png"));
		contentPane.add(buttonArmut);
		
		JButton buttonDikdortgen = new JButton("New button");
		buttonDikdortgen.setBounds(306, 22, 110, 140);
		buttonDikdortgen.setIcon(new ImageIcon("dikdortgen.png"));
		contentPane.add(buttonDikdortgen);
		
		JButton buttonKumsaati = new JButton("New button");
		buttonKumsaati.setBounds(94, 174, 110, 140);
		buttonKumsaati.setIcon(new ImageIcon("kumsaati.png"));
		contentPane.add(buttonKumsaati);
		
		JButton buttonHavuc = new JButton("New button");
		buttonHavuc.setBounds(251, 174, 110, 140);
		buttonHavuc.setIcon(new ImageIcon("havuc.png"));
		contentPane.add(buttonHavuc);
	}
}
