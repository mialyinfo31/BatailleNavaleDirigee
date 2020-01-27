import java.util.List;

public class Ship {
    private int coordinate ;
    private ShipModel shipModel ;
    private Direction direction ;
    List<Plot> plotList ;

    /**
     * CONSTRUCTOR
     * @param coordinate
     * @param shipModel
     * @param direction
     */
    public Ship(int coordinate, ShipModel shipModel, Direction direction) {
        this.coordinate = coordinate;
        this.shipModel = shipModel;
        this.direction = direction;
    }

    /***
     * Methods
     */
    Boolean IsOnPlot( BoardPlot p ){
        if (plotList.contains(p)){
            return true;
        }
        else return false;
    }

}
