package Chess.pieces;

import Chess.utils.Position;

public abstract class ChessPiece {

    protected Position position;

    public ChessPiece(Position position) {
        this.position = position;
    }

    public boolean canIGoThisWay(Position destinationPos) {
        return false;
    }
}
