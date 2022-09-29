package com.walsallcollege.namesapp;

public class NamesHolder {

	private String[] namesList;
	
	public NamesHolder(){
		namesList = new String[]{"pete","harry","wendy","mathew","pooja","lucy","jacob", 
				"mohammed","amit","sapinder","wayne","narinder","sally","larry","gary"};
	}
	
	public boolean findName(String nameToFind){
		
		for (int i = 0; i < namesList.length; i++)
		{
			
			String tempVar = namesList[i];
			
			if(tempVar == nameToFind)
			{
				return true;
			}
		}
		
		return false;
		
	}
	
}
