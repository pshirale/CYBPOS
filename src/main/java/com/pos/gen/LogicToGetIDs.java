package com.pos.gen;

import java.util.ArrayList;
import java.util.Random;

import com.pos.model.CategoryModel;
import com.pos.model.TaxModel;
import com.pos.model.UnitModel;

public class LogicToGetIDs {
	
	public int getCatID(String CatName, ArrayList<CategoryModel> catlist)
	{  
		int catid = 0;
		for(int i=0;i<catlist.size();i++)
		{
			if(catlist.get(i).getCat_name().equalsIgnoreCase(CatName))
			{
				catid=catlist.get(i).getCat_id();
			}
		}
		return catid;
		
	}
	
	public int getUnitID(String UnitName, ArrayList<UnitModel> unitlist)
	{  
		int unitid = 0;
		for(int i=0;i<unitlist.size();i++)
		{
			if(unitlist.get(i).getUnitName().equalsIgnoreCase(UnitName))
			{
				unitid=unitlist.get(i).getUnitId();
			}
		}
		return unitid;
		
	}
	public int getTaxID(String TaxName, ArrayList<TaxModel> taxlist)
	{  
		int taxid = 0;
		for(int i=0;i<taxlist.size();i++)
		{
			if(taxlist.get(i).getTaxName().equalsIgnoreCase(TaxName))
			{
				taxid=taxlist.get(i).getTaxId();
			}
		}
		return taxid;
		
	}
	public static int generateRandomID() {
		Random random = new Random();
		int  max= 1000000;
		return random.nextInt(max);
	}

}
