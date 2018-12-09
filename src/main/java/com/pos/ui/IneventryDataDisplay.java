package com.pos.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;

import com.pos.gen.CustomJTable;
import com.pos.gen.CustomScrollPane;
import com.pos.gen.GetColors;
import com.pos.ui.subui.AddCategory;
import com.pos.ui.subui.AddItems;
import com.pos.ui.subui.AddUnit;

import java.awt.SystemColor;

import javax.swing.ButtonGroup;

@SuppressWarnings("serial")
public class IneventryDataDisplay extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JButton btnClose;
	private JLabel footerLabel;
	private JPanel headerPanel;
	private JLabel lblscreenname;
	private JPanel panel;
	private JScrollPane scrollPanefortabel;
	private JTable table;
	
	private JToggleButton btnAddUnit;
	private JToggleButton btnAddItemCategory;
	private JToggleButton btnAddSupplier;
	private JToggleButton btnAddProducts;
	private JToggleButton btnAddItems;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btnAddNewItem;

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
	public IneventryDataDisplay() {
		setUndecorated(true);
		setModal(true);
		setBounds(100, 100, 1250, 700);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(8,12,11));
		contentPanel.setBorder(new LineBorder(Color.WHITE));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		footerLabel = new JLabel("<html> Copyright &#0169; 2018-2019 Cybware System Pvt Ltd. &nbsp  &nbsp &nbsp &nbsp </html>");
		footerLabel.setOpaque(true);
		footerLabel.setHorizontalTextPosition(SwingConstants.LEADING);
		footerLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		footerLabel.setForeground(Color.WHITE);
		footerLabel.setFont(new Font("Times New Roman", Font.BOLD, 13));
		footerLabel.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(255, 255, 255)));
		footerLabel.setBackground(new Color(220, 20, 60));
		footerLabel.setBounds(1, 661, 1248, 38);
		contentPanel.add(footerLabel);

		headerPanel = new JPanel();
		headerPanel.setLayout(null);
		headerPanel.setBorder(null);
		headerPanel.setBackground(GetColors.headerCoolor);
		headerPanel.setBounds(1, 1, 1248, 23);
		contentPanel.add(headerPanel);
		
		lblscreenname = new JLabel("Inventry");
		lblscreenname.setForeground(SystemColor.control);
		lblscreenname.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblscreenname.setBounds(12, 0, 181, 23);
		headerPanel.add(lblscreenname);

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
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setOpaque(false);
		panel.setBorder(new LineBorder(Color.WHITE));
		panel.setBounds(5, 163, 256, 494);
		contentPanel.add(panel);
		
		scrollPanefortabel = CustomScrollPane.getCustomScrollPane();
		scrollPanefortabel.setBounds(265, 198, 980, 457);
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
		
		btnAddUnit = new JToggleButton("       Units");
		buttonGroup.add(btnAddUnit);
		btnAddUnit.setHorizontalAlignment(SwingConstants.LEFT);
		btnAddUnit.setActionCommand("AllUnit");
		btnAddUnit.setBorderPainted(false);
		btnAddUnit.setFont(new Font("Dialog", Font.BOLD, 15));
		btnAddUnit.setForeground(Color.WHITE);
		btnAddUnit.setFocusPainted(false);
		btnAddUnit.setBorder(new LineBorder(Color.WHITE));
		btnAddUnit.setBackground(GetColors.headerCoolor);
		btnAddUnit.setBounds(2, 226, 252, 55);
		btnAddUnit.addActionListener(this);
		panel.add(btnAddUnit);
		
		
		btnAddItemCategory = new JToggleButton("       Categories");
		buttonGroup.add(btnAddItemCategory);
		btnAddItemCategory.setHorizontalAlignment(SwingConstants.LEFT);
		btnAddItemCategory.setActionCommand("AllCategory");
		btnAddItemCategory.setBorderPainted(false);
		btnAddItemCategory.setForeground(Color.WHITE);
		btnAddItemCategory.setFont(new Font("Dialog", Font.BOLD, 15));
		btnAddItemCategory.setFocusPainted(false);
		btnAddItemCategory.setBorder(new LineBorder(Color.WHITE));
		btnAddItemCategory.setBackground(new Color(76, 79, 74));
		btnAddItemCategory.setBounds(2, 114, 252, 55);
		btnAddItemCategory.addActionListener(this);
		panel.add(btnAddItemCategory);
		
		btnAddSupplier = new JToggleButton("       Supplier");
		buttonGroup.add(btnAddSupplier);
		btnAddSupplier.setHorizontalAlignment(SwingConstants.LEFT);
		btnAddSupplier.setActionCommand("AllSupplier");
		btnAddSupplier.setForeground(Color.WHITE);
		btnAddSupplier.setFont(new Font("Dialog", Font.BOLD, 15));
		btnAddSupplier.setFocusPainted(false);
		btnAddSupplier.setBorderPainted(false);
		btnAddSupplier.setBorder(new LineBorder(Color.WHITE));
		btnAddSupplier.setBackground(new Color(76, 79, 74));
		btnAddSupplier.setBounds(2, 170, 252, 55);
		btnAddSupplier.addActionListener(this);
		panel.add(btnAddSupplier);
		
		btnAddProducts = new JToggleButton("       Products");
		buttonGroup.add(btnAddProducts);
		btnAddProducts.setHorizontalAlignment(SwingConstants.LEFT);
		btnAddProducts.setActionCommand("AllProducts");
		btnAddProducts.setForeground(Color.WHITE);
		btnAddProducts.setFont(new Font("Dialog", Font.BOLD, 15));
		btnAddProducts.setFocusPainted(false);
		btnAddProducts.setBorderPainted(false);
		btnAddProducts.setBorder(new LineBorder(Color.WHITE));
		btnAddProducts.setBackground(new Color(76, 79, 74));
		btnAddProducts.setBounds(2, 58, 252, 55);
		btnAddProducts.addActionListener(this);
		panel.add(btnAddProducts);
		
		
		
		btnAddItems = new JToggleButton("       Items");
		buttonGroup.add(btnAddItems);
		btnAddItems.setHorizontalAlignment(SwingConstants.LEFT);
		btnAddItems.setActionCommand("AllItems");
		btnAddItems.setForeground(Color.WHITE);
		btnAddItems.setFont(new Font("Dialog", Font.BOLD, 15));
		btnAddItems.setFocusPainted(false);
		btnAddItems.setBorderPainted(false);
		btnAddItems.setBorder(new LineBorder(Color.WHITE));
		btnAddItems.setBackground(new Color(76, 79, 74));
		btnAddItems.setBounds(2, 2, 252, 55);
		btnAddItems.setSelected(true);
		btnAddItems.addActionListener(this);
		panel.add(btnAddItems);
		
		 
		btnAddNewItem = new JButton("+  Add Item");
		btnAddNewItem.setActionCommand("AddNewItem");
		btnAddNewItem.setForeground(Color.WHITE);
		btnAddNewItem.setFont(new Font("Dialog", Font.BOLD, 13));
		btnAddNewItem.setFocusPainted(false);
		btnAddNewItem.setBorder(null);
		btnAddNewItem.setBackground(new Color(51, 204, 102));
		btnAddNewItem.setBounds(1110, 163, 130, 30);
		contentPanel.add(btnAddNewItem);
		btnAddNewItem.addActionListener(this);
		
		
		clickColorAdjust();

		setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		String action=arg0.getActionCommand();
		//System.err.println(action);
		clickColorAdjust();

		if(action.equals("Close"))
		{
			SecondScrFrame secondscrframe=new SecondScrFrame();
			secondscrframe.setVisible(true);
			dispose();
		}
		if(action.equals("AllCategory"))
		{
			AddCategory addcategory=new AddCategory();
			addcategory.setVisible(true);
		}
		if(action.equals("AllSupplier"))
		{
			System.out.println("AllSupplier");
		}
		if(action.equals("AllProducts"))
		{
			System.out.println("AllProducts");
		}
		if(action.equals("AllItems"))
		{
			System.out.println("AllItems");
		}
		if(action.equals("AllUnit"))
		{
			AddUnit addunit=new AddUnit();
			addunit.setVisible(true);
		}
		if(action.equals("AddNewItem"))
		{
			AddItems additem=new AddItems();
			additem.setVisible(true);
		}
		
	}
	public void clickColorAdjust() 
	{
		
		if(btnAddItems.isSelected())
		{
			//btnAddItems.setBackground(GetColors.footerCoolor);
			UIManager.put("ToggleButton.select", GetColors.footerCoolor);
			SwingUtilities.updateComponentTreeUI(btnAddItems);
		}
		
		if(btnAddItemCategory.isSelected())
		{
			UIManager.put("ToggleButton.select", GetColors.footerCoolor);
			SwingUtilities.updateComponentTreeUI(btnAddItemCategory);
		}
		
		if(btnAddProducts.isSelected())
		{
			UIManager.put("ToggleButton.select", GetColors.footerCoolor);
			SwingUtilities.updateComponentTreeUI(btnAddProducts);
		}
		if(btnAddSupplier.isSelected())
		{
			UIManager.put("ToggleButton.select", GetColors.footerCoolor);
			SwingUtilities.updateComponentTreeUI(btnAddSupplier);
		}
		if(btnAddUnit.isSelected())
		{
			UIManager.put("ToggleButton.select", GetColors.footerCoolor);
			SwingUtilities.updateComponentTreeUI(btnAddUnit);
		}
	}
}
