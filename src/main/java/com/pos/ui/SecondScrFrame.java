package com.pos.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

import com.pos.main.RunApp;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Insets;
import java.io.File;
import java.net.URL;

public class SecondScrFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JPanel fullpanel;
	private JButton btnClose;
	private JPanel middlepanel;
	private JLabel lblcopyright;
	private JButton btnAddEmp;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SecondScrFrame frame = new SecondScrFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public SecondScrFrame() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1250, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(Color.WHITE));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		fullpanel = new JPanel();
		fullpanel.setBackground(new Color(8,12,11));
		fullpanel.setBounds(1, 1, 1248, 698);
		contentPane.add(fullpanel);
		fullpanel.setLayout(null);
		
		 btnClose = new JButton("Close");
		btnClose.setHorizontalTextPosition(SwingConstants.CENTER);
		btnClose.setForeground(new Color(255, 51, 0));
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnClose.setFocusPainted(false);
		btnClose.setContentAreaFilled(false);
		btnClose.setBorder(new LineBorder(new Color(255, 255, 255)));
		btnClose.setBounds(1188, 5, 55, 23);
		fullpanel.add(btnClose);
		btnClose.addActionListener(this);

		middlepanel = new JPanel();
		middlepanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 255, 255)));
		middlepanel.setOpaque(false);
		middlepanel.setBounds(692, 366, 551, 289);
		fullpanel.add(middlepanel);
		middlepanel.setLayout(null);
		
		btnAddEmp = new JButton("");
		btnAddEmp.setActionCommand("addemp");
		btnAddEmp.setBorder(null);
		btnAddEmp.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnAddEmp.setIcon(new ImageIcon(SecondScrFrame.class.getResource("/img/addemp.jpg")));
		btnAddEmp.setFocusPainted(false);
		btnAddEmp.setBorderPainted(false);
		btnAddEmp.setSelectedIcon(null);
		btnAddEmp.setHideActionText(true);
		btnAddEmp.setMargin(new Insets(50, 14, 2, 14));
		btnAddEmp.setBounds(209, 28, 86, 86);
		middlepanel.add(btnAddEmp);
		btnAddEmp.addActionListener(this);
		
		JLabel lbladdemp = new JLabel("Add Employee");
		lbladdemp.setBorder(null);
		lbladdemp.setForeground(Color.WHITE);
		lbladdemp.setBackground(new Color(220, 20, 60));
		lbladdemp.setHorizontalAlignment(SwingConstants.CENTER);
		lbladdemp.setOpaque(true);
		lbladdemp.setBounds(209, 113, 86, 18);
		middlepanel.add(lbladdemp);
		
		JButton btnStocks = new JButton("");
		btnStocks.setIcon(new ImageIcon(SecondScrFrame.class.getResource("/img/addstocks.jpg")));
		btnStocks.setMargin(new Insets(50, 14, 2, 14));
		btnStocks.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnStocks.setHideActionText(true);
		btnStocks.setFocusPainted(false);
		btnStocks.setBorderPainted(false);
		btnStocks.setBorder(null);
		btnStocks.setActionCommand("addinventry");
		btnStocks.setBounds(321, 28, 86, 86);
		middlepanel.add(btnStocks);
		
		JLabel lblAddInventry = new JLabel("Add Inventry");
		lblAddInventry.setOpaque(true);
		lblAddInventry.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddInventry.setForeground(Color.WHITE);
		lblAddInventry.setBorder(null);
		lblAddInventry.setBackground(new Color(220, 20, 60));
		lblAddInventry.setBounds(321, 114, 86, 18);
		middlepanel.add(lblAddInventry);
		
		JButton btnReports = new JButton("");
		btnReports.setIcon(new ImageIcon(SecondScrFrame.class.getResource("/img/reports.jpg")));
		btnReports.setMargin(new Insets(50, 14, 2, 14));
		btnReports.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnReports.setHideActionText(true);
		btnReports.setFocusPainted(false);
		btnReports.setBorderPainted(false);
		btnReports.setBorder(null);
		btnReports.setActionCommand("reports");
		btnReports.setBounds(321, 155, 86, 86);
		middlepanel.add(btnReports);
		
		JLabel lblAllReports = new JLabel("All Reports");
		lblAllReports.setOpaque(true);
		lblAllReports.setHorizontalAlignment(SwingConstants.CENTER);
		lblAllReports.setForeground(Color.WHITE);
		lblAllReports.setBorder(null);
		lblAllReports.setBackground(new Color(220, 20, 60));
		lblAllReports.setBounds(321, 241, 86, 18);
		middlepanel.add(lblAllReports);
		
		JButton btnBilling = new JButton("");
		btnBilling.setIcon(new ImageIcon(SecondScrFrame.class.getResource("/img/billingIconlarge.jpg")));
		btnBilling.setMargin(new Insets(50, 14, 2, 14));
		btnBilling.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnBilling.setHideActionText(true);
		btnBilling.setFocusPainted(false);
		btnBilling.setBorderPainted(false);
		btnBilling.setBorder(null);
		btnBilling.setActionCommand("billing");
		btnBilling.setBounds(25, 28, 161, 213);
		middlepanel.add(btnBilling);
		
		JLabel lblBilling = new JLabel("Start Billing");
		lblBilling.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBilling.setOpaque(true);
		lblBilling.setHorizontalAlignment(SwingConstants.CENTER);
		lblBilling.setForeground(Color.WHITE);
		lblBilling.setBorder(null);
		lblBilling.setBackground(new Color(220, 20, 60));
		lblBilling.setBounds(25, 241, 161, 18);
		middlepanel.add(lblBilling);
		
		JButton btnTax = new JButton("");
		btnTax.setIcon(new ImageIcon(SecondScrFrame.class.getResource("/img/taxes.jpg")));
		btnTax.setMargin(new Insets(50, 14, 2, 14));
		btnTax.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnTax.setHideActionText(true);
		btnTax.setFocusPainted(false);
		btnTax.setBorderPainted(false);
		btnTax.setBorder(null);
		btnTax.setActionCommand("tax");
		btnTax.setBounds(439, 28, 86, 86);
		middlepanel.add(btnTax);
		
		JLabel lblTaxes = new JLabel("Taxes");
		lblTaxes.setOpaque(true);
		lblTaxes.setHorizontalAlignment(SwingConstants.CENTER);
		lblTaxes.setForeground(Color.WHITE);
		lblTaxes.setBorder(null);
		lblTaxes.setBackground(new Color(220, 20, 60));
		lblTaxes.setBounds(439, 114, 86, 18);
		middlepanel.add(lblTaxes);
		
		JButton btnSettings = new JButton("");
		btnSettings.setIcon(new ImageIcon(SecondScrFrame.class.getResource("/img/settings.jpg")));
		btnSettings.setMargin(new Insets(50, 14, 2, 14));
		btnSettings.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnSettings.setHideActionText(true);
		btnSettings.setFocusPainted(false);
		btnSettings.setBorderPainted(false);
		btnSettings.setBorder(null);
		btnSettings.setActionCommand("setup");
		btnSettings.setBounds(209, 155, 86, 86);
		middlepanel.add(btnSettings);
		
		JLabel lblSettings = new JLabel("Settings");
		lblSettings.setOpaque(true);
		lblSettings.setHorizontalAlignment(SwingConstants.CENTER);
		lblSettings.setForeground(Color.WHITE);
		lblSettings.setBorder(null);
		lblSettings.setBackground(new Color(220, 20, 60));
		lblSettings.setBounds(209, 241, 86, 18);
		middlepanel.add(lblSettings);
		
		JButton btnAbout = new JButton("");
		btnAbout.setIcon(new ImageIcon(SecondScrFrame.class.getResource("/img/about.png")));
		btnAbout.setMargin(new Insets(50, 14, 2, 14));
		btnAbout.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnAbout.setHideActionText(true);
		btnAbout.setFocusPainted(false);
		btnAbout.setBorderPainted(false);
		btnAbout.setBorder(null);
		btnAbout.setActionCommand("about");
		btnAbout.setBounds(439, 155, 86, 86);
		middlepanel.add(btnAbout);
		
		JLabel lblAbout = new JLabel("About");
		lblAbout.setOpaque(true);
		lblAbout.setHorizontalAlignment(SwingConstants.CENTER);
		lblAbout.setForeground(Color.WHITE);
		lblAbout.setBorder(null);
		lblAbout.setBackground(new Color(220, 20, 60));
		lblAbout.setBounds(439, 241, 86, 18);
		middlepanel.add(lblAbout);
		
		lblcopyright = new JLabel("<html> Copyright &#0169; 2018-2019 Cybware System Pvt Ltd. &nbsp  &nbsp &nbsp &nbsp </html>");
		lblcopyright.setHorizontalTextPosition(SwingConstants.LEADING);
		lblcopyright.setBounds(0, 660, 1248, 38);
		fullpanel.add(lblcopyright);
		lblcopyright.setOpaque(true);
		lblcopyright.setHorizontalAlignment(SwingConstants.RIGHT);
		lblcopyright.setForeground(new Color(255, 51, 0));
		lblcopyright.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblcopyright.setBorder(new MatteBorder(1, 0, 0, 0, (Color) new Color(255, 255, 255)));
		lblcopyright.setBackground(new Color(64, 224, 208));
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String action=arg0.getActionCommand();
		System.err.println(action);
		if(action.equals("Close"))
		{
			RunApp runapp=new RunApp();
			runapp.setVisible(true);
			dispose();
		}
		
	}
}
