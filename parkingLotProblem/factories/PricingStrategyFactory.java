package parkingLotProblem.factories;

import parkingLotProblem.config.ServerConfig;
import parkingLotProblem.helpers.TimeHelpers;
import parkingLotProblem.models.mobility.Vehicle;
import parkingLotProblem.models.pricing.HourlyPricingStrategy;
import parkingLotProblem.models.pricing.PricingStrategy;
import parkingLotProblem.models.tickets.Ticket;

public class PricingStrategyFactory {

    public static PricingStrategy createHourlyPricingStrategy(Ticket ticket) {
        return new HourlyPricingStrategy(ServerConfig.PRICE_PER_HOUR, TimeHelpers.convertMilliSecondsToHours(
                ticket.getExitTime()-ticket.getEntryTime()
        ));
    }
}
