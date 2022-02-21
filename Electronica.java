package com.company;
/**
 * Ampliació de la classe Producte per demanar dades addicionals sobre el producte Electronica
 * @author Jordi Palomino Escarrà
 * @version 2.0
 * @since 21-02-2022
 */
public class Electronica extends Producte {
	private int dies_garantia;

	/**
	 * Funció per emmagatzemar totes les dades que hem recollit sobre el producte
	 * @param preu El preu del producte
	 * @param nom El nom del producte
	 * @param codi El codi de barres del producte
	 * @param diesg Els dies de garantia que té el producte
	 */
	public Electronica(float preu, String nom, String codi, int diesg) {
		super(preu, nom, codi);
		dies_garantia = diesg;
	}

	/**
	 * Funció que sobreescriu la de getpreu de la classe producte per els càlculs addicionals sobre el seu tipus
	 * @return el preu en float
	 */
	@Override
	public float getPreu() {
		float preu = super.getPreu();
		return (float) (preu + preu*(dies_garantia/365)*0.1);
	}

	/**
	 * toString Funció que sobrescriu una funció base de Java per adjuntar les variables de nom i preu per la llista de la compra
	 * @return Un nou string amb el nom i preu del producte
	 */
	@Override
	public String toString() {
		return getNom() + "," + getPreu();
	}
	
	
	

}
