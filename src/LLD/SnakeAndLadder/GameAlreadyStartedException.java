package LLD.SnakeAndLadder;

public class GameAlreadyStartedException extends Exception{
    public GameAlreadyStartedException(String message) {
        super(message);
    }
}
