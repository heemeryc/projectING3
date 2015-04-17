package com.carnet.adresse;

public class Telephone {

	private String type;
	private String numero;
	
	public Telephone(String pType,String pNumero){
		type=pType;
		numero=pNumero;
	}
	
	public void setNumero(String pNumero){
		numero=pNumero;
	}
	
	public void setType(String pType){
		type=pType;
	}
	
	public String toString(){
		return ""+this.type+": "+this.numero+"\n";
	}
}
