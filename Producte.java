package com.company;

/**
 * Classe principal per obtenir les dades dels diferents tips de productes
 * @author Jordi Palomino Escarrà
 * @version 2.0
 * @since 21-02-2022
 */
public abstract class Producte {
	private float preu;
	private String nom;
	private String codibarres;

	/**
	 * Funció per demanar els elements bàsics del producte dintre de l'objecte
	 * @param preu Objecte preu
	 * @param nom Objecte nom
	 * @param codi Onjecte codi de barres
	 */
	public Producte(float preu, String nom, String codi) {
		this.preu = preu;
		this.nom = nom;
		codibarres = codi;
	}

	/**
	 * Funció per demanar el preu
	 * @return preu en float
	 */
	public float getPreu() {
		return preu;
	}

	/**
	 * Funció per afegir el preu dins de l'objecte
	 * @param preu Variable preu en float
	 */
	public void setPreu(float preu) {
		this.preu = preu;
	}

	/**
	 * Funció per demanar el nom del producte
	 * @return Nom en format String
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Funció per afegir la variable dins l'objecte
	 * @param nom Variable nom en String
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Funció per demanar el codi de barres
	 * @return codibarres en format String
	 */
	public String getCodibarres() {
		return codibarres;
	}

	/**
	 * Funció per afegir la variable dins l'objecte
	 * @param codibarres Variable en String
	 */
	public void setCodibarres(String codibarres) {
		this.codibarres = codibarres;
	}

	/**
	 * Funció de comprovació o validació per no duplicar objectes a la llista de la compra
	 * @param obj objecte a comparar
	 * @return booleà son_iguals true si són iguals o false si són diferents
	 */
	@Override
	public boolean equals(Object obj) {
		boolean son_iguals;
		if(obj == null) {
			son_iguals = false;
			return son_iguals;
		}
		else {
			Producte p = (Producte) obj;
			if (codibarres.equals(p.getCodibarres()) && getPreu() == p.getPreu()) {
				son_iguals = true;
				return son_iguals;
			}
			else {
				son_iguals = false;
				return son_iguals;
			}
		}
	}

	/**
	 * Funció per transformar el codi en hash
	 * @return codi en int
	 */
	@Override
	public int hashCode() {
		int codi = codibarres.hashCode();
		return codi;
	}
	
	
	

}
