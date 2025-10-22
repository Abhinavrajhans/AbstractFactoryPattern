package parkingLotProblem.factories;

import parkingLotProblem.models.parking.FindSlotStrategy;
import parkingLotProblem.models.parking.LinearSearchFindingStrategy;

public class FindSlotStrategyFactory {

    public static FindSlotStrategy createLinearSearchFindSlotStrategy(){
        return new LinearSearchFindingStrategy();
    }
}
