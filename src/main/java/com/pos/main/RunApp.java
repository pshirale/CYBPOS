package com.pos.main;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.border.LineBorder;

import java.awt.Color;
import java.io.File;

import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import com.pos.ui.SecondScrFrame;

public class RunApp extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnExit;
	private JButton btnMinimize;
	private static RunApp frame;
	private JTextField txtusername;
	private JPasswordField txtpassword;
	private JPanel loginPanel;
	private JButton btnLogin;
	private JLabel lblCopyright;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new RunApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param btnMinimize 
	 */
	public RunApp() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1250, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(Color.WHITE));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		//ClassLoader classLoader = ClassLoader.getSystemClassLoader();
		ClassLoader classLoader = this.getClass().getClassLoader();
		
		//InputStream in = getClass().getResourceAsStream("/CYBPOS/Img/bg.jpg");
		File file = new File(classLoader.getResource("bg2.jpg").getFile());
		//String path=file.getPath();
		//System.err.println(path);
		ImagePanel mainPanel = new ImagePanel( new ImageIcon(file.getPath()).getImage());
		mainPanel.setBounds(1, 1, 1248, 698);
		contentPane.add(mainPanel);
		
		btnExit = new JButton("X");
		btnExit.setFocusPainted(false);
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnExit.setHorizontalTextPosition(SwingConstants.CENTER);
		btnExit.setForeground(Color.WHITE);
		btnExit.setContentAreaFilled(false);
		btnExit.setBorder(new LineBorder(new Color(255, 255, 255)));
		btnExit.setVerticalAlignment(SwingConstants.TOP);
		mainPanel.setLayout(null);
		btnExit.setBounds(1211, -1, 36, 23);
		mainPanel.add(btnExit);
		btnExit.addActionListener(this);
		
		 btnMinimize = new JButton("_");
		btnMinimize.setFocusPainted(false);
		btnMinimize.setVerticalAlignment(SwingConstants.TOP);
		btnMinimize.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMinimize.setForeground(Color.WHITE);
		btnMinimize.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 13));
		btnMinimize.setContentAreaFilled(false);
		btnMinimize.setBorder(new LineBorder(new Color(255, 255, 255)));
		btnMinimize.setBounds(1176, -1, 36, 23);
		mainPanel.add(btnMinimize);
		btnMinimize.addActionListener(this);
		
		 loginPanel = new JPanel();
		loginPanel.setBorder(new MatteBorder(0, 1, 1, 1, (Color) Color.WHITE));
		loginPanel.setOpaque(false);
		loginPanel.setBounds(899, 106, 296, 225);
		mainPanel.add(loginPanel);
		loginPanel.setLayout(null);
		
		txtusername = new JTextField();
		txtusername.setBackground(new Color(204, 204, 204));
		txtusername.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtusername.setBorder(null);
		txtusername.setBounds(38, 28, 223, 37);
		loginPanel.add(txtusername);
		txtusername.setColumns(10);
		
		txtpassword = new JPasswordField();
		txtpassword.setBackground(new Color(204, 204, 204));
		txtpassword.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtpassword.setBorder(null);
		txtpassword.setBounds(38, 93, 223, 37);
		loginPanel.add(txtpassword);
		
		 btnLogin = new JButton("Log In");
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setFont(new Font("Dialog", Font.BOLD, 13));
		btnLogin.setBackground(new Color(51, 204, 102));
		btnLogin.setFocusPainted(false);
		btnLogin.setBorder(null);
		btnLogin.setBounds(38, 158, 223, 37);
		loginPanel.add(btnLogin);
		btnLogin.addActionListener(this);
		
		
		JLabel loginLabel = new JLabel("EMPLOYEE  LOGIN");
		loginLabel.setFont(new Font("Khmer UI", Font.BOLD, 16));
		loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
		loginLabel.setForeground(Color.WHITE);
		loginLabel.setBorder(new MatteBorder(1, 1, 0, 1, (Color) Color.WHITE));
		loginLabel.setBackground(Color.ORANGE);
		loginLabel.setOpaque(true);
		loginLabel.setBounds(899, 61, 296, 44);
		mainPanel.add(loginLabel);
		
		lblCopyright = new JLabel("<html> Copyright &#0169; 2018-2019 Cybware System Pvt Ltd. &nbsp  &nbsp &nbsp &nbsp </html>");
		lblCopyright.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCopyright.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblCopyright.setForeground(Color.WHITE);
		lblCopyright.setBounds(868, 670, 379, 28);
		mainPanel.add(lblCopyright);
		
		
		
		 
		
		setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String action=arg0.getActionCommand();
		System.err.println(action);
		if(action.equals("X"))
		{
			System.exit(0);
		}
		if(action.equals("_"))
		{
			super.setExtendedState(JFrame.ICONIFIED);
			//System.out.println("ICONIFIED");
		}
		if(action.equals("Log In"))
		{
			SecondScrFrame frame = new SecondScrFrame();
			frame.setVisible(true);
			dispose();
		}
		
	}
	
}
