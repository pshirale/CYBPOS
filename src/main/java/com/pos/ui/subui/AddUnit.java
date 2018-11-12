package com.pos.ui.subui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import com.pos.ui.SecondScrFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.MatteBorder;

public class AddUnit extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JButton btnSave;
	private JButton btnCancel;

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
		
		
		setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String action=arg0.getActionCommand();
		//System.err.println(action);
		if(action.equals("Save"))
		{
			
		}
		if(action.equals("Cancel"))
		{
			dispose();
		}
		
	}

}
