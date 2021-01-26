package MaxElem;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();
        arrayService.inputArray();
        arrayService.inputRange();
        arrayService.findAndPrintMaxElementWithIndex();
    }
}
