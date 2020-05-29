/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Livre {
    String NomOuvrage;
    String NomAuteur;
    String AnneeEdi;
    Integer Prix;

    public Livre(String NomOuvrage, String NomAuteur, String AnneeEdi, Integer Prix) {
        this.NomOuvrage = NomOuvrage;
        this.NomAuteur = NomAuteur;
        this.AnneeEdi = AnneeEdi;
        this.Prix = Prix;
    }

    public void setNomOuvrage(String NomOuvrage) {
        this.NomOuvrage = NomOuvrage;
    }

    public void setNomAuteur(String NomAuteur) {
        this.NomAuteur = NomAuteur;
    }

    public void setAnneeEdi(String AnneeEdi) {
        this.AnneeEdi = AnneeEdi;
    }

    public void setPrix(Integer Prix) {
        this.Prix = Prix;
    }

    public String getNomOuvrage() {
        return NomOuvrage;
    }

    public String getNomAuteur() {
        return NomAuteur;
    }

    public String getAnneeEdi() {
        return AnneeEdi;
    }

    public Integer getPrix() {
        return Prix;
    }
    
}
