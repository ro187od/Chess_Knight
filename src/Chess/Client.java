package Chess;

import Chess.pieces.Knight;
import Chess.pieces.Rook;
import Chess.utils.Position;

public class Client {
    public static void main(String[] args) {
        checkKnight();
        checkRook();
    }
//
    private static void checkKnight() {
        System.out.println("Введите позицию фигуры: ");
        Position sourcePosition = new Position();
        Knight knight = new Knight(sourcePosition);

        System.out.println("Введите куда фигура хочет походить: ");
        Position destinationPosition = new Position();


        if (knight.canIGoThisWay(destinationPosition)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static void checkRook() {
        System.out.println("Введите координаты ладьи");
        Position sourcePosition = new Position();
        Rook rook = new Rook(sourcePosition);

        System.out.println("Введите куда ладья хочет походить: ");
        Position destinationPosition = new Position();

        if (rook.canIGoThisWay(destinationPosition)) {
            System.out.println("YES");
            return;
        }

        System.out.println("NO");
    }
}

