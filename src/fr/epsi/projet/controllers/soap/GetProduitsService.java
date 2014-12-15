package fr.epsi.projet.controllers.soap;

import java.util.List;
import javax.jws.WebService;
import fr.epsi.projet.beans.Produit;

@WebService(name="GetProduitsService",serviceName="GetProduitsService")
public interface GetProduitsService {
	public List<Produit> getproduits();

}
