package com.company;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alimentacio extends Producte {
	
	private LocalDate d;

	public Alimentacio(float preu, String nom, String codi, LocalDate datac) {
		super(preu, nom, codi);
		d = datac; //obtenim la data de caducitat
	}


	@Override
	public float getPreu() {
		float preu = super.getPreu();
		long dif;
		dif = ChronoUnit.DAYS.between(d,LocalDate.now());
		preu = preu - (float) (preu*(1/(dif+1)) + (preu*(0.1)));
		//System.out.println("preu:" + preu);
		return preu;
	}


	@Override
	public String toString() {
		return new String(getNom() + " " + getPreu());
	}
	


}
