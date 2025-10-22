package observerPattern.CricBuzz.good.subscribers;

import observerPattern.CricBuzz.good.models.Innings;
import observerPattern.CricBuzz.good.models.Match;
import observerPattern.CricBuzz.good.producers.Producer;

import java.util.List;

public class ScoreBoardSubscriber implements Subscriber {

    private Match match;
    private List<Producer> producers;

    public  ScoreBoardSubscriber(Match match,List<Producer> producers) {
        this.match = match;
        for(Producer producer : producers) {
            producer.subscribe(this);
        }
        this.producers = producers;
    }

    public void update(Producer producer) {
        boolean isFirstInnings = producer.getMatch().isFirstInnings();
        Innings inningsProducer = isFirstInnings ? producer.getMatch().getInnings1() : producer.getMatch().getInnings2();
        Innings inningsSubscriber = isFirstInnings ? match.getInnings1() : match.getInnings2();
        inningsSubscriber.setCurrentScore(inningsProducer.getCurrentScore());
        inningsSubscriber.setCurrentBall(inningsProducer.getCurrentBall());
        inningsSubscriber.setCurrentOver(inningsProducer.getCurrentOver());
        inningsSubscriber.setWickets(inningsProducer.getWickets());



    }
}
