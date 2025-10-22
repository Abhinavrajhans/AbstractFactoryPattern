package observerPattern.CricBuzz.good.producers;

import observerPattern.CricBuzz.good.models.Match;
import observerPattern.CricBuzz.good.subscribers.Subscriber;

public interface Producer {

    Match getMatch();


    void subscribe(Subscriber subscriber);

    void unsubscribe(Subscriber subscriber);

    void notifySubscribers();
}
