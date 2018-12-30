package com.pos.ui.subui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import com.pos.dao.impl.AddInventryDataImpl;
import com.pos.dao.impl.GetInventryDataImpl;
import com.pos.dao.interf.AddInventryDataInterf;
import com.pos.gen.LogicToGetIDs;
import com.pos.model.CategoryModel;
import com.pos.model.TaxModel;
import com.pos.model.UnitModel;

import javax.swing.JCheckBox;

@SuppressWarnings("serial")
public class AddItems extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JButton btnSave;
	private JButton btnCancel;
	private JTextField txtItemName;
	AddInventryDataInterf addInventrydataobj=null;
	private JLabel lblItemOldStock;
	private JTextField txtOldStock;
	private JLabel lblItemNewStock;
	private JTextField txtNewStock;
	private JLabel lblItemPrice;
	private JLabel lblMrp;
	private JTextField txtMRP;
	private JTextField txtTotalCost;
	private JLabel lblItemCategory;
	private JComboBox cmbCategory;
	private JLabel lblTax;
	private JComboBox cmbTaxes;
	private JPanel panel;
	private JButton button;
	private JLabel lblScreen;
	private JComboBox cmbUnit;
	private JCheckBox chkActive;
	private ArrayList<CategoryModel> categorylist;
	private ArrayList<UnitModel> unitlist;
	private ArrayList<TaxModel> taxeslist;

	/**
	 * Create the dialog.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public AddItems() {
		setModal(true);
		setUndecorated(true);
		setBounds(100, 100, 487, 596);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(8,12,11));
		contentPanel.setBorder(new LineBorder(Color.WHITE));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		
		GetInventryDataImpl getInventryData=new GetInventryDataImpl();
		//System.out.println("1 ST Time "+About.getCurrentTimestamp());
		categorylist=getInventryData.getCategoryData();
		String[] cat_array = new String[categorylist.size()];
		for(int i = 0; i < cat_array.length; i++) {
			cat_array[i] = categorylist.get(i).getCat_name();
		}
	
        unitlist=getInventryData.getUnitData();
		String[] unit_array = new String[unitlist.size()];
		for(int i = 0; i < unit_array.length; i++) {
			unit_array[i] = unitlist.get(i).getUnitName();
		}
		
        taxeslist=getInventryData.getTaxesData();
		String[] tax_array = new String[taxeslist.size()];
		for(int i = 0; i < tax_array.length; i++) {
			tax_array[i] = taxeslist.get(i).getTaxName();
		}
		
		
		
		 btnSave = new JButton("Save");
		 btnSave.setFocusPainted(false);
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Dialog", Font.BOLD, 15));
		btnSave.setBorder(new LineBorder(new Color(255, 255, 255)));
		btnSave.setBackground(new Color(76, 79, 74));
		btnSave.setActionCommand("Save");
		btnSave.setBounds(192, 524, 100, 41);
		btnSave.addActionListener(this);
		contentPanel.add(btnSave);
		
		 btnCancel = new JButton("Cancel");
		 btnCancel.setFocusPainted(false);
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Dialog", Font.BOLD, 15));
		btnCancel.setBorder(new LineBorder(Color.WHITE));
		btnCancel.setBackground(new Color(76, 79, 74));
		btnCancel.setActionCommand("Cancel");
		btnCancel.setBounds(315, 524, 100, 41);
		btnCancel.addActionListener(this);
		contentPanel.add(btnCancel);
		
		txtItemName = new JTextField();
		txtItemName.setForeground(Color.BLACK);
		txtItemName.setFont(new Font("Dialog", Font.BOLD, 13));
		txtItemName.setColumns(10);
		txtItemName.setBorder(null);
		txtItemName.setBackground(UIManager.getColor("Button.disabledToolBarBorderBackground"));
		txtItemName.setBounds(192, 207, 223, 30);
		contentPanel.add(txtItemName);
		
		JLabel lblNewLabel = new JLabel("<html><font color='RED'>*</font>&nbsp;Item Name<html>");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel.setBounds(56, 207, 134, 30);
		contentPanel.add(lblNewLabel);
		
		
		
		lblItemOldStock = new JLabel("  Item Old Stock");
		lblItemOldStock.setForeground(Color.WHITE);
		lblItemOldStock.setFont(new Font("Dialog", Font.BOLD, 12));
		lblItemOldStock.setBounds(56, 258, 134, 30);
		contentPanel.add(lblItemOldStock);
		
		txtOldStock = new JTextField();
		txtOldStock.setForeground(Color.BLACK);
		txtOldStock.setFont(new Font("Dialog", Font.BOLD, 13));
		txtOldStock.setColumns(10);
		txtOldStock.setBorder(null);
		txtOldStock.setBackground(UIManager.getColor("Button.disabledToolBarBorderBackground"));
		txtOldStock.setBounds(192, 258, 223, 30);
		contentPanel.add(txtOldStock);
		
		lblItemNewStock = new JLabel("  Item New Stock");
		lblItemNewStock.setForeground(Color.WHITE);
		lblItemNewStock.setFont(new Font("Dialog", Font.BOLD, 12));
		lblItemNewStock.setBounds(56, 309, 134, 30);
		contentPanel.add(lblItemNewStock);
		
		txtNewStock = new JTextField();
		txtNewStock.setForeground(Color.BLACK);
		txtNewStock.setFont(new Font("Dialog", Font.BOLD, 13));
		txtNewStock.setColumns(10);
		txtNewStock.setBorder(null);
		txtNewStock.setBackground(UIManager.getColor("Button.disabledToolBarBorderBackground"));
		txtNewStock.setBounds(192, 309, 223, 30);
		contentPanel.add(txtNewStock);
		
		lblItemPrice = new JLabel("  Total Cost");
		lblItemPrice.setForeground(Color.WHITE);
		lblItemPrice.setFont(new Font("Dialog", Font.BOLD, 12));
		lblItemPrice.setBounds(56, 411, 134, 30);
		contentPanel.add(lblItemPrice);
		
		lblMrp = new JLabel("<html><font color='RED'>*</font>&nbsp;MRP <html>");
		lblMrp.setForeground(Color.WHITE);
		lblMrp.setFont(new Font("Dialog", Font.BOLD, 12));
		lblMrp.setBounds(56, 360, 134, 30);
		contentPanel.add(lblMrp);
		
		txtMRP = new JTextField();
		txtMRP.setForeground(Color.BLACK);
		txtMRP.setFont(new Font("Dialog", Font.BOLD, 13));
		txtMRP.setColumns(10);
		txtMRP.setBorder(null);
		txtMRP.setBackground(UIManager.getColor("Button.disabledToolBarBorderBackground"));
		txtMRP.setBounds(192, 360, 223, 30);
		contentPanel.add(txtMRP);
		
		txtTotalCost = new JTextField();
		txtTotalCost.setForeground(Color.BLACK);
		txtTotalCost.setFont(new Font("Dialog", Font.BOLD, 13));
		txtTotalCost.setColumns(10);
		txtTotalCost.setBorder(null);
		txtTotalCost.setBackground(UIManager.getColor("Button.disabledToolBarBorderBackground"));
		txtTotalCost.setBounds(192, 411, 223, 30);
		contentPanel.add(txtTotalCost);
		
		lblItemCategory = new JLabel("<html><font color='RED'>*</font>&nbsp;Item Category<html>");
		lblItemCategory.setForeground(Color.WHITE);
		lblItemCategory.setFont(new Font("Dialog", Font.BOLD, 12));
		lblItemCategory.setBounds(56, 102, 134, 30);
		contentPanel.add(lblItemCategory);
		
		 cmbCategory = new JComboBox(cat_array);
		cmbCategory.setBounds(192, 105, 223, 30);
		contentPanel.add(cmbCategory);
		cmbCategory.setForeground(Color.BLACK);
		cmbCategory.setFont(new Font("Dialog", Font.BOLD, 13));
		cmbCategory.setBorder(null);
		cmbCategory.setBackground(UIManager.getColor("Button.disabledToolBarBorderBackground"));
		
		JLabel lblUnit = new JLabel("<html><font color='RED'>*</font>&nbsp;Unit<html>");
		lblUnit.setForeground(Color.WHITE);
		lblUnit.setFont(new Font("Dialog", Font.BOLD, 12));
		lblUnit.setBounds(56, 156, 134, 30);
		contentPanel.add(lblUnit);
		
		cmbUnit = new JComboBox(unit_array);
		cmbUnit.setForeground(Color.BLACK);
		cmbUnit.setFont(new Font("Dialog", Font.BOLD, 13));
		cmbUnit.setBorder(null);
		cmbUnit.setBackground(UIManager.getColor("Button.disabledToolBarBorderBackground"));
		cmbUnit.setBounds(192, 156, 223, 30);
		contentPanel.add(cmbUnit);
		
		
		lblTax = new JLabel("<html><font color='RED'>*</font>&nbsp;Tax<html>");
		lblTax.setForeground(Color.WHITE);
		lblTax.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTax.setBounds(56, 462, 134, 30);
		contentPanel.add(lblTax);
		
		cmbTaxes = new JComboBox(tax_array);
		cmbTaxes.setForeground(Color.BLACK);
		cmbTaxes.setFont(new Font("Dialog", Font.BOLD, 13));
		cmbTaxes.setBorder(null);
		cmbTaxes.setBackground(UIManager.getColor("Button.disabledToolBarBorderBackground"));
		cmbTaxes.setBounds(192, 462, 223, 30);
		contentPanel.add(cmbTaxes);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(null);
		panel.setBackground(new Color(76, 79, 74));
		panel.setBounds(1, 1, 485, 23);
		contentPanel.add(panel);
	
		
		lblScreen = new JLabel("Add Items");
		lblScreen.setForeground(SystemColor.menu);
		lblScreen.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblScreen.setBounds(12, 1, 170, 23);
		panel.add(lblScreen);
		
		 chkActive = new JCheckBox("Active");
		 chkActive.setSelected(true);
		chkActive.setFont(new Font("Dialog", Font.BOLD, 13));
		chkActive.setOpaque(false);
		chkActive.setForeground(Color.RED);
		chkActive.setBounds(359, 51, 75, 24);
		contentPanel.add(chkActive);
		
		
		
		
		setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String action=arg0.getActionCommand();
		//System.err.println(action);
		if(action.equals("Save"))
		{
			 LogicToGetIDs logictogetid=new LogicToGetIDs();
			 
			 addInventrydataobj=new AddInventryDataImpl();
			 addInventrydataobj.AddItems(txtItemName.getText(),logictogetid.getUnitID(cmbUnit.getSelectedItem().toString(), unitlist) , logictogetid.getCatID(cmbCategory.getSelectedItem().toString(), categorylist), logictogetid.getTaxID(cmbTaxes.getSelectedItem().toString(), taxeslist),txtMRP.getText(),txtNewStock.getText(), txtOldStock.getText(), txtTotalCost.getText(), 1);
			 
			 dispose();
		}
		if(action.equals("Cancel"))
		{
			dispose();
		}
		
	}
}
