package IPA;


import java.util.Scanner;

class Player {
    private int playerId;
    private String skill;
    private String level;
    private int points;

    public Player(int playerId, String skill, String level, int points ){
        this.playerId = playerId;
        this.skill = skill;
        this.level = level;
        this.points = points;
    }

    public int getPlayerId(){
        return playerId;
    }

    public void setPlayerId(int playerId){
        this.playerId = playerId;
    }

    public String getSkill(){
        return skill;
    }

    public void  setSkill(String skill){
        this.skill = skill;
    }

    public String getLevel(){
        return level;
    }

    public void setLevel(String level){
        this.level = level;
    }

    public int getPoints(){
        return points;
    }

    public void setPoints(int points){
        this.points = points;
    }
}

public class IPAEleven {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        Player[] players = new Player[4];

        for(int i =0;i<players.length; i++){
            int a = scr.nextInt();scr.nextLine();
            String b = scr.nextLine();
            String c = scr.nextLine();
            int d = scr.nextInt();scr.nextLine();

            players[i] = new Player(a,b,c,d);
        }
        String s = scr.nextLine();
        String l = scr.nextLine();

        int ans = findPointsForGivenSkill(players, s);
        if (ans> 0){
            System.out.println(ans);
        }else {
            System.out.println("The given Skill is not available");
        }

        Player player = getPlayerBasedOnLevel(l, s, players);

        if(player == null){
            System.out.println("The given Skill is not available");
        }else {
            System.out.println(player.getPlayerId());
        }
    }

    static int findPointsForGivenSkill(Player[] players, String skill){
        int totalPoint = 0;
        for(Player player: players){
            if(skill.equals(player.getSkill())){
                totalPoint+= player.getPoints();
            }
        }

        return totalPoint;
    }

    static Player getPlayerBasedOnLevel(String level, String skill, Player[] players){
        for(Player player : players){
            if(player.getSkill().equals(skill) && player.getLevel().equals(level) && player.getPoints() > 20){
                return player;
            }
        }

        return null;
    }


}
