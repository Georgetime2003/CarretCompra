package com.company;

public abstract class Producte {
	private float preu;
	private String nom;
	private String codibarres;
	
	public Producte(float preu, String nom, String codi) {
		this.preu = preu;
		this.nom = nom;
		codibarres = codi;
	}


	public float getPreu() {
		return preu;
	}

	public void setPreu(float preu) {
		this.preu = preu;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCodibarres() {
		return codibarres;
	}
	public void setCodibarres(String codibarres) {
		this.codibarres = codibarres;
	}

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

	@Override
	public int hashCode() {
		int codi = codibarres.hashCode();
		return codi;
	}
	
	
	

}
