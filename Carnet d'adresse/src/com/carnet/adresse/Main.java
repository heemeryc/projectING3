package com.carnet.adresse;

public class Main {

	public static void main(String[] args) {
		Personne p = new Personne("heemeryck","nicolas","coco","44 rue gabriel peri","vlr","france","23/10/1994",new Collègue());
		Personne p2 = new Personne("yoyo","nicolas");
		System.out.println(p2);
		p.setRelation(new Moi());
		p.addNumero("Travail", "0149613901");
		p.addNumero("Portable", "0667047942");
		System.out.println(p);
	}

}
