package MaxElem;

import java.util.Scanner;

public class ArrayService {

    private int localArray[] = new int[100];
    private int leftBorder, rightBorder;
    private Scanner in = new Scanner(System.in);

    public void inputArray() {
        System.out.println("Введите количество элементов массива");
        int length = in.nextInt();
        if (!isCorrectArrayLength(length)) {
            System.out.println("Некорректно введена длина массива");
            inputArray();
        }
        localArray = new int[length];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++) {
            localArray[i] = in.nextInt();
        }
    }

    private boolean isCorrectArrayLength(int length) {
        return length > 0;
    }

    public void inputRange() {
        System.out.println("Введите диапазон:");

        System.out.print("Левая граница: ");
        this.leftBorder = in.nextInt() - 1;

        System.out.print("Правая граница: ");
        this.rightBorder = in.nextInt() - 1;

        if (isOutOfBound(rightBorder) || isOutOfBound(leftBorder)) {
            System.out.println("Выход за границы массива, попробуй еще раз");
            inputRange();
        }
    }

    private boolean isOutOfBound(int border) {
        return !(border < 0 || border >= localArray.length);
    }

    public void findAndPrintMaxElementWithIndex() {
        int maxElementValue = -1001, maxElementIndex = 0;

        for (int i = leftBorder; i <= rightBorder ; i++) {
            if (localArray[i] > maxElementValue) {
                maxElementValue = localArray[i];
                maxElementIndex = i;
            }
        }

        if (isMaxElementExists(maxElementValue)) {
            System.out.println("Максимальный элемент и его индекс: " +
                    maxElementValue + " " + maxElementIndex + 1);
        } else {
            System.out.println("Максимального элемента не существует");
        }
    }

    private boolean isMaxElementExists(int value) {
        return value != -1001;
    }
}
