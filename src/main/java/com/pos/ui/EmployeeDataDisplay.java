package com.pos.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

import com.pos.gen.CustomJTable;
import com.pos.gen.CustomScrollPane;
import com.pos.gen.GetColors;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.SystemColor;

@SuppressWarnings("serial")
public class EmployeeDataDisplay extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JButton btnClose;
	private JLabel footerLabel;
	private JScrollPane scrollPanefortabel;
	private JPanel headerPanel;
	private JLabel lblscreenname;
	private JTable table;

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

		headerPanel = new JPanel();
		headerPanel.setBorder(null);
		headerPanel.setBackground(GetColors.headerCoolor);
		headerPanel.setBounds(1, 1, 1248, 23);
		contentPanel.add(headerPanel);
		headerPanel.setLayout(null);

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
		
		lblscreenname = new JLabel("Employee Data");
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

		scrollPanefortabel = CustomScrollPane.getCustomScrollPane();
		scrollPanefortabel.setBounds(5, 156, 1240, 500);
		contentPanel.add(scrollPanefortabel);
		
		DefaultTableModel tableModel=new DefaultTableModel(new String[] {"column1", "column2", "column3", "column4"},0);
		table = CustomJTable.getCustomJTable();
		table.setModel(tableModel);
		scrollPanefortabel.setViewportView(table);
		
		String[] row1={"Item1","Item2","Item3","Item4"};
		String[] row2={"Item1","Item2","Item3","Item4"};
		String[] row3={"Item1","Item2","Item3","Item4"};
		String[] row4={"Item1","Item2","Item3","Item4"};
		String[] row5={"Item1","Item2","Item3","Item4"};
		
		tableModel.addRow(row1);
		tableModel.addRow(row2);
		tableModel.addRow(row3);
		tableModel.addRow(row4);
		tableModel.addRow(row5);
		tableModel.addRow(row1);
		tableModel.addRow(row2);
		tableModel.addRow(row3);
		tableModel.addRow(row4);
		tableModel.addRow(row5);
		tableModel.addRow(row1);
		tableModel.addRow(row2);
		tableModel.addRow(row3);
		tableModel.addRow(row4);
		tableModel.addRow(row5);
		tableModel.addRow(row5);
		tableModel.addRow(row1);
		tableModel.addRow(row2);
		tableModel.addRow(row3);
		tableModel.addRow(row4);
		tableModel.addRow(row5);


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
