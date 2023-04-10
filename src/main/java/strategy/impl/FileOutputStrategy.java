package jsonsolution.strategy.impl;

import jsonsolution.strategy.PrinterStrategy;

import java.io.FileWriter;
import java.io.IOException;

public class FileOutputStrategy implements PrinterStrategy {
    private static final String FILE_NAME = "output.txt";

    @Override
    public void output(String lineToOutput) {
        try (FileWriter writer = new FileWriter(FILE_NAME, false)) {
            writer.write(lineToOutput);
        } catch (IOException e) {
            System.out.println("Error rewrite file, no " + FILE_NAME + " found:\n" + e.getMessage());
        }
    }
}
