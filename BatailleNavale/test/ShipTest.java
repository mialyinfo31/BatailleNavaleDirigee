import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShipTest {

    @Test
    void isOnPlot() {
        Ship myOwnShip = new Ship
                (       new BoardPlot(1,8),
                        ShipModel.CROISEUR,
                        Direction.SOUTH
                );
    }

    @Test
    void getBoardPlotList() {
    }
}