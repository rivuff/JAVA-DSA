package LLD.SnakeAndLadder;

import lombok.Getter;
import lombok.Setter;

public class Player{

    @Getter
    @Setter
    int position;

    @Getter
    String name;

    public Player(String name){
        this.name=name;
        this.position= 0;
    }

    public int getPosition(){
        return position;
    }

    public void setPosition(int position){
        this.position = position;
    }

    public String getName(){
        return name;
    }
}