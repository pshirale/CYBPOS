/*package com.pos.gen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import java.awt.SystemColor;
import java.awt.Font;

public class Demo extends JFrame {

	private JPanel contentPane;
	private JTable table;

	*//**
	 * Launch the application.
	 *//*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo frame = new Demo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	*//**
	 * Create the frame.
	 *//*
	public Demo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 852, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(132, 103, 556, 146);
		contentPane.add(scrollPane);
		
		String[] row1={"Item1","Item2","Item3","Item4"};
		String[] row2={"Item1","Item2","Item3","Item4"};
		String[] row3={"Item1","Item2","Item3","Item4"};
		String[] row4={"Item1","Item2","Item3","Item4"};
		String[] row5={"Item1","Item2","Item3","Item4"};
		
		DefaultTableModel dm=new DefaultTableModel(new String[] {"column1", "column2", "column3", "column4"},0);
		table = CustomJTable.getCustomJTable();
		table.setModel(dm);
		scrollPane.setViewportView(table);
		
		dm.addRow(row1);
		dm.addRow(row2);
		dm.addRow(row3);
		dm.addRow(row4);
		dm.addRow(row5);
	}
}
*/