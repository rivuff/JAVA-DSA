package LLD.Cricbuzz.model;

public class Innings {
    private String teamId;
    private String currentRun;
    private String currentOver;
    private String currentWickets;
    private String currentBall;

    private Innings(String teamId, String currentBall, String currentOver, String currentRun, String currentWickets){
        this.teamId = teamId;
        this.currentBall = currentBall;
        this.currentOver = currentOver;
        this.currentRun = currentRun;
        this.currentWickets = currentWickets;
    }


    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getCurrentRun() {
        return currentRun;
    }

    public void setCurrentRun(String currentRun) {
        this.currentRun = currentRun;
    }

    public String getCurrentOver() {
        return currentOver;
    }

    public void setCurrentOver(String currentOver) {
        this.currentOver = currentOver;
    }

    public String getCurrentWickets() {
        return currentWickets;
    }

    public void setCurrentWickets(String currentWickets) {
        this.currentWickets = currentWickets;
    }

    public String getCurrentBall() {
        return currentBall;
    }

    public void setCurrentBall(String currentBall) {
        this.currentBall = currentBall;
    }

}
