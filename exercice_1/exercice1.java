public class FactureManager {

    private final double reductionCinq = 0.05 ;// Réduction de 5%
    private final double reductionDix = 0.1 ; // Réduction de 10%
    private final double reductionQuinze = 0.15 ; // Réduction de 15%

    /**
     * Cette méthode permet de calculer une facture totale , elle donne le total après réductions
     * @param typeProduit : représente le type de produit de la facture pouvant être Alimentaire, electronique ou Luxe
     * @param quantite : représente la quantité de produits 
     * @param prixUnitaire : c'est le prix d'un produit
     * @return : retourne le montant total de la facture
     */
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        double total = quantite * prixUnitaire;

        // reduction selon la catégorie
        switch(typeProduit) {

            case "Alimentaire" :
                  total = reductionAlimentairePrix(total);
                break;

            case "Electronique" :
                  total = reductionElectroniquePrix(total);
                break;
            
            case "Luxe" :
                  total = reductionLuxePrix(total);
                break;
        }

        return reductionSupplementairePrix(total);
    }

    /**
     * Cette méthode permet d'appliquer une reduction supplémentaire à un gros montant
     * @param montant : la somme sur laquelle on veut appliquer la reduction
     * @return : renvoit le montant après reduction
     */
    public double reductionSupplementairePrix(double montant) {
        if (prix > 1000) {
            montant -= montant * reductionCinq ; // Réduction supplémentaire de 5% pour les gros montants
        }
        return montant;
    }

    /**
     * Cette méthode permet d'appliquer une reduction à un montant d'un produit de type alimentaire
     * @param montant : la somme sur laquelle on veut appliquer la reduction
     * @return : renvoit le montant après reduction
     */

    public double reductionAlimentairePrix(double montant) {
        
         return (montant - montant * reductionCinq) ; 
    }
    
    /**
     * Cette méthode permet d'appliquer une reduction à un montant d'un produit de type electronique
     * @param montant : la somme sur laquelle on veut appliquer la reduction
     * @return : renvoit le montant après reduction
     */
    public double reductionElectroniquePrix(double montant) {
        
         return (montant - montant * reductionDix); 
    }

    /**
     * Cette méthode permet d'appliquer une reduction à un montant d'un produit de type Luxe
     * @param montant : la somme sur laquelle on veut appliquer la reduction
     * @return : renvoit le montant après reduction
     */
    public double reductionLuxePrix(double montant) {
        
         return (montant - montant * reductionQuinze); 
    }
    
}
