package fr.epsi.projet.listeners;

import java.util.ArrayList;
import java.util.List;

import fr.epsi.projet.beans.*;

public class MyListeners {

	private static List<Client> listOfClients;

	public static List<Client> getListOfClients() {
		return listOfClients;
	}
	
	private static List<Produit> listOfProduits;
	
	private static List<Produit> getListOfProduits() {
		return listOfProduits;
	}
	
	public MyListeners() {
		listOfClients = new ArrayList<Client>();
		Client client = new Client();
		client.setLogin("Alex");
		client.setMdp("alex");
		client.setNumClient("AD1");
		
		client = new Client();
		client.setLogin("Antoine");
		client.setMdp("antoine");
		client.setNumClient("AB2");
		
		client = new Client();
		client.setLogin("Jacques");
		client.setMdp("jacques");
		client.setNumClient("JP3");
		
		client = new Client();
		client.setLogin("Vincent");
		client.setMdp("vincent");
		client.setNumClient("VP4");

		listOfProduits = new ArrayList<Produit>();
		Produit produit = new Produit();
		produit.setReference("Produit 1");
		produit.setNom("Produit 1");
		produit.setQteDisponible(1);
		
		produit = new Produit();
		produit.setReference("");
		produit.setNom("");
		produit.setQteDisponible(4);
		
		produit = new Produit();
		produit.setReference("");
		produit.setNom("");
		produit.setQteDisponible(12);
		
		produit = new Produit();
		produit.setReference("");
		produit.setNom("");
		produit.setQteDisponible(41);
	}
}
