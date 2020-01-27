public enum ShipModel {
    PORTE_AVION(5) ,
    CROISEUR(4),
    CONTRE_TORPILLEUR(3),
    SOUS_MARRIN(2),
    TORPILLEUR(6);

    private int size;

    /**Constructor**/
     ShipModel(int size) {
        this.size = size;
    }

    /**Getter and setter**/
    // Eviter de mettre le setter afin d'assurer la sécurité
    public int getSize() {
        return size;
    }


    /** NOTES *********************************
     * ModeleBateau.CONTRE_TORPILLEUR.getSize();
     * ModeleBateau.values();**/
}