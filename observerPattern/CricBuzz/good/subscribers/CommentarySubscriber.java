package observerPattern.CricBuzz.good.subscribers;

import observerPattern.CricBuzz.good.producers.Producer;

import java.util.ArrayList;
import java.util.List;

public class CommentarySubscriber implements Subscriber{

    private List<String> commentary;
    private List<Producer> producers;


    public CommentarySubscriber(List<Producer> producers) {
        this.commentary = new ArrayList<>();
        for (Producer producer : producers) {
           producer.subscribe(this);
        }
        this.producers = producers;
    }

    @Override
    public void update(Producer producer) {
        this.commentary.add(producer.getMatch().getCommentary().getLast());
    }
}
