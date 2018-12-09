package com.pos.ui.subui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import com.pos.dao.impl.AddInventryData;
import com.pos.dao.interf.AddInventryDataInterf;

@SuppressWarnings("serial")
public class AddTaxes extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JButton btnSave;
	private JButton btnCancel;
	private JTextField txtName;
	private JTextField txtPercentage;
	AddInventryDataInterf addInventrydataobj=null;

	/**
	 * Create the dialog.
	 */
	public AddTaxes() {
		setModal(true);
		setUndecorated(true);
		setBounds(100, 100, 608, 500);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(8,12,11));
		contentPanel.setBorder(new LineBorder(Color.WHITE));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		 btnSave = new JButton("Save");
		 btnSave.setFocusPainted(false);
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Dialog", Font.BOLD, 15));
		btnSave.setBorder(new LineBorder(new Color(255, 255, 255)));
		btnSave.setBackground(new Color(76, 79, 74));
		btnSave.setActionCommand("Save");
		btnSave.setBounds(353, 433, 100, 41);
		btnSave.addActionListener(this);
		contentPanel.add(btnSave);
		
		 btnCancel = new JButton("Cancel");
		 btnCancel.setFocusPainted(false);
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Dialog", Font.BOLD, 15));
		btnCancel.setBorder(new LineBorder(Color.WHITE));
		btnCancel.setBackground(new Color(76, 79, 74));
		btnCancel.setActionCommand("Cancel");
		btnCancel.setBounds(482, 433, 100, 41);
		btnCancel.addActionListener(this);
		contentPanel.add(btnCancel);
		
		txtName = new JTextField();
		txtName.setForeground(Color.BLACK);
		txtName.setFont(new Font("Dialog", Font.BOLD, 13));
		txtName.setColumns(10);
		txtName.setBorder(null);
		txtName.setBackground(UIManager.getColor("Button.disabledToolBarBorderBackground"));
		txtName.setBounds(274, 101, 223, 30);
		contentPanel.add(txtName);
		
		txtPercentage = new JTextField();
		txtPercentage.setForeground(Color.BLACK);
		txtPercentage.setFont(new Font("Dialog", Font.BOLD, 13));
		txtPercentage.setColumns(10);
		txtPercentage.setBorder(null);
		txtPercentage.setBackground(UIManager.getColor("Button.disabledToolBarBorderBackground"));
		txtPercentage.setBounds(274, 168, 223, 30);
		contentPanel.add(txtPercentage);
		
		JLabel lblNewLabel = new JLabel("Tax Name");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel.setBounds(138, 101, 134, 30);
		contentPanel.add(lblNewLabel);
		
		JLabel lblUnitShortName = new JLabel("Tax Percentage");
		lblUnitShortName.setForeground(Color.WHITE);
		lblUnitShortName.setFont(new Font("Dialog", Font.BOLD, 12));
		lblUnitShortName.setBounds(138, 168, 134, 30);
		contentPanel.add(lblUnitShortName);
		
		
		setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String action=arg0.getActionCommand();
		//System.err.println(action);
		if(action.equals("Save"))
		{
			 addInventrydataobj=new AddInventryData();
			 addInventrydataobj.AddTaxes(txtName.getText(), txtPercentage.getText(), 1);
			 dispose();
		}
		if(action.equals("Cancel"))
		{
			dispose();
		}
		
	}
	
}
