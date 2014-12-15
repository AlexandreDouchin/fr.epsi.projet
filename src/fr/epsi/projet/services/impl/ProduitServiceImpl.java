package fr.epsi.projet.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.epsi.projet.beans.Produit;
import fr.epsi.projet.services.ProduitService;


@Service
public class ProduitServiceImpl implements ProduitService{

	public ProduitServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Produit> getProduits() {
			List<Produit> produits = new ArrayList<Produit>();
			Produit produit = new Produit();
			produit.setReference("PDT1");
			produit.setNom("Produit numéro 1");
			produit.setQteDisponible(42);
			produits.add(produit);
		return produits;
	}

}
