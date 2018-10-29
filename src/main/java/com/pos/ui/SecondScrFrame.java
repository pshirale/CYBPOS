package com.pos.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import com.pos.gen.GetColors;
import com.pos.main.RunApp;
import java.awt.SystemColor;

@SuppressWarnings("serial")
public class SecondScrFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JPanel fullpanel;
	private JButton btnClose;
	private JPanel middlepanel;
	private JLabel lblcopyright;
	private JButton btnAddEmp;
	private JButton btnAbout;
	private JButton btnSettings;
	private JButton btnTax;
	private JButton btnStocks;
	private JButton btnReports;
	private JButton btnBilling;
	private JPanel headerPanel;
	private JLabel lblscreenname;

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
		headerPanel = new JPanel();

		headerPanel.setLayout(null);
		headerPanel.setBorder(null);
		headerPanel.setBackground(GetColors.headerCoolor);
		headerPanel.setBounds(0, 0, 1248, 23);
		fullpanel.add(headerPanel);
		
		lblscreenname = new JLabel("Home");
		lblscreenname.setIcon(new ImageIcon(SecondScrFrame.class.getResource("/icons/Homeicon.jpg")));
		lblscreenname.setForeground(SystemColor.control);
		lblscreenname.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblscreenname.setBounds(2, 0, 124, 23);
		headerPanel.add(lblscreenname);

		btnClose = new JButton("X");
		btnClose.setActionCommand("Close");
		btnClose.setHorizontalTextPosition(SwingConstants.CENTER);
		btnClose.setForeground(Color.WHITE);
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnClose.setFocusPainted(false);
		btnClose.setContentAreaFilled(false);
		btnClose.setBorder(null);
		btnClose.setBounds(1220, 0, 29, 23);
		btnClose.addActionListener(this);
		headerPanel.add(btnClose);

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
		btnAddEmp.setIcon(new ImageIcon(SecondScrFrame.class.getResource("/icons/addemployeer.jpg")));
		btnAddEmp.setFocusPainted(false);
		btnAddEmp.setBorderPainted(false);
		btnAddEmp.setSelectedIcon(null);
		btnAddEmp.setHideActionText(true);
		btnAddEmp.setMargin(new Insets(50, 14, 2, 14));
		btnAddEmp.setBounds(209, 28, 86, 101);
		middlepanel.add(btnAddEmp);
		btnAddEmp.addActionListener(this);

		btnStocks = new JButton("");
		btnStocks.setIcon(new ImageIcon(SecondScrFrame.class.getResource("/icons/inventryr.jpg")));
		btnStocks.setMargin(new Insets(50, 14, 2, 14));
		btnStocks.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnStocks.setHideActionText(true);
		btnStocks.setFocusPainted(false);
		btnStocks.setBorderPainted(false);
		btnStocks.setBorder(null);
		btnStocks.setActionCommand("addinventry");
		btnStocks.setBounds(321, 28, 86, 101);
		middlepanel.add(btnStocks);
		btnStocks.addActionListener(this);

		btnReports = new JButton("");
		btnReports.setIcon(new ImageIcon(SecondScrFrame.class.getResource("/icons/reportsr.jpg")));
		btnReports.setMargin(new Insets(50, 14, 2, 14));
		btnReports.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnReports.setHideActionText(true);
		btnReports.setFocusPainted(false);
		btnReports.setBorderPainted(false);
		btnReports.setBorder(null);
		btnReports.setActionCommand("reports");
		btnReports.setBounds(321, 155, 86, 104);
		middlepanel.add(btnReports);
		btnReports.addActionListener(this);

		btnBilling = new JButton("");
		btnBilling.setIcon(new ImageIcon(SecondScrFrame.class.getResource("/icons/billing.jpg")));
		btnBilling.setMargin(new Insets(50, 14, 2, 14));
		btnBilling.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnBilling.setHideActionText(true);
		btnBilling.setFocusPainted(false);
		btnBilling.setBorderPainted(false);
		btnBilling.setBorder(null);
		btnBilling.setActionCommand("billing");
		btnBilling.setBounds(25, 28, 161, 231);
		middlepanel.add(btnBilling);
		btnBilling.addActionListener(this);

		btnTax = new JButton("");
		btnTax.setIcon(new ImageIcon(SecondScrFrame.class.getResource("/icons/taxesr.jpg")));
		btnTax.setMargin(new Insets(50, 14, 2, 14));
		btnTax.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnTax.setHideActionText(true);
		btnTax.setFocusPainted(false);
		btnTax.setBorderPainted(false);
		btnTax.setBorder(null);
		btnTax.setActionCommand("tax");
		btnTax.setBounds(439, 28, 86, 101);
		middlepanel.add(btnTax);
		btnTax.addActionListener(this);

		btnSettings = new JButton("");
		btnSettings.setIcon(new ImageIcon(SecondScrFrame.class.getResource("/icons/settingsr.jpg")));
		btnSettings.setMargin(new Insets(50, 14, 2, 14));
		btnSettings.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnSettings.setHideActionText(true);
		btnSettings.setFocusPainted(false);
		btnSettings.setBorderPainted(false);
		btnSettings.setBorder(null);
		btnSettings.setActionCommand("setup");
		btnSettings.setBounds(209, 155, 86, 104);
		middlepanel.add(btnSettings);
		btnSettings.addActionListener(this);

		btnAbout = new JButton("");
		btnAbout.setIcon(new ImageIcon(SecondScrFrame.class.getResource("/icons/aboutr.jpg")));
		btnAbout.setMargin(new Insets(50, 14, 2, 14));
		btnAbout.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnAbout.setHideActionText(true);
		btnAbout.setFocusPainted(false);
		btnAbout.setBorderPainted(false);
		btnAbout.setBorder(null);
		btnAbout.setActionCommand("about");
		btnAbout.setBounds(439, 155, 86, 104);
		middlepanel.add(btnAbout);
		btnAbout.addActionListener(this);

		lblcopyright = new JLabel("<html> Copyright &#0169; 2018-2019 Cybware System Pvt Ltd. &nbsp  &nbsp &nbsp &nbsp </html>");
		lblcopyright.setHorizontalTextPosition(SwingConstants.LEADING);
		lblcopyright.setBounds(0, 660, 1248, 38);
		fullpanel.add(lblcopyright);
		lblcopyright.setOpaque(true);
		lblcopyright.setHorizontalAlignment(SwingConstants.RIGHT);
		lblcopyright.setForeground(Color.WHITE);
		lblcopyright.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblcopyright.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(255, 255, 255)));
		lblcopyright.setBackground(GetColors.footerCoolor);



	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String action=arg0.getActionCommand();
		System.err.println(action);
		if(action.equals("billing"))
		{
			BillingScreenUI billingscreen=new BillingScreenUI();
			billingscreen.setVisible(true);
			dispose();
		}
		if(action.equals("tax"))
		{
			TaxesDataDisplay taxesdatadisplay=new TaxesDataDisplay();
			taxesdatadisplay.setVisible(true);
			dispose();
		}
		if(action.equals("addemp"))
		{
			EmployeeDataDisplay employeedatadisplay=new EmployeeDataDisplay();
			employeedatadisplay.setVisible(true);
			dispose();
		}
		if(action.equals("addinventry"))
		{
			IneventryDataDisplay inventrydatadisplay=new IneventryDataDisplay();
			inventrydatadisplay.setVisible(true);
			dispose();
		}
		if(action.equals("reports"))
		{
			ReportsDataDisplay reportsdatadisplay=new ReportsDataDisplay();
			reportsdatadisplay.setVisible(true);
			dispose();
		}
		if(action.equals("setup"))
		{
			SettingDataDisplay SettingDataDisplay=new SettingDataDisplay();
			SettingDataDisplay.setVisible(true);
			dispose();
		}
		if(action.equals("Close"))
		{
			RunApp runapp=new RunApp();
			runapp.setVisible(true);
			dispose();
		}
	}
}
