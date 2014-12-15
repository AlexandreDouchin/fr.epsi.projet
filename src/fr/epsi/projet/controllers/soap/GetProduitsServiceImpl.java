package fr.epsi.projet.controllers.soap;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import fr.epsi.projet.beans.Produit;

public class GetProduitsServiceImpl extends SpringBeanAutowiringSupport implements GetProduitsService {

	@Autowired
	private fr.epsi.projet.services.ProduitService
	produitService;

	@Override
	public List<Produit> getproduits() {
		return produitService.getProduits();
	}

}
