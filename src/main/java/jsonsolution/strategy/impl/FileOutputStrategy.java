package jsonsolution.strategy.impl;

import jsonsolution.strategy.PrintJsonStrategy;
import lombok.extern.slf4j.Slf4j;

import java.io.FileWriter;
import java.io.IOException;

@Slf4j
public class FileOutputStrategy implements PrintJsonStrategy {
    private static final String FILE_NAME = "output.txt";

    @Override
    public void output(String json) {
        try (FileWriter writer = new FileWriter(FILE_NAME, false)) {
            writer.write(json);
        } catch (IOException e) {
            log.error("Error rewrite file:\n", e);
        }
    }
}
