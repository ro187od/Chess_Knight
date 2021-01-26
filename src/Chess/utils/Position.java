package Chess.utils;

import java.util.Scanner;

public class Position {
//    создаём приватные переменные для записи позиции
    private char letterPos;
    private char numberPos;
//  создаём инициализацию класса
    public Position(char letterPos, char numberPos) {
        setDefaultPosition(letterPos, numberPos);
    }

    public Position() {
        Scanner in = new Scanner(System.in);
        String positionFromUser = in.next();
        if (isPositionCorrect(positionFromUser) && !isPositionOutOfDesk(positionFromUser)) {
            setDefaultPosition(positionFromUser.charAt(0), positionFromUser.charAt(1));
        } else {
            System.out.println("Введенные данные не корректны, задана позиция по умолчанию (А1)");
            setDefaultPosition('A', '1');
        }
    }
//  вызывается при инициализации класса
    private void setDefaultPosition(char a, char c) {
        this.letterPos = a;
        this.numberPos = c;
    }

    private boolean isPositionOutOfDesk(String positionFromUser) {
        return positionFromUser.charAt(0) <= 'H' && positionFromUser.charAt(1) <= 8;
    }
//    проверка ошибки позиции
    private boolean isPositionCorrect(String positionFromUser) {
        if (positionFromUser.length() > 2) {
            System.out.println("Длина позиции слишком большая!");
            return false;
        }

        if (positionFromUser.charAt(0) > 90 || positionFromUser.charAt(0) < 65) {
            System.out.println("Буквенное значение позиции не корректно!");
            return false;
        }

        if (positionFromUser.charAt(1) > '8' || positionFromUser.charAt(1) < '1') {
            System.out.println("Цифровое значение позиции не корректно!");
            return false;
        }

        return true;
    }

//  прочитать про геттеры сеттеры
    public char getLetterPos() {
        return letterPos;
    }

    public void setLetterPos(char letterPos) {
        this.letterPos = letterPos;
    }

    public char getNumberPos() {
        return numberPos;
    }

    public void setNumberPos(char numberPos) {
        this.numberPos = numberPos;
    }
}
