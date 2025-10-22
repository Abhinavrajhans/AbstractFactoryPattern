package observerPattern.CricBuzz.good.producers;

import observerPattern.CricBuzz.good.models.Match;
import observerPattern.CricBuzz.good.subscribers.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class ICCScoreProducer implements Producer {

    private Match match;

    private List<Subscriber> subscribers;

    ICCScoreProducer( Match match) {
        this.match = match;
        this.subscribers = new ArrayList<>();
    }

    public void scoreUpdated()
    {
        // we will call the api layer to get the data
        // and the api layer has the logic for server sent events
        this.notifySubscribers();
    }


    @Override
    public Match getMatch() {
        return this.match;
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for(Subscriber subscriber : subscribers){
            subscriber.update(this);
        }
    }
}
