package com.pos.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import com.pos.dao.impl.GetInventryDataImpl;
import com.pos.dao.impl.GetProductsDataImpl;
import com.pos.dao.interf.GetProductsDataInter;
import com.pos.gen.GetColors;
import com.pos.model.CategoryModel;
import com.pos.model.ProductModel;

import java.awt.SystemColor;
import java.util.ArrayList;

import javax.swing.JToggleButton;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.JLayeredPane;

import java.awt.CardLayout;
import java.awt.GridLayout;

import javax.swing.JTable;

import java.awt.Dimension;

@SuppressWarnings("serial")
public class BillingScreenUI extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JButton btnClose;
	private JLabel footerLabel;
	private JPanel headerPanel;
	private JLabel lblscreenname;
	private JLabel lblItemName;
	private JPanel menuPanel;
	
//	ArrayList<JToggleButton> categorybtnlist=new ArrayList<JToggleButton>();
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblTaxes;
	private JLabel lblGrandTotal;
	private JLayeredPane layeredPanebtns;
	private JPanel prodPanelonLP1;
	private JTable billtable;
	private DefaultTableModel billTableModel;
	private ArrayList<ProductModel> productsdatalist;
	private ArrayList<CategoryModel> categorylist;

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
		
		 menuPanel = new JPanel();
		menuPanel.setLayout(null);
		menuPanel.setOpaque(false);
		menuPanel.setBorder(new MatteBorder(0, 1, 1, 0, (Color) Color.WHITE));
		menuPanel.setBounds(1046, 67, 252, 553);
		contentPanel.add(menuPanel);
		
		
		
		JLabel lblNewLabel = new JLabel("MENU");
		lblNewLabel.setBorder(new MatteBorder(1, 1, 1, 0, (Color) new Color(255, 255, 255)));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(0, 128, 128));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(1046, 25, 202, 42);
		contentPanel.add(lblNewLabel);
		
		JPanel billPanel = new JPanel();
		billPanel.setBackground(SystemColor.text);
		billPanel.setOpaque(false);
		billPanel.setBorder(new LineBorder(Color.WHITE));
		billPanel.setBounds(1, 26, 343, 634);
		contentPanel.add(billPanel);
		billPanel.setLayout(null);
		
		JScrollPane billScrollpane = new JScrollPane();
		billScrollpane.setRequestFocusEnabled(false);
		billScrollpane.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.WHITE));
		billScrollpane.setBounds(0, 73, 341, 452);
		billPanel.add(billScrollpane);
		billScrollpane.getViewport().setBackground(SystemColor.text);
		
		billTableModel=new DefaultTableModel(new String[] {"","", "", ""},0);
		billtable = new JTable();
		billtable.setIntercellSpacing(new Dimension(0, 0));
		billtable.setSelectionBackground(Color.LIGHT_GRAY);
		billtable.setBackground(SystemColor.text);
		billtable.setDefaultEditor(Object.class, null);
		billtable.setForeground(Color.DARK_GRAY);
		billtable.setRowMargin(0);
		billtable.setFont(new Font("Kartika", Font.BOLD, 13));
		billtable.setModel(billTableModel);
		billtable.setShowGrid(false);
		billtable.setRowHeight(30);
		billtable.setTableHeader(null);
		billScrollpane.setViewportView(billtable);
		
		DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.CENTER);
		billtable.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
		billtable.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);
		
		//billtable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		billtable.getColumnModel().getColumn(0).setPreferredWidth(34);
		billtable.getColumnModel().getColumn(1).setPreferredWidth(187);
		billtable.getColumnModel().getColumn(2).setPreferredWidth(48);
		//billtable.getColumnModel().getColumn(3).setPreferredWidth(64);
		
		
		
		JLabel lblOrder = new JLabel("#ORDER");
		lblOrder.setBounds(-1, 0, 343, 42);
		billPanel.add(lblOrder);
		lblOrder.setBackground(new Color(0, 139, 139));
		lblOrder.setForeground(Color.WHITE);
		lblOrder.setOpaque(true);
		lblOrder.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrder.setFont(new Font("Dialog", Font.BOLD, 15));
		
		JLabel lblSrNo = new JLabel(" #");
		lblSrNo.setBounds(1, 43, 34, 29);
		billPanel.add(lblSrNo);
		lblSrNo.setOpaque(true);
		lblSrNo.setForeground(Color.WHITE);
		lblSrNo.setFont(new Font("Dialog", Font.BOLD, 14));
		lblSrNo.setBackground(new Color(220, 20, 60));
		
		 lblItemName = new JLabel(" Description");
		 lblItemName.setBounds(36, 43, 184, 29);
		 billPanel.add(lblItemName);
		lblItemName.setOpaque(true);
		lblItemName.setForeground(Color.WHITE);
		lblItemName.setFont(new Font("Dialog", Font.BOLD, 14));
		lblItemName.setBackground(GetColors.footerCoolor);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setHorizontalAlignment(SwingConstants.CENTER);
		lblQty.setBounds(221, 43, 48, 29);
		billPanel.add(lblQty);
		lblQty.setOpaque(true);
		lblQty.setForeground(Color.WHITE);
		lblQty.setFont(new Font("Dialog", Font.BOLD, 14));
		lblQty.setBackground(new Color(220, 20, 60));
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(270, 43, 71, 29);
		billPanel.add(lblPrice);
		lblPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrice.setOpaque(true);
		lblPrice.setForeground(Color.WHITE);
		lblPrice.setFont(new Font("Dialog", Font.BOLD, 14));
		lblPrice.setBackground(new Color(220, 20, 60));
		
		JButton btnPay = new JButton("PAY NOW");
		btnPay.setForeground(Color.WHITE);
		btnPay.setFont(new Font("Dialog", Font.BOLD, 15));
		btnPay.setFocusPainted(false);
		btnPay.setBorder(null);
		btnPay.setBackground(new Color(50, 205, 50));
		btnPay.setBounds(2, 580, 169, 52);
		billPanel.add(btnPay);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.setForeground(Color.WHITE);
		btnPrint.setFont(new Font("Dialog", Font.BOLD, 15));
		btnPrint.setFocusPainted(false);
		btnPrint.setBorder(null);
		btnPrint.setBackground(new Color(0, 128, 128));
		btnPrint.setBounds(172, 580, 169, 52);
		billPanel.add(btnPrint);
		
		JLabel lblTxtTotal = new JLabel("Grand Total :");
		lblTxtTotal.setOpaque(true);
		lblTxtTotal.setForeground(Color.WHITE);
		lblTxtTotal.setFont(new Font("Dialog", Font.BOLD, 14));
		lblTxtTotal.setBackground(new Color(220, 20, 60));
		lblTxtTotal.setBounds(2, 549, 192, 30);
		billPanel.add(lblTxtTotal);
		
		 lblGrandTotal = new JLabel("");
		lblGrandTotal.setHorizontalAlignment(SwingConstants.TRAILING);
		lblGrandTotal.setOpaque(true);
		lblGrandTotal.setForeground(Color.WHITE);
		lblGrandTotal.setFont(new Font("Dialog", Font.BOLD, 14));
		lblGrandTotal.setBackground(new Color(220, 20, 60));
		lblGrandTotal.setBounds(193, 549, 148, 30);
		billPanel.add(lblGrandTotal);
		
		JLabel lbltxtTaxes = new JLabel("Taxes :");
		lbltxtTaxes.setOpaque(true);
		lbltxtTaxes.setForeground(Color.WHITE);
		lbltxtTaxes.setFont(new Font("Dialog", Font.BOLD, 12));
		lbltxtTaxes.setBackground(new Color(220, 20, 60));
		lbltxtTaxes.setBounds(2, 526, 192, 22);
		billPanel.add(lbltxtTaxes);
		
		 lblTaxes = new JLabel("");
		lblTaxes.setOpaque(true);
		lblTaxes.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTaxes.setForeground(Color.WHITE);
		lblTaxes.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTaxes.setBackground(new Color(220, 20, 60));
		lblTaxes.setBounds(193, 526, 148, 22);
		billPanel.add(lblTaxes);
		
		 layeredPanebtns = new JLayeredPane();
		layeredPanebtns.setBounds(345, 25, 692, 595);
		contentPanel.add(layeredPanebtns);
		 layeredPanebtns.setLayout(new CardLayout(0, 0));
		
		 prodPanelonLP1 = new JPanel();
		prodPanelonLP1.setOpaque(false);
		layeredPanebtns.add(prodPanelonLP1, "name_1106966724700826");
		prodPanelonLP1.setLayout(null);

		
		loadCategoryButtons();
		addProductsButtonsOnPanel(categorylist.get(1).getCat_id()); 

		setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		String action=arg0.getActionCommand();
		clickColorAdjust();
		System.err.println(action);
		if(action.equals("Close"))
		{
			SecondScrFrame secondscrframe=new SecondScrFrame();
			secondscrframe.setVisible(true);
			dispose();
		}
		
		for(int k=0;k<productsdatalist.size();k++)
		{
			if(action.equals(productsdatalist.get(k).getProd_name()))
			{
				Object[] prod=new String[]{String.valueOf((billTableModel.getRowCount()+1)),productsdatalist.get(k).getProd_name(),"1",productsdatalist.get(k).getSelling_price().toString()};
				billTableModel.addRow(prod);
			}
		}
		for(int b=0;b<categorylist.size();b++)
		{
			if(action.equals(categorylist.get(b).getCat_name()))
			{
				addProductsButtonsOnPanel(categorylist.get(b).getCat_id());
			}
		}

	}
	public void loadCategoryButtons()
	{    
	//	categorybtnlist.clear();
		
		if(categorylist!=null)
		{
			categorylist.clear();
		}
		GetInventryDataImpl getInventryData= new GetInventryDataImpl();
		 categorylist=getInventryData.getCategoryData();
		int ypos=1;
		
		for(int i=0;i<categorylist.size();i++)
		{
			
			buttonGroup.add(categorylist.get(i).getBtntoggle());
			categorylist.get(i).getBtntoggle().setText(categorylist.get(i).getCat_name());
			categorylist.get(i).getBtntoggle().setActionCommand(categorylist.get(i).getCat_name());
			categorylist.get(i).getBtntoggle().setBounds(2, ypos, 200, 50);
			categorylist.get(i).getBtntoggle().addActionListener(this);
			menuPanel.add(categorylist.get(i).getBtntoggle());

		//	categorybtnlist.add(categorylist.get(i).getBtntoggle());
			
			ypos=ypos+51;
		}
		
		
	}
	public void clickColorAdjust() 
	{
		for(int i=0;i<categorylist.size();i++)
		{
			if(categorylist.get(i).getBtntoggle().isSelected())
			{
				//btnAddItems.setBackground(GetColors.footerCoolor);
				UIManager.put("ToggleButton.select", GetColors.headerCoolor);
				SwingUtilities.updateComponentTreeUI(categorylist.get(i).getBtntoggle());
			}
		}
		
	}
	public void addProductsButtonsOnPanel(int catID)
	{  
		prodPanelonLP1.removeAll();
		prodPanelonLP1.repaint();
		prodPanelonLP1.revalidate();
		if(productsdatalist!=null)
		{
			productsdatalist.clear();
		}
		 GetProductsDataInter getproductsdata=new GetProductsDataImpl();
		 productsdatalist=getproductsdata.getProductData();
		
		int xpos=14;
		int ypos=1;
		int count=1;
		 
		for(int i=0;i<productsdatalist.size();)
		{ 
			if(catID==productsdatalist.get(i).getCat_id())
			{
				if(count<=5)
				{ 
					productsdatalist.get(i).getProdbutton().setBounds(xpos, ypos, 120, 60);
					productsdatalist.get(i).getProdbutton().setText(productsdatalist.get(i).getProd_name());
					productsdatalist.get(i).getProdbutton().addActionListener(this);
					productsdatalist.get(i).getProdbutton().setActionCommand(productsdatalist.get(i).getProd_name());
					prodPanelonLP1.add(productsdatalist.get(i).getProdbutton());

					xpos=xpos+134;
					i++;
				}else
				{
					count=1;
					xpos=14;
					ypos=ypos+74;
					continue;
				}

				++count;
			}else
			{
				i++;
			}
		}
	}
}
