package LLD.Cricbuzz.Producer;

import LLD.Cricbuzz.Subscriber.Subscriber;
import LLD.Cricbuzz.model.Match;

public interface Producer {
    Match getMatchData();

    void addSubscriber(Subscriber subscriber);

    void removeSubscriber(Subscriber subscriber);

    void notifySubscriber();
}
