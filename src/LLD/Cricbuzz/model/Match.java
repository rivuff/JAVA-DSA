package LLD.Cricbuzz.model;

import java.util.List;

public class Match {

    private String matchId;
    private Innings innings1;
    private Innings innings2;
    private String team1;
    private String team2;
    private String date;
    private String venue;
    private List<String> commentaries;

    public List<String> getCommentaries() {
        return commentaries;
    }

    public void setCommentaries(List<String> commentaries) {
        this.commentaries = commentaries;
    }

    public void setFirstInnings(boolean firstInnings) {
        isFirstInnings = firstInnings;
    }


    private boolean isFirstInnings;

    public Match(String matchId,Innings innings1, Innings innings2, String team1, String team2, String date, String venue) {
        this.matchId = matchId;
        this.innings1 = innings1;
        this.innings2 = innings2;
        this.team1 = team1;
        this.team2 = team2;
        this.date = date;
        this.venue = venue;
        this.isFirstInnings = true;
    }

    public boolean isFirstInnings(){
        return isFirstInnings;
    }

    public void setIsFirstInnings(boolean isFirstInnings){
        this.isFirstInnings = isFirstInnings;
    }

    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public Innings getInnings1() {
        return innings1;
    }

    public void setInnings1(Innings innings1) {
        this.innings1 = innings1;
    }

    public Innings getInnings2() {
        return innings2;
    }

    public void setInnings2(Innings innings2) {
        this.innings2 = innings2;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

}
