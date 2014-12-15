package fr.epsi.projet.beans;

public class Produit {

	private String reference;
	private String nom;
	private int qteDisponible;
	
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getQteDisponible() {
		return qteDisponible;
	}
	public void setQteDisponible(int qteDisponible) {
		this.qteDisponible = qteDisponible;
	}
	
}
