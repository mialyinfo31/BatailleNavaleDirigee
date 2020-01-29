public enum ShipModel {
    PORTE_AVION(5) ,
    CROISEUR(4),
    CONTRE_TORPILLEUR(3),
    SOUS_MARRIN(2),
    TORPILLEUR(6);

    /*Attributs*/
    private int size;

    /**Constructor**/
     ShipModel(int size) {
        this.size = size;
    }

    /**Getter and setter**/
    public int getSize() { return size; }


    /** NOTES *********************************
     * ModeleBateau.CONTRE_TORPILLEUR.getSize() renvoie la taille;
     * ModeleBateau.values(); récupère le modèle de bateau**/
}