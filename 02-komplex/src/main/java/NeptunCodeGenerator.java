package main.java;

public class NeptunCodeGenerator {
    private static int counter = 0;
    public static int getNextCounter() {
        return counter++;
    }

    private NeptunCodeGenerator() {
    }
}
