package ChessGame;

abstract public class ChessPiece {
    private enum color{
        white,
        black
    };
    private String character;
    private int posX;
    private int posY;

    public void setCharacter(String character){
        this.character = character;
    }
    public String getCharacter(){
        return character;
    }

    public void setPosX(int posX){
        this.posX= posX;
    }

    public int getPosX(){
        return posX;
    }

    public int getPosY(){
        return posY;
    }

    public void setPosY(int posY){
        this.posY = posY;
    }

}
