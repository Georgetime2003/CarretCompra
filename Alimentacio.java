package com.company;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
/**
 * Ampliació de la classe Producte per demanar dades addicionals sobre el producte Alimentació
 * @author Jordi Palomino Escarrà
 * @version 2.0
 * @since 21-02-2022
 */
public class Alimentacio extends Producte {
	private LocalDate d;

	/**
	 * Funció per emmagatzemar totes les dades que hem recollit sobre el producte
	 * @param preu El preu del producte
	 * @param nom El nom del producte
	 * @param codi El codi de Barres del producte
	 * @param datac La data de caducitat del producte
	 */
	public Alimentacio(float preu, String nom, String codi, LocalDate datac) {
		super(preu, nom, codi);
		d = datac; //obtenim la data de caducitat
	}

	/**
	 * Funció que sobreescriu la de getpreu de la classe producte per els càlculs addicionals sobre el seu tipus
	 * @return El preu demanat
	 */
	@Override
	public float getPreu() {
		float preu = super.getPreu();
		long dif;
		dif = ChronoUnit.DAYS.between(d,LocalDate.now());
		preu = preu - (float) (preu*(1/(dif+1)) + (preu*(0.1)));
		//System.out.println("preu:" + preu);
		return preu;
	}

	/**
	 * toString Funció que sobrescriu una funció base de Java per adjuntar les variables de nom i preu per la llista de la compra
	 * @return Un nou string amb el nom i preu del producte
	 */
	@Override
	public String toString() {
		return new String(getNom() + " " + getPreu());
	}
	


}
