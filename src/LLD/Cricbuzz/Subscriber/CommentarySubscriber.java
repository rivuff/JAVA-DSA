package LLD.Cricbuzz.Subscriber;

import LLD.Cricbuzz.Producer.Producer;

import java.util.ArrayList;
import java.util.List;

public class CommentarySubscriber implements Subscriber {

    private List<String> commentaries;

    public CommentarySubscriber(){
        this.commentaries = new ArrayList<>();
    }


    @Override
    public void update(Producer producer) {
        this.commentaries.add(producer.getMatchData().getCommentaries().get(producer.getMatchData().getCommentaries().size()-1));
    }

}
