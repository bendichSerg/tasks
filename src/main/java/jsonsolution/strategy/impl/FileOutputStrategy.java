package jsonsolution.strategy.impl;

import jsonsolution.strategy.Printer;

import java.io.FileWriter;
import java.io.IOException;

public class FileOutputStrategy implements Printer {
    private static final String FILE_NAME = "output.txt";

    @Override
    public void output(String line) {
        try (FileWriter writer = new FileWriter(FILE_NAME, false)) {
            writer.write(line);
        } catch (IOException e) {
            System.out.println("Error rewrite file:\n" + e.getMessage());
        }
    }
}
