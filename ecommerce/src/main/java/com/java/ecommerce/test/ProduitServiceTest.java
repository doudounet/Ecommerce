package com.java.ecommerce.test;


public class ProduitServiceTest {

	// private static ProduitService produitService;
	//
	// @BeforeClass
	// public static void setup() {
	// produitService = new ProduitService();
	// }
	//
	// @AfterClass
	// public static void teardown() {
	// produitService = null;
	// }
	//
	// @Test
	// public void testGetProduitById() {
	// Produit produit = produitService.getProduitById(1);
	// Assert.assertNotNull(produit);
	// System.out.println("Voici le resultat de la recherche par ID :");
	// System.out.println(produit);
	// }
	//
	// @Test
	// public void testGetAllProduits() {
	// List<Produit> produits = produitService.getAllProduits();
	// Assert.assertNotNull(produits);
	// System.out.println("Voici la liste des produits : ");
	// for (Produit produit : produits) {
	// System.out.println(produit);
	// }
	//
	// }
	//
	// @SuppressWarnings("deprecation")
	// @Test
	// public void testInsertProduit() {
	// Produit produit = new Produit();
	// produit.setIdProduit(10);
	// produit.setNomProduit("test");
	// produit.setPrixUnitaireProduit(10);
	// produit.setDescriptionProduit("TestDesc");
	// produit.setShortDescriptionProduit("Test Sh Desc");
	//
	// produitService.insertProduit(produit);
	//
	// Produit createdProduit =
	// produitService.getProduitById(produit.getIdProduit());
	// Assert.assertNotNull(createdProduit);
	// Assert.assertEquals(produit.getIdProduit(),
	// createdProduit.getIdProduit());
	// Assert.assertEquals(produit.getNomProduit(),
	// createdProduit.getNomProduit());
	// Assert.assertEquals(produit.getPrixUnitaireProduit(),
	// createdProduit.getPrixUnitaireProduit());
	// Assert.assertEquals(produit.getDescriptionProduit(),
	// createdProduit.getDescriptionProduit());
	// Assert.assertEquals(produit.getShortDescriptionProduit(),
	// createdProduit.getShortDescriptionProduit());
	// System.out.println("Un produit a été ajouté ( " +
	// createdProduit.getNomProduit() + " ) :");
	//
	// }
	//
	// @Test
	// public void testUpdateProduit() {
	// long timestamp = System.currentTimeMillis();
	// Produit produit = produitService.getProduitById(3);
	// produit.setNomProduit("TestLastName" + timestamp);
	// produitService.updateProduit(produit);
	// Produit updatedProduit = produitService.getProduitById(3);
	// Assert.assertEquals(produit.getNomProduit(),
	// updatedProduit.getNomProduit());
	// System.out.println("Un produit a été mis à jour ( " +
	// updatedProduit.getNomProduit() + ") :");
	// }
	//
	// @Test
	// public void testDeleteProduit() {
	// Produit produit = produitService.getProduitById(5);
	// produitService.deleteProduit(produit.getIdProduit());
	// Produit deletedProduit = produitService.getProduitById(5);
	// Assert.assertNull(deletedProduit);
	// System.out.println("Un produit a ete supprime");
	//
	// }

}