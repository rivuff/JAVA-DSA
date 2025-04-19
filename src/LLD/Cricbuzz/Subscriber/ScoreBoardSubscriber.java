package LLD.Cricbuzz.Subscriber;

import LLD.Cricbuzz.Producer.Producer;
import LLD.Cricbuzz.model.Innings;
import LLD.Cricbuzz.model.Match;

public class ScoreBoardSubscriber implements Subscriber{
    private Match match;

    public ScoreBoardSubscriber(Match match){
        this.match = match;
    }

    public void update(Producer producer){
        boolean isFirstInnings =producer.getMatchData().isFirstInnings() ? true : false;

        Innings inningsProducer = isFirstInnings ? producer.getMatchData().getInnings1() : producer.getMatchData().getInnings2();

        Innings inningsSubscriber = isFirstInnings ? match.getInnings1() : match.getInnings2();

        inningsSubscriber.setCurrentWickets(inningsProducer.getCurrentWickets());
        inningsSubscriber.setCurrentOver(inningsProducer.getCurrentOver());
        inningsSubscriber.setCurrentRun(inningsProducer.getCurrentRun());
        inningsSubscriber.setCurrentBall(inningsProducer.getCurrentBall());
    }

}
