package ua.lviv.iot.algo.part1.lab_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class TextReader {

    public String inPutTextReader() throws IOException {
        BufferedReader bufferedReader
                = new BufferedReader(new InputStreamReader(System.in));
        String strings;
        System.out.println("Enter lines of text");
        strings = bufferedReader.readLine();

        return strings;
    }

    public  int getMaxLengthOfWord() {
        Scanner scanner = new Scanner(System.in);
        int maxLengthOfWord = 0;
        boolean isCorrect = true;

        while (isCorrect) {
            System.out.println("Enter max length of word: ");
            String input = scanner.nextLine();
            try {
                maxLengthOfWord = Integer.parseInt(input);
                if (maxLengthOfWord >= 1) {
                    isCorrect = false;
                } else {
                    System.out.println("length should be greater or equal 1");
                }
            } catch (NumberFormatException e) {
                System.out.println("incorrect type");
            }
        }
        return maxLengthOfWord;
    }
}