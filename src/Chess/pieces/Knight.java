package Chess.pieces;

import Chess.utils.Position;

public class Knight extends ChessPiece {
//    узнать про композицию
//    узнать про метод super
    public Knight(Position position) {
        super(position);
    }

//    прочитать
    @Override
//    проверка хода коня
    public boolean canIGoThisWay(Position destinationPos) {
        if ((position.getLetterPos() + 2 == destinationPos.getLetterPos()) &&
                (position.getNumberPos() - 1 == destinationPos.getNumberPos() ||
                        position.getNumberPos() + 1 == destinationPos.getNumberPos())) {
            return true;
        }

        if ((position.getLetterPos() - 2 == destinationPos.getLetterPos()) &&
                (position.getNumberPos() - 1 == destinationPos.getNumberPos() ||
                        position.getNumberPos() + 1 == destinationPos.getNumberPos())) {
            return true;
        }

        if ((position.getNumberPos() + 2 == destinationPos.getNumberPos()) &&
                (position.getLetterPos() - 1 == destinationPos.getLetterPos() ||
                        position.getLetterPos() + 1 == destinationPos.getLetterPos())) {
            return true;
        }

        if ((position.getNumberPos() - 2 == destinationPos.getNumberPos()) &&
                (position.getLetterPos() - 1 == destinationPos.getLetterPos() ||
                        position.getLetterPos() + 1 == destinationPos.getLetterPos())) {
            return true;
        }

        return false;
    }
}
