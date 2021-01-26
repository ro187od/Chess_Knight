package Chess.pieces;

import Chess.utils.Position;

public class Rook extends ChessPiece {

    public Rook(Position position) {
        super(position);
    }

    @Override
//    проверка хода ладьи
    public boolean canIGoThisWay(Position destinationPos) {
        return this.position.getNumberPos() == destinationPos.getNumberPos() ||
                this.position.getLetterPos() == destinationPos.getLetterPos();
    }
}

