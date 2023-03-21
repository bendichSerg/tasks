package json_solution.data_work;

import json_solution.data_work.print_strategy.PrintJsonStrategyInterface;

import java.io.FileWriter;
import java.io.IOException;

public class FileOutputStrategy implements PrintJsonStrategyInterface {

    @Override
    public void output(String json) {
        try (FileWriter writer = new FileWriter("output.json", false)) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
