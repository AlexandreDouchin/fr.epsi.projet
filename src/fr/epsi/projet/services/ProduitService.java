package fr.epsi.projet.services;

import java.util.List;
import org.springframework.stereotype.Service;
import fr.epsi.projet.beans.Produit;

@Service
public interface ProduitService {
	public List<Produit> getProduits();

}
