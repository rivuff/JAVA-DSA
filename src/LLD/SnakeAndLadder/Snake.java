package LLD.SnakeAndLadder;

public class Snake extends SpecialEntity{
    public Snake(int start, int end){
        super(start,end);
    }

    @Override
    public String getID() {
        return "S" + this.getEndPosition();
    }

}
