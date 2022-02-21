package com.company;

/**
 * Ampliació de la classe Producte per demanar dades addicionals sobre el producte Tèxtil
 * @author Jordi Palomino Escarrà
 * @version 2.0
 * @since 21-02-2022
 */
public class Textil extends Producte {
	private String composicio;
	private String codificacio;

	/**
	 * Funció on es recullen totes les dades del producte
	 * @param preu El preu del producte
	 * @param nom El nom del producte
	 * @param codi El codi de barres del producte
	 * @param compo La composició tèxtil del producte
	 */
	public Textil(float preu, String nom, String codi, String compo) {
		super(preu, nom, codi);
		composicio = compo;
		codificacio = preu + codi;
	}

	/**
	 * Funció per demanar el tipus de composició
	 * @return String de Composició
	 */
	public String getComposicio() {
		return composicio;
	}

	/**
	 * Funció per afegir la composició al seu objecte
	 * @param composicio variable String del tipus de tèxtil de roba
	 */
	public void setComposicio(String composicio) {
		this.composicio = composicio;
	}

	@Override
	public String toString() {
		return new String(getNom() + " " + getPreu());
	}

	//aquesta funció no s'està usant
	public String getCode (){
		return codificacio;
	}
	public void setCode(){
		this.codificacio = codificacio;
	}

}
