/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package insa.marie.projetinfos2;

/**
 *
 * @author debes
 */
public class Produit {
    public int codeProduit;
    public String dProduit;
    public int prix;

    public int getCodeProduit() {
        return codeProduit;
    }

    public void setCodeProduit(int codeProduit) {
        this.codeProduit = codeProduit;
    }

    public String getdProduit() {
        return dProduit;
    }

    public void setdProduit(String dProduit) {
        this.dProduit = dProduit;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public Produit(int codeProduit, String dProduit, int prix) {
        this.codeProduit = codeProduit;
        this.dProduit = dProduit;
        this.prix = prix;
    } 
    
}
