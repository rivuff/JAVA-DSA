package LLD.Cricbuzz.Producer;

import LLD.Cricbuzz.Subscriber.ScoreBoardSubscriber;
import LLD.Cricbuzz.Subscriber.Subscriber;
import LLD.Cricbuzz.model.Match;

import java.util.ArrayList;
import java.util.List;

public class ICCScoreProducer implements Producer {
    private Match match;
    private List<Subscriber> subscribers;

    public ICCScoreProducer(Match match, ScoreBoardSubscriber scoreBoardSubscriber){
       this.subscribers = new ArrayList<>();
    }

    public void scoreUpdate(){
        this.notifySubscriber();
    }

    @Override
    public Match getMatchData() {
        return this.match;
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscriber() {

    }
}
