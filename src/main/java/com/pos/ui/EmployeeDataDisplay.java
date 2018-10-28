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
import javax.swing.JScrollPane;
import java.awt.SystemColor;

@SuppressWarnings("serial")
public class EmployeeDataDisplay extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JButton btnClose;
	private JLabel footerLabel;
	private JScrollPane scrollPanefortabel;

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
	public EmployeeDataDisplay() {
		setUndecorated(true);
		setModal(true);
		setBounds(100, 100, 1250, 700);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(8,12,11));
		contentPanel.setBorder(new LineBorder(Color.WHITE));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		 btnClose = new JButton("Close");
		btnClose.setHorizontalTextPosition(SwingConstants.CENTER);
		btnClose.setForeground(new Color(255, 51, 0));
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnClose.setFocusPainted(false);
		btnClose.setContentAreaFilled(false);
		btnClose.setBorder(new LineBorder(new Color(255, 255, 255)));
		btnClose.setBounds(1188, 5, 55, 23);
		btnClose.addActionListener(this);
		contentPanel.add(btnClose);
		
		 footerLabel = new JLabel("<html> Copyright &#0169; 2018-2019 Cybware System Pvt Ltd. &nbsp  &nbsp &nbsp &nbsp </html>");
		footerLabel.setOpaque(true);
		footerLabel.setHorizontalTextPosition(SwingConstants.LEADING);
		footerLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		footerLabel.setForeground(Color.WHITE);
		footerLabel.setFont(new Font("Times New Roman", Font.BOLD, 13));
		footerLabel.setBorder(new MatteBorder(1, 0, 0, 0, (Color) new Color(255, 255, 255)));
		footerLabel.setBackground(new Color(220, 20, 60));
		footerLabel.setBounds(1, 661, 1248, 38);
		contentPanel.add(footerLabel);
		
		 scrollPanefortabel = new JScrollPane();
		scrollPanefortabel.setOpaque(false);
		scrollPanefortabel.getViewport().setOpaque(false);
		scrollPanefortabel.setBackground(SystemColor.windowBorder);
		scrollPanefortabel.setBorder(new LineBorder(Color.WHITE));
		scrollPanefortabel.setBounds(374, 211, 866, 439);
		contentPanel.add(scrollPanefortabel);
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
