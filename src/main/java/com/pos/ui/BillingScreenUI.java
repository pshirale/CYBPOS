package com.pos.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import com.pos.gen.GetColors;
import java.awt.SystemColor;
import javax.swing.JToggleButton;

@SuppressWarnings("serial")
public class BillingScreenUI extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JButton btnClose;
	private JLabel footerLabel;
	private JPanel headerPanel;
	private JLabel lblscreenname;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			TaxesDataDisplay dialog = new TaxesDataDisplay();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Create the dialog.
	 */
	public BillingScreenUI() {
		setUndecorated(true);
		setModal(true);
		setBounds(100, 100, 1250, 700);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(8,12,11));
		contentPanel.setBorder(new LineBorder(Color.WHITE));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		headerPanel = new JPanel();
		headerPanel.setLayout(null);
		headerPanel.setBorder(null);
		headerPanel.setBackground(GetColors.headerCoolor);
		headerPanel.setBounds(1, 1, 1248, 23);
		contentPanel.add(headerPanel);

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
		
		lblscreenname = new JLabel("Billing Screen");
		lblscreenname.setForeground(SystemColor.control);
		lblscreenname.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblscreenname.setBounds(12, 0, 181, 23);
		headerPanel.add(lblscreenname);

		footerLabel = new JLabel("<html> Copyright &#0169; 2018-2019 Cybware System Pvt Ltd. &nbsp  &nbsp &nbsp &nbsp </html>");
		footerLabel.setOpaque(true);
		footerLabel.setHorizontalTextPosition(SwingConstants.LEADING);
		footerLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		footerLabel.setForeground(Color.WHITE);
		footerLabel.setFont(new Font("Times New Roman", Font.BOLD, 13));
		footerLabel.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(255, 255, 255)));
		footerLabel.setBackground(GetColors.footerCoolor);
		footerLabel.setBounds(1, 661, 1248, 38);
		contentPanel.add(footerLabel);
		
		JPanel menuPanel = new JPanel();
		menuPanel.setLayout(null);
		menuPanel.setOpaque(false);
		menuPanel.setBorder(new LineBorder(Color.WHITE));
		menuPanel.setBounds(992, 64, 256, 553);
		contentPanel.add(menuPanel);
		
		JToggleButton toggleButton_4 = new JToggleButton("       Items");
		toggleButton_4.setSelected(true);
		toggleButton_4.setHorizontalAlignment(SwingConstants.LEFT);
		toggleButton_4.setForeground(Color.WHITE);
		toggleButton_4.setFont(new Font("Dialog", Font.BOLD, 15));
		toggleButton_4.setFocusPainted(false);
		toggleButton_4.setBorderPainted(false);
		toggleButton_4.setBorder(new LineBorder(Color.WHITE));
		toggleButton_4.setBackground(new Color(76, 79, 74));
		toggleButton_4.setActionCommand("AllItems");
		toggleButton_4.setBounds(2, 2, 252, 54);
		menuPanel.add(toggleButton_4);
		
		JToggleButton toggleButton = new JToggleButton("       Items");
		toggleButton.setSelected(true);
		toggleButton.setHorizontalAlignment(SwingConstants.LEFT);
		toggleButton.setForeground(Color.WHITE);
		toggleButton.setFont(new Font("Dialog", Font.BOLD, 15));
		toggleButton.setFocusPainted(false);
		toggleButton.setBorderPainted(false);
		toggleButton.setBorder(new LineBorder(Color.WHITE));
		toggleButton.setBackground(new Color(76, 79, 74));
		toggleButton.setActionCommand("AllItems");
		toggleButton.setBounds(2, 57, 252, 54);
		menuPanel.add(toggleButton);
		
		JToggleButton toggleButton_1 = new JToggleButton("       Items");
		toggleButton_1.setSelected(true);
		toggleButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		toggleButton_1.setForeground(Color.WHITE);
		toggleButton_1.setFont(new Font("Dialog", Font.BOLD, 15));
		toggleButton_1.setFocusPainted(false);
		toggleButton_1.setBorderPainted(false);
		toggleButton_1.setBorder(new LineBorder(Color.WHITE));
		toggleButton_1.setBackground(new Color(76, 79, 74));
		toggleButton_1.setActionCommand("AllItems");
		toggleButton_1.setBounds(2, 112, 252, 54);
		menuPanel.add(toggleButton_1);
		
		JToggleButton toggleButton_2 = new JToggleButton("       Items");
		toggleButton_2.setSelected(true);
		toggleButton_2.setHorizontalAlignment(SwingConstants.LEFT);
		toggleButton_2.setForeground(Color.WHITE);
		toggleButton_2.setFont(new Font("Dialog", Font.BOLD, 15));
		toggleButton_2.setFocusPainted(false);
		toggleButton_2.setBorderPainted(false);
		toggleButton_2.setBorder(new LineBorder(Color.WHITE));
		toggleButton_2.setBackground(new Color(76, 79, 74));
		toggleButton_2.setActionCommand("AllItems");
		toggleButton_2.setBounds(2, 167, 252, 54);
		menuPanel.add(toggleButton_2);
		
		JToggleButton toggleButton_3 = new JToggleButton("       Items");
		toggleButton_3.setSelected(true);
		toggleButton_3.setHorizontalAlignment(SwingConstants.LEFT);
		toggleButton_3.setForeground(Color.WHITE);
		toggleButton_3.setFont(new Font("Dialog", Font.BOLD, 15));
		toggleButton_3.setFocusPainted(false);
		toggleButton_3.setBorderPainted(false);
		toggleButton_3.setBorder(new LineBorder(Color.WHITE));
		toggleButton_3.setBackground(new Color(76, 79, 74));
		toggleButton_3.setActionCommand("AllItems");
		toggleButton_3.setBounds(2, 222, 252, 54);
		menuPanel.add(toggleButton_3);
		
		JToggleButton toggleButton_5 = new JToggleButton("       Items");
		toggleButton_5.setSelected(true);
		toggleButton_5.setHorizontalAlignment(SwingConstants.LEFT);
		toggleButton_5.setForeground(Color.WHITE);
		toggleButton_5.setFont(new Font("Dialog", Font.BOLD, 15));
		toggleButton_5.setFocusPainted(false);
		toggleButton_5.setBorderPainted(false);
		toggleButton_5.setBorder(new LineBorder(Color.WHITE));
		toggleButton_5.setBackground(new Color(76, 79, 74));
		toggleButton_5.setActionCommand("AllItems");
		toggleButton_5.setBounds(2, 277, 252, 54);
		menuPanel.add(toggleButton_5);
		
		JToggleButton toggleButton_6 = new JToggleButton("       Items");
		toggleButton_6.setSelected(true);
		toggleButton_6.setHorizontalAlignment(SwingConstants.LEFT);
		toggleButton_6.setForeground(Color.WHITE);
		toggleButton_6.setFont(new Font("Dialog", Font.BOLD, 15));
		toggleButton_6.setFocusPainted(false);
		toggleButton_6.setBorderPainted(false);
		toggleButton_6.setBorder(new LineBorder(Color.WHITE));
		toggleButton_6.setBackground(new Color(76, 79, 74));
		toggleButton_6.setActionCommand("AllItems");
		toggleButton_6.setBounds(2, 332, 252, 54);
		menuPanel.add(toggleButton_6);
		
		JToggleButton toggleButton_7 = new JToggleButton("       Items");
		toggleButton_7.setSelected(true);
		toggleButton_7.setHorizontalAlignment(SwingConstants.LEFT);
		toggleButton_7.setForeground(Color.WHITE);
		toggleButton_7.setFont(new Font("Dialog", Font.BOLD, 15));
		toggleButton_7.setFocusPainted(false);
		toggleButton_7.setBorderPainted(false);
		toggleButton_7.setBorder(new LineBorder(Color.WHITE));
		toggleButton_7.setBackground(new Color(76, 79, 74));
		toggleButton_7.setActionCommand("AllItems");
		toggleButton_7.setBounds(2, 387, 252, 54);
		menuPanel.add(toggleButton_7);
		
		JToggleButton toggleButton_8 = new JToggleButton("       Items");
		toggleButton_8.setSelected(true);
		toggleButton_8.setHorizontalAlignment(SwingConstants.LEFT);
		toggleButton_8.setForeground(Color.WHITE);
		toggleButton_8.setFont(new Font("Dialog", Font.BOLD, 15));
		toggleButton_8.setFocusPainted(false);
		toggleButton_8.setBorderPainted(false);
		toggleButton_8.setBorder(new LineBorder(Color.WHITE));
		toggleButton_8.setBackground(new Color(76, 79, 74));
		toggleButton_8.setActionCommand("AllItems");
		toggleButton_8.setBounds(2, 442, 252, 54);
		menuPanel.add(toggleButton_8);
		
		JToggleButton toggleButton_9 = new JToggleButton("       Items");
		toggleButton_9.setSelected(true);
		toggleButton_9.setHorizontalAlignment(SwingConstants.LEFT);
		toggleButton_9.setForeground(Color.WHITE);
		toggleButton_9.setFont(new Font("Dialog", Font.BOLD, 15));
		toggleButton_9.setFocusPainted(false);
		toggleButton_9.setBorderPainted(false);
		toggleButton_9.setBorder(new LineBorder(Color.WHITE));
		toggleButton_9.setBackground(new Color(76, 79, 74));
		toggleButton_9.setActionCommand("AllItems");
		toggleButton_9.setBounds(2, 497, 252, 54);
		menuPanel.add(toggleButton_9);
		
		JLabel lblNewLabel = new JLabel("MENU");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Vrinda", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(992, 24, 256, 38);
		contentPanel.add(lblNewLabel);


		setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		String action=arg0.getActionCommand();
		//System.err.println(action);
		if(action.equals("Close"))
		{
			SecondScrFrame secondscrframe=new SecondScrFrame();
			secondscrframe.setVisible(true);
			dispose();
		}

	}
}
