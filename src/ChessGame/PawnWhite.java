package ChessGame;

public class PawnWhite extends ChessPiece implements Move{
    private Move move;

    public PawnWhite(){
        this.move = new PawnMove();
    }

    @Override
    public int getPosX() {
        return super.getPosX();
    }

    @Override
    public void setPosX(int posX) {
        super.setPosX(posX);
    }


    @Override
    public void DoMove(){
        this.move.DoMove();
    }

}
