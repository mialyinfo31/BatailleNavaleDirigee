/**
 * Elle représente une case (x,y)
 */
public class BoardPlot implements Plot{

    private int abs;
    private int ord;

    public BoardPlot(int absisse, int ordonnee) {
        this.abs = absisse;
        this.ord = ordonnee;
    }

    @Override
    public int getAbs() {
        return this.abs;
    }

    @Override
    public int getOrd() {
        return this.ord;
    }

    /**
     * Methode permettant de faire avancer d'une case selon la direction
     *  Retourne le Plot suivant en fonction de la direction
     *  */
    @Override
    public Plot getNextPlotTo(Direction direction) {
        /**
         * Pas besoin de mettre Ship en param
         * ni d'utiliser this.abs, this.ord
         * les noms de prop identiques à la classe suffisent
         * */
        int nextAbscisse = abs;
        int nextOrdonnee = ord;

        if(direction == Direction.NORTH){
            nextOrdonnee--;
        }
        if(direction == Direction.SOUTH){
            nextOrdonnee++;
        }
        if(direction == Direction.EST){
            nextAbscisse++;
        }
        if(direction == Direction.WEST){
            nextAbscisse--;
        }
        final BoardPlot nextPlot = new BoardPlot(nextAbscisse, nextOrdonnee);
        return nextPlot;
    }
}
