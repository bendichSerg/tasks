package jsonsolution.jsonoutput.strategyinterface.impl;

import jsonsolution.jsonoutput.strategyinterface.PrintJsonStrategy;

import java.io.FileWriter;
import java.io.IOException;

public class FileOutputStrategy implements PrintJsonStrategy {
    private static final String FILE_NAME = "output.json";

    @Override
    public void output(String json) {
        try (FileWriter writer = new FileWriter(FILE_NAME, false)) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
