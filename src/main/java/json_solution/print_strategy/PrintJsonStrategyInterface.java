package json_solution.print_strategy;

import java.io.FileWriter;
import java.io.IOException;

public interface PrintJsonStrategyInterface {

    static void keyboardOutput(String json) {
        System.out.println(json);
    }

    static void fileOutput(FileWriter writer, String json) throws IOException {
        writer.write(json);
    }

}
