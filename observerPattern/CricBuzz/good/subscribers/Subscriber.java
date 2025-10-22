package observerPattern.CricBuzz.good.subscribers;

import observerPattern.CricBuzz.good.producers.Producer;

public interface Subscriber {
    void update(Producer producer);
}
