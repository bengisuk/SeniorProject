import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;


public class MainPageView1 extends JFrame {

	private JPanel contentPane;
	static JPanel panel;
	static JButton btnOk;
	static JLabel panelLab;
	private JTextField userNameTF;
	private JTextField ageTF;
	private JTextField jobTF;
	private JTextField chestGirthTF;
	private JTextField waistGirthTF;
	private JTextField hipGirthTF;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public MainPageView1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(6, 6, 115, 166);
		contentPane.add(panel);
		panelLab = new JLabel();
		panel.add(panelLab);
		
		userNameTF = new JTextField();
		userNameTF.setBounds(292, 6, 134, 28);
		contentPane.add(userNameTF);
		userNameTF.setColumns(10);
		
		ageTF = new JTextField();
		ageTF.setColumns(10);
		ageTF.setBounds(292, 46, 134, 28);
		contentPane.add(ageTF);
		
		jobTF = new JTextField();
		jobTF.setColumns(10);
		jobTF.setBounds(292, 86, 134, 28);
		contentPane.add(jobTF);
		
		chestGirthTF = new JTextField();
		chestGirthTF.setColumns(10);
		chestGirthTF.setBounds(292, 126, 134, 28);
		contentPane.add(chestGirthTF);
		
		waistGirthTF = new JTextField();
		waistGirthTF.setColumns(10);
		waistGirthTF.setBounds(292, 166, 134, 28);
		contentPane.add(waistGirthTF);
		
		btnOk = new JButton("OK!");
		btnOk.setBounds(302, 257, 107, 29);
		contentPane.add(btnOk);
		btnOk.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//if(e!= null){
					System.out.println("sdfg");
					
					contentPane.repaint();
				}
				
			//}
		});
		
		JLabel userNameLbl = new JLabel("User Name:");
		userNameLbl.setBounds(156, 12, 101, 16);
		contentPane.add(userNameLbl);
		
		JLabel ageLbl = new JLabel("Age:");
		ageLbl.setBounds(156, 52, 101, 16);
		contentPane.add(ageLbl);
		
		JLabel jobLbl = new JLabel("Job:");
		jobLbl.setBounds(156, 92, 101, 16);
		contentPane.add(jobLbl);
		
		JLabel lblChestGirth = new JLabel("Chest Girth:");
		lblChestGirth.setBounds(156, 132, 101, 16);
		contentPane.add(lblChestGirth);
		
		JLabel lblWaistGirth = new JLabel("Waist Girth:");
		lblWaistGirth.setBounds(156, 172, 101, 16);
		contentPane.add(lblWaistGirth);
		
		hipGirthTF = new JTextField();
		hipGirthTF.setColumns(10);
		hipGirthTF.setBounds(292, 206, 134, 28);
		contentPane.add(hipGirthTF);
		
		JLabel lblHipGirth = new JLabel("Hip Girth:");
		lblHipGirth.setBounds(156, 212, 101, 16);
		contentPane.add(lblHipGirth);
	}
}
