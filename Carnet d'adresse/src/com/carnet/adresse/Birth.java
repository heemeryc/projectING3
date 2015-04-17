package com.carnet.adresse;

public class Birth {

	private String date;
	private int age;
	
	public Birth(){}
	
	public Birth(String pDate){
		
		date=this.formatDate(pDate);
		age=calculAge();
	}
	
	private String formatDate(String pDate){
		
		String tDate=pDate.substring(0,10);
		//System.out.println(tDate);
		if(tDate.charAt(2)!='/' ||tDate.charAt(5)!='/')
			tDate="00/00/0000";
		//System.out.println(tDate);
		return tDate;
	}
	
	public void setDate(String pDate){
		System.out.println("Formatage...");
		this.date=formatDate(pDate);
	}
	
	private int calculAge(){
		//FUTUR CALCULE D'AGE
		//String subDate=this.date.substring(6,10);
		//int annee=Integer.parseInt(subDate);
		
		return 0;
	}
	
	public String toString(){
		if (this.date!=null)
			return "Date de naissance: "+this.date+"\tAge: "+this.age+"\n";
		else
			return "";
	}

	
	
}
