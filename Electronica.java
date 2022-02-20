package com.company;

public class Electronica extends Producte {
	private int dies_garantia;

	public Electronica(float preu, String nom, String codi, int diesg) {
		super(preu, nom, codi);
		dies_garantia = diesg;
	}

	@Override
	public float getPreu() {
		float preu = super.getPreu();
		return (float) (preu + preu*(dies_garantia/365)*0.1);
	}


	@Override
	public String toString() {
		return getNom() + "," + getPreu();
	}
	
	
	

}
