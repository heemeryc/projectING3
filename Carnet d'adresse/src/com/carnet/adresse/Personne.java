package com.carnet.adresse;

import java.util.*;

public class Personne {
	protected Relation relation = new Inconnu();
	protected String nom="?";
	protected String surnom=null;
	protected String prenom="?";
	protected String adresse=null;
	protected String ville=null;
	protected String pays=null;
	protected Birth birth= new Birth();
	protected List<Telephone> tPhone= new LinkedList<Telephone>();
	
	public Personne(){}
	
	public Personne(String pNom,String pPrenom){
		nom=pNom.toUpperCase();
		prenom=pPrenom;
	}
	
	public Personne(String pNom,String pPrenom,String pSurnom,String pAdresse,String pVille,String pPays,String pDate,Relation pRelation){
		nom=pNom.toUpperCase();
		prenom=pPrenom;
		this.relation= pRelation;
		setDate(pDate);
		surnom=pSurnom;
		adresse=pAdresse;
		ville=pVille;
		pays=pPays;
	}
	
	public void setNom(String pNom){
		this.nom=pNom;
	}
	
	public void setPrenom(String pPrenom){
		this.prenom=pPrenom;
	}
	
	public void setDate(String pDate){
		this.birth.setDate(pDate);
	}
	
	public void setRelation(Relation pRelation){
		this.relation=pRelation;
	}
	
	public void setSurnom(String pSurnom){
		this.surnom=pSurnom;
	}
	
	public void addNumero(String pType,String pNumero){
		this.tPhone.add(new Telephone(pType,pNumero));
	}
	
	public void setAdresse(String pAdresse){
		this.adresse=pAdresse;
	}
	
	public void setVille(String pVille){
		this.ville=pVille;
	}
	
	public void setPays(String pPays){
		this.pays=pPays;
	}
	
	private String writeSurnom(){
		if(this.surnom!=null)
			return "\tSurnom: "+this.surnom+"\n";
		else
			return "\n";
	}
	
	private String writeNom(){
		return "Nom : "+this.nom;
	}
	
	private String writePrenom(){
		return "\nPrenom : "+this.prenom;
	}
	
	private String writeRelation(){
		return "Statut: "+  relation+"\n";
	}
	
	private String writeNumero(){
		String aff="";
		if (tPhone.size()>0){
			aff=aff+"Numéro de Téléphone:\n";
			for(int i = 0; i < tPhone.size(); i++)
				 aff=aff+"\t"+tPhone.get(i);
		}
		return aff;
	}
	
	private String writeAdresseComplete(){
		String ad="";
		if (this.adresse!=null || this.ville!=null|| this.pays!=null){
			ad="Adresse: ";
			if(this.adresse!=null)
				ad+=this.adresse;
			if (this.ville!=null) 
				ad+="\t"+this.ville;
			if (this.pays!=null)
				ad+="\t"+this.pays;
			ad+="\n";
		}
		return ad;
	}
	
	public String toString(){
		return writeNom()+writePrenom()+writeSurnom()+birth+writeRelation()+writeNumero()+writeAdresseComplete();
	}

}
