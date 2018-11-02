package com.pos.gen;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

public class CustomJTable {

	static Color color1= new Color(230, 231, 231); 
	static Color color2= new Color(245, 245, 245); 
    /**
	 * Create the JTable.
	 */
	public static JTable getCustomJTable() 
	{  
		JTable table;
		table = new JTable() ;
		table.setDefaultEditor(Object.class, null);
		table.setForeground(Color.DARK_GRAY);
		table.setRowMargin(0);

		table.setFont(new Font("Tahoma", Font.ITALIC, 13));
		table.getTableHeader().setReorderingAllowed(false);
		table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() 
		{
			public Component getTableCellRendererComponent(JTable table,Object value, boolean isSelected, boolean hasFocus,int row, int column) {
				Component c = super.getTableCellRendererComponent(table,value, isSelected, hasFocus, row, column);
				c.setBackground(row%2==0 ? color1 : color2);                        
				return c;
			};
		});
		JTableHeader header = table.getTableHeader();
		header.setBackground(Color.black);
		header.setForeground(Color.yellow);
		header.setFont(new Font("Times New Roman", Font.BOLD, 13));
		header.setPreferredSize(new Dimension(0, 35));
		table.setShowGrid(false);
		table.setRowHeight(30);
		return table;
	}
}
