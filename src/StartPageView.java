import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;


public class StartPageView extends JFrame{
	
	public JButton buttonBodyMeasurement;
	public JButton buttonGuide ;
	public static JPanel avatarPanel;
	public static JPanel contentPane;
	public static JLabel avatarLabel;
	
	public StartPageView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		avatarPanel = new JPanel();
		avatarPanel.setBounds(41, 49, 115, 166);	
		contentPane.add(avatarPanel);
		avatarLabel= new JLabel();
		avatarPanel.add(avatarLabel);
		
		
		buttonBodyMeasurement = new JButton("Enter Body Measurement");
		buttonBodyMeasurement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonBodyMeasurement.setBounds(218, 76, 195, 38);
		getContentPane().add(buttonBodyMeasurement);
		
		buttonGuide = new JButton("Check-Out Our Guide");
		buttonGuide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonGuide.setBounds(218, 138, 195, 38);
		getContentPane().add(buttonGuide);
	}
}
