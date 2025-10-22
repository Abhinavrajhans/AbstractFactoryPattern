package parkingLotProblem.services;


import parkingLotProblem.factories.PricingStrategyFactory;
import parkingLotProblem.models.pricing.PricingStrategy;
import parkingLotProblem.models.pricing.PricingStrategyType;
import parkingLotProblem.models.tickets.Ticket;


public class PricingService {

    public static long calculateParkingCharge( Ticket ticket){

        for(PricingStrategy pricingStrategy : ticket.getPricingStrategies()){
            if(pricingStrategy.getType().equals(PricingStrategyType.HOURLY))
            {
                pricingStrategy= PricingStrategyFactory.createHourlyPricingStrategy(ticket);
            }
        }
        return ticket.getPricingStrategies().stream().mapToLong(PricingStrategy::calculatePrice).sum();

    }
}
