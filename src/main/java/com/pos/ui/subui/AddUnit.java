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

import com.pos.dao.impl.AddInventryDataImpl;
import com.pos.dao.interf.AddInventryDataInterf;

@SuppressWarnings("serial")
public class AddUnit extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JButton btnSave;
	private JButton btnCancel;
	private JTextField txtLongDesc;
	private JTextField txtShortDesc;
	AddInventryDataInterf addInventrydataobj=null;

	/**
	 * Create the dialog.
	 */
	public AddUnit() {
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
		
		txtLongDesc = new JTextField();
		txtLongDesc.setForeground(Color.BLACK);
		txtLongDesc.setFont(new Font("Dialog", Font.BOLD, 13));
		txtLongDesc.setColumns(10);
		txtLongDesc.setBorder(null);
		txtLongDesc.setBackground(UIManager.getColor("Button.disabledToolBarBorderBackground"));
		txtLongDesc.setBounds(274, 101, 223, 30);
		contentPanel.add(txtLongDesc);
		
		txtShortDesc = new JTextField();
		txtShortDesc.setForeground(Color.BLACK);
		txtShortDesc.setFont(new Font("Dialog", Font.BOLD, 13));
		txtShortDesc.setColumns(10);
		txtShortDesc.setBorder(null);
		txtShortDesc.setBackground(UIManager.getColor("Button.disabledToolBarBorderBackground"));
		txtShortDesc.setBounds(274, 168, 223, 30);
		contentPanel.add(txtShortDesc);
		
		JLabel lblNewLabel = new JLabel("Unit Name");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel.setBounds(138, 101, 134, 30);
		contentPanel.add(lblNewLabel);
		
		JLabel lblUnitShortName = new JLabel("Unit Short Name");
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
			 addInventrydataobj=new AddInventryDataImpl();
			 addInventrydataobj.AddUnit(txtShortDesc.getText(), txtLongDesc.getText(), 1);
			 dispose();
		}
		if(action.equals("Cancel"))
		{
			dispose();
		}
		
	}
	
}
