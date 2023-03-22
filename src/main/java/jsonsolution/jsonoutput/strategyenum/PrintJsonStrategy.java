package jsonsolution.jsonoutput.strategyenum;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum PrintJsonStrategy implements jsonsolution.jsonoutput.strategyinterface.PrintJsonStrategy {
    CONSOLE_OUTPUT_STRATEGY("console") {
        @Override
        public void output(String json) {
            System.out.println(json);
        }
    },
    FILE_OUTPUT_STRATEGY("file") {
        @Override
        public void output(String json) {
            try (FileWriter writer = new FileWriter("output.json", false)) {
                writer.write(json);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    };
    private final String outputStrategy;

    private PrintJsonStrategy(String arg) {
        this.outputStrategy = arg;
    }

    private static final Map<String, PrintJsonStrategy> args = Arrays.stream(PrintJsonStrategy.values())
            .collect(Collectors.toMap(k -> k.outputStrategy, v -> v));

    public static PrintJsonStrategy getStrategyByName(String arg) {
        return args.get(arg);
    }

}

