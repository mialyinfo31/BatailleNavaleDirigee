import java.util.List;

public class Ship {
    private Plot initialPlot ;
    private ShipModel shipModel ;
    private Direction direction ;
    private List<Plot> plotList;

    /**
     * CONSTRUCTOR
     * @param initialPlot : première case
     * @param shipModel
     * @param direction
     */
    public Ship( Plot initialPlot, ShipModel shipModel, Direction direction) {
        this.initialPlot = initialPlot;
        this.shipModel = shipModel;
        this.direction = direction;
        placeShip();
    }

    /**
     *      Methode vérifiant si le bateau est dans une case
     */
    public boolean isOnPlot( BoardPlot plot ){
        if (plotList.contains(plot)){
            return true;
        }
        return false;
    }

    /**
     *     Methode pour placer le bateau : manipule la collection
     *     Final pour ne pas permettre la redefinition (sécurité)
     */
    final private void placeShip() {
        // récupérer la première case
        Plot currentPlot = initialPlot;
        plotList.add(initialPlot);

        // constituer la liste des coordonnées pour placer le bateau
        for (int i = 1; i <this.getShipModel().getSize() ; i++) {
            currentPlot = currentPlot.getNextPlotTo(direction);
           plotList.add(currentPlot);
           System.out.println(plotList);
        }
    }


    /**
     * GETTER AND SETTER
     */
    public Plot getInitialPlot() {
        return initialPlot;
    }

    public void setInitialPlot(Plot initialPlot) {
        this.initialPlot = initialPlot;
    }

    public ShipModel getShipModel() {
        return shipModel;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public List<Plot> getPlotList() {
        return plotList;
    }

    public void setPlotList(List<Plot> plotList) {
        this.plotList = plotList;
    }

}
