package com.xworkz.Government;

import com.xworkz.GovernmentType.BudgetScheme;
import com.xworkz.GovernmentType.ChiefMinister;
import com.xworkz.GovernmentType.Government;
import com.xworkz.GovernmentType.MLA;
import com.xworkz.GovernmentType.Minister;

public class GovernmentRunner {

	public static void main(String[] args) {
		
		ChiefMinister chiefminister = new ChiefMinister("Siddaramaiah", 76 , "Karnataka");
		
		Minister minister = new Minister("DK Shivkumar", "Major and Medium Irrigation", "30years");
		Minister minister1 = new Minister("Ramalinga Reddy", "Transport", "25years");	
		Minister minister2 = new Minister("priyank Kharge", "Rural Development and Panchayati", "10years");
		Minister minister3 = new Minister("KrishnaByreGowda", "Revenue", "!5years");
		Minister[] ministerarr = {minister , minister1 , minister2 , minister3};
		
		MLA mla = new MLA("Channapatna", 61 , "CP Yogeshwar");
		MLA mla1 = new MLA("Ramanagara", 51 , "Iqbal Hussain");
		MLA mla2 = new MLA("Kanakapura", 62 , "DK Shivakumar");
		MLA mla3 = new MLA("Magadi", 57 , "Balakrishna");
		MLA[] mlaarr = {mla , mla1 , mla2 , mla3};
		
		BudgetScheme budgetscheme = new BudgetScheme("Education and Infrastructure" , 400000000, "Prerana Scheme"); 
		BudgetScheme budgetscheme1 = new BudgetScheme("Farmers Productivity" , 2000000000, "Karnataka Raita Samriddhi Yojana");
		BudgetScheme budgetscheme2 = new BudgetScheme("Financial Support to Women" , 600000000, "Gruha Lakshmi") ;
		BudgetScheme[] budgetschemearr = {budgetscheme , budgetscheme1 , budgetscheme2};
		
		Government government = new Government(chiefminister , ministerarr , mlaarr , budgetschemearr);
		
		government.printDetails();
		
	}
}
