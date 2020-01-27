public interface Plot {
    public int abs = 0;
    public int ord = 0;

    /** pas de corps de methode **/
    int getAbs();
    int getOrd();

    Plot getPlotTo(Direction d);

}
