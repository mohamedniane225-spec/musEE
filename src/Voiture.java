public class Voiture {
    private int puissance;
    private String modele;
      public Voiture(){}
    public Voiture(int puissance, String modele){
        this.puissance=puissance;
        this.modele=modele;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }
}
