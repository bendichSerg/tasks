package json_solution.data_work;

import json_solution.data_work.print_strategy.PrintJsonStrategy;

import java.io.FileWriter;
import java.io.IOException;

public class FileOutputStrategy implements PrintJsonStrategy {
    private String fileName = "output.json";

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    @Override
    public void output(String json) {
        try (FileWriter writer = new FileWriter("output.json", false)) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
