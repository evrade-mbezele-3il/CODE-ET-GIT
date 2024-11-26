public class StockManager {

    /**
     * Cette méthode permet de gérer le stock
     * @param typeOperation : représente le type d'opération effectuer pouvant être l'ajout ou le retrait
     * @param produit : représente le nom du produit
     * @param quantite : représente la quantité de produit à retirer ou à ajouter dans le stock
     * @param stock : représente la quantité de produits qui est présente
     */
    public void gererStock(String typeOperation, String produit, int quantite, int stock) {

        switch(typeOperation) {

            case "ajout" :
                ajoutStock(produit,quantite,stock);
                break;
            case "retrait" :

                if(statutRetraitStock(quantite,stock)) {
                   retraitStock(produit,quantite,stock);
                }else{
                   stockInsuffisant(produit);
                }
                break;

            default :
                System.out.println("Opération inconnue.");
                break;
        }
    }

    /**
     * Cette méthode permet de savoir si le stock est suffisant pour un retrait
     * @param quantite : représente la quantité de produit à retirer dans le stock
     * @param stock : représente la quantité de produits qui est présente
     * @return : booléen indiquant si le stock est suffisant ou non
     */
    public boolean statutRetraitStock(int quantite,int stock) {

        return(stock >= quantite);
    }

    /**
     * Cette méthode permet d'ajouter des produits dans le stock
     * @param quantite : représente la quantité de produit à ajouter dans le stock
     * @param stock : représente la quantité de produits qui est présente
     * @param produit : représente le nom du produit
     */
    public void ajoutStock(String produit,int quantite,int stock) {
        stock += quantite;
        System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
    }

    /**
     * Cette méthode permet de retirer des produits dans le stock
     * @param quantite : représente la quantité de produit à retirer dans le stock
     * @param stock : représente la quantité de produits qui est présente
     * @param produit : représente le nom du produit
     */
    public void retraitStock(String produit,int quantite,int stock) {
        stock -= quantite;
        System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
    }

    /**
     * Cette méthode permet de gerer le cas ou les produits sont insuffisants
     * @param produit : représente le nom du produit
     */
    public void stockInsuffisant(String produit) {
        System.out.println("Stock insuffisant pour le produit : " + produit);
    }

}
