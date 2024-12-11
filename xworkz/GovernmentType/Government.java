package com.xworkz.GovernmentType;

public class Government {
	
	ChiefMinister chiefminister;
	Minister[] minister;
	MLA[] mla;
	BudgetScheme[] budgetscheme;
	
	public Government(ChiefMinister chiefminister , Minister[] minister , MLA[] mla , BudgetScheme[] budgetscheme) {
		
		this.chiefminister = chiefminister;
		this.minister = minister;
		this.mla = mla;
		this.budgetscheme = budgetscheme;
		
	}
		
		public void printDetails() {
			System.out.println("ChiefMinisters");
			System.out.println(chiefminister.name);
			System.out.println(chiefminister.age);
			System.out.println(chiefminister.state);
			
			System.out.println("---------------");
			
			System.out.println("Ministers");
	        minister[0].ministerinformation();
	        minister[1].ministerinformation();
	        minister[2].ministerinformation();
	        minister[3].ministerinformation();
	        
	        System.out.println("---------------");
	        
	        System.out.println("MLA");
	        mla[0].MLAinformation();
	        mla[1].MLAinformation();
	        mla[2].MLAinformation();
	        mla[3].MLAinformation();
	        
	        System.out.println("---------------");
	        
	        System.out.println("Budgetscheme");
	        budgetscheme[0].budgetschemeinformation();
	        budgetscheme[1].budgetschemeinformation();
	        budgetscheme[2].budgetschemeinformation();
	        
	       
	        
			
			
		
	}

}
