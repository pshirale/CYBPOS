package com.pos.gen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

public class CustomScrollPane {

	
	static Color color1= new Color(230, 231, 231); 
	static Color color2= new Color(245, 245, 245); 
    /**
	 * Create the JTable.
	 */
	public static JScrollPane getCustomScrollPane() 
	{  
		JScrollPane scrollPanefortabel;
		scrollPanefortabel = new JScrollPane();
		scrollPanefortabel.setOpaque(false);
		scrollPanefortabel.getViewport().setOpaque(false);
		scrollPanefortabel.setBackground(SystemColor.windowBorder);
		scrollPanefortabel.setBorder(new LineBorder(Color.WHITE));
		JScrollBar bar = scrollPanefortabel.getVerticalScrollBar();
		bar.setPreferredSize(new Dimension(30, 0));
		bar.setForeground(Color.red);
		return scrollPanefortabel;
	}
}
