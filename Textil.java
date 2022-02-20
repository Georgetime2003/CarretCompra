package com.company;

public class Textil extends Producte {
	private String composicio;
	private String codificacio;

	public Textil(float preu, String nom, String codi, String compo) {
		super(preu, nom, codi);
		composicio = compo;
		codificacio = preu + codi;
	}

	public String getComposicio() {
		return composicio;
	}

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

}
